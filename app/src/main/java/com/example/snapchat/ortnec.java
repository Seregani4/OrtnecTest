package com.example.snapchat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

public class ortnec {

    WebDriver driver;
    AppiumDriver appiumDriver;
    WebDriver driver2;


    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

//        File snapChat = new File("/home/sergey/Downloads/Snapchat_v10.48.1.0_apkpure.com.apk");
//        cap.setCapability("app", snapChat);

        cap.setCapability("deviceName", "Galaxy J5");
        cap.setCapability("udid", "5200489cfe425483");
        cap.setCapability(CapabilityType.VERSION, "8.1.0");
//        cap.setCapability("deviceName", "Pixel_2_API_27");
//        cap.setCapability("udid", "emulator-5554");
//        cap.setCapability(CapabilityType.VERSION, "8.1");

        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.snapchat.android");
        cap.setCapability("appActivity", "com.snapchat.android.LandingPageActivity");

//        cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
//        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    }

    @Test
    public void launchApplication() throws InterruptedException {
//        System.out.print("I work");
        Thread.sleep(5000);
        appiumDriver.launchApp();
        driver2.findElement(By.name("Sign Up")).click();
        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }
}