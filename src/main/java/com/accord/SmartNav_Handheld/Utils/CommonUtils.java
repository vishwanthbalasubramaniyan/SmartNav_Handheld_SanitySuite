package com.accord.SmartNav_Handheld.Utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class CommonUtils {

    public static void scrollToEnd(AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        int duration = 2000;
        TouchAction<?> action = new TouchAction<>(driver);
        while (startY > endY) {
            action.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

            startY  -= 50; // Adjust the scroll distance as needed
        }
    }
    public static void scrollToTop(AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.2);
        int endY = (int) (size.height * 0.8);
        int duration = 2000;

        TouchAction<?> action = new TouchAction<>(driver);
        while (startY < endY) {
            action.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

            startY += 50; // Adjust the scroll distance as needed
        }
    }


    public static void scrollOneElement(AndroidDriver driver) {
        WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/" +
                "android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView"));

        // Get the size of the RecyclerView
        int recyclerViewWidth = element.getSize().getWidth();
        int recyclerViewHeight = element.getSize().getHeight();

        // Define the start and end coordinates for scrolling
        int startX = recyclerViewWidth / 2;
        int startY = (int) (recyclerViewHeight * 0.8); // Starting from 80% of the RecyclerView height
        int endY = (int) (recyclerViewHeight * 0.2); // Scrolling to 20% of the RecyclerView height

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Wait for a short duration
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public static List<String> getElementList(AndroidDriver driver, String strXpath){

        List<WebElement> allElements = new ArrayList<>(driver.findElements(By.xpath(strXpath)));
        List<WebElement> currElements = new ArrayList<>(allElements);
        List<WebElement> prevElements = new ArrayList<>();

        while(!prevElements.containsAll(currElements)){

            prevElements = new ArrayList<>(currElements);
            // Perform the scroll down action
            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
            // Find the new elements
            currElements = driver.findElements(By.xpath(strXpath));
            // Add the new elements to the list of all elements
            allElements.addAll(currElements);
        }

        //Extract the element name from the web elements
        LinkedHashSet<String> hsElementNames = new LinkedHashSet<>();
        for (WebElement element : allElements) {
            hsElementNames.add(element.getText());
        }

        return new ArrayList<>(hsElementNames);

    }



}

