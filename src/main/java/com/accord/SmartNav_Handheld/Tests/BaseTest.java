package com.accord.SmartNav_Handheld.Tests;

import com.accord.SmartNav_Handheld.Utils.AppiumUtils;
import com.accord.SmartNav_Handheld.Utils.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseTest extends AppiumUtils {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    JSONObject configObject, appiumServerObject, deviceInfoObject, miscObject, activityNameObject;

    public static ExtentReports extent;
    public static ExtentTest test;

    public String getApkPath() {
        return apkPath;
    }

    public void setApkPath(String apkPath) {
        this.apkPath = apkPath;
    }

    public String apkPath= "D:\\Appium\\SmartNav_Handheld\\src\\test\\java\\Resources\\smartnav_2.3.2_release.apk";

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        try {
            /*configObject = jsonParser(ResourceLoader.getResourcePath("Config.json"));
            appiumServerObject = configObject.getJSONObject("AppiumServerPath");
            deviceInfoObject = configObject.getJSONObject("DeviceInfo");
            miscObject = configObject.getJSONObject("Miscellaneous");
            activityNameObject = configObject.getJSONObject("AppActivity");*/
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).replace(":","_");

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D:\\AppiumTestReports\\report_" + currentTime + ".html");
            sparkReporter.config().setReportName("Appium Test Report");
            sparkReporter.config().setDocumentTitle("Test Results");

            // Create an instance of ExtentReports
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        } catch (Exception e) {
            System.out.println("Issue with config file");
            e.printStackTrace();
        }


        //Start Appium server
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\"+System.getProperty("user.name")+"\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE).withLogOutput(System.out).build();
        service.start();

        // Set the device capabilities on which the test needs to be run on
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp(getApkPath());
        //options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\smartnav_release.apk");
        /*options.setCapability("autoGrantPermissions", miscObject.getBoolean("autoGrantPermissions"));
        options.setCapability("noReset", miscObject.getBoolean("noReset"));
        options.setCapability("appActivity", activityNameObject.getString("Activity_Name"));
        options.setCapability("newCommandTimeout", miscObject.getInt("newCommandTimeout"));*/

        options.setCapability("autoGrantPermissions", true);
        options.setCapability("noReset", false);
        options.setCapability("appActivity", "com.accord.smartnav20_v20.modules.mainActivity.MainActivity");
        options.setCapability("newCommandTimeout", 120);

        // Create an object of the AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        setActivityToMainMenu();
    }

    public void setActivityToMainMenu() {
        Activity activity = new Activity("com.accord.smartnav20_v20", "com.accord.smartnav20_v20.modules.mainActivity.MainActivity");
        driver.startActivity(activity);

    }

   public void enterLoginPassword() {
        driver.findElement(By.id(Constants.SMART_NAV_PACKAGE_NAME + "editTextNumber")).sendKeys(Constants.LOGIN_PIN);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();
        extent.flush();
    }

}
