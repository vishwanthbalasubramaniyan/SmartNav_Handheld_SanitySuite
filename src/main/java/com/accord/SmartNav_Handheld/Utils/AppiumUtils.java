package com.accord.SmartNav_Handheld.Utils;

import com.accord.SmartNav_Handheld.LoginPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppiumUtils {

	public static List<HashMap<String, String>> getJsonData(String strJsonFilePath) throws IOException{
		//"D://Projects//Automation//SmartNav//SmartNav_Handheld//src//test//java//Resources//WaypointData.json"
		String jsonContent = FileUtils.readFileToString(new File(strJsonFilePath), StandardCharsets.UTF_8);
			ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {});
	}

	public static void scrollUntilElement(AndroidDriver driver, String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"))"));
	}

	public boolean scrollDown(AndroidDriver driver){
		return (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"left", 100, "top", 100, "width", 200, "height", 200,
				"direction", "down",
				"percent", 3.0
		));
	}

	public void longPressOnElement(AndroidDriver driver, WebElement webElement) {
		((JavascriptExecutor) driver).executeScript("mobile:longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)webElement).getId(),
						"duration",2000));
	}

	public void login(AndroidDriver driver, String strLoginPIN) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setPin(strLoginPIN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static List<HashMap<String , String >> getDataFromDataBase(String strTableName){
		//Path to the Database file to be provided here
		// String jdbcUrl = "jdbc:sqlite:\\D:\\Projects\\IRNSS\\SmartNav DB Backup\\SP1_4X6Zones\\SmartNavDB";
		String jdbcUrl = "jdbc:sqlite:"+ System.getProperty("user.dir")+ File.separator +"json_data.sqlite" ;
		// Create a List to store the data
		List<HashMap<String, String>> dataList = new ArrayList<>();

		try {
		// Establish a database connection
			Connection connection = DriverManager.getConnection(jdbcUrl);

		// Create a SQL statement
			Statement statement = connection.createStatement();

		// Execute a SELECT query
			String query = "SELECT * FROM " + strTableName;
			ResultSet resultSet = statement.executeQuery(query);

		// Iterate through the result set and store data in HashMaps
			while (resultSet.next()) {
				HashMap<String, String > rowMap = new HashMap<>();
				int columnCount = resultSet.getMetaData().getColumnCount();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = resultSet.getMetaData().getColumnName(i);
					Object columnValue = resultSet.getObject(i);
					rowMap.put(columnName, columnValue.toString());
				}
				dataList.add(rowMap);
			}

		// Close the ResultSet, Statement, and Connection
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}

	public static HashMap<String, String> parseTable(String databaseFile, String tableName) {
		HashMap<String, String> resultMap = new HashMap<>();



		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + databaseFile)) {
			String query = "SELECT * FROM \"" + tableName + "\";";
			try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
				while (resultSet.next()) {
					String key = resultSet.getString(1); // Assuming the first column is the key
					String value = resultSet.getString(2); // Assuming the second column is the value



					resultMap.put(key, value);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return resultMap;
	}

}
