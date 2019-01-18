package com.example.snapchat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import Pages.loginPage;

public class ortnec {

    protected WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        //as I understood this setting for install application on device
//        File snapChat = new File("/home/sergey/Downloads/Snapchat_v10.48.1.0_apkpure.com.apk");
//        cap.setCapability("app", snapChat);

        //Real device
        cap.setCapability("deviceName", "Galaxy J5");
        cap.setCapability("udid", "5200489cfe425483");
        cap.setCapability(CapabilityType.VERSION, "8.1.0");

        //Settings for emulator
//        cap.setCapability("deviceName", "Pixel_2_API_27");
//        cap.setCapability("udid", "emulator-5554");
//        cap.setCapability(CapabilityType.VERSION, "8.1");

        //Setting for launch application
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.snapchat.android");
        cap.setCapability("appActivity", "com.snapchat.android.LandingPageActivity");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new RemoteWebDriver(url, cap);
    }

    @Test
    public void login() throws InterruptedException {

        //click "Log in" button
        Thread.sleep(2000);
//        System.out.print(Pages.loginPage.loginButton);
//        Pages.loginPage.loginButton.click();
        driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click();

        //Write Email
//        loginPage.emailField.sendKeys("seregani4");
        driver.findElements(By.xpath("//android.widget.EditText[@index='0']")).get(0).sendKeys("seregani4");

        //Write password
//        loginPage.passwordField.sendKeys("capserfu12");
        driver.findElements(By.xpath("//android.widget.EditText[@index='0']")).get(1).sendKeys("capserfu12");

        //click second "Log in" button
//        loginPage.secondLoginButton.click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();
        Thread.sleep(10000);
        //Allow buttons
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
        //My profile button
        driver.findElement(By.xpath("//android.widget.ImageView[@index='1']")).click();
        //Add friends button
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='3']")).click();
        //Search field
        driver.findElements(By.xpath("//android.widget.EditText[@index='0']")).get(0).sendKeys("sol_marl");
        //Add friend sol_marl
        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();



        Thread.sleep(12000);
    }

    @After
    public void End() {
        driver.quit();
    }
}