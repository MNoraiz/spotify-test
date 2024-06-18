package com.spotify;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private AndroidDriver driver;

    public SignUpPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void signUp() {
        WebElement signUp_btn = driver.findElement(By.id("com.spotify.music:id/SignUp"));
        signUp_btn.click();

        WebElement emailField = driver.findElement(By.id("com.spotify.music:id/email"));
        emailField.sendKeys("testemail@email.com");

        WebElement emailNext_btn = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        emailNext_btn.click();

        WebElement passwordField = driver.findElement(By.id("com.spotify.music:id/password"));
        passwordField.sendKeys("123456789abc@");

        WebElement passwordNext_btn = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        passwordNext_btn.click();

        WebElement monthPicker = driver.findElement(By.id("com.spotify.music:id/monthPicker"));
        monthPicker.sendKeys("Mar");

        WebElement dayPicker = driver.findElement(By.id("com.spotify.music:id/dayPicker"));
        dayPicker.sendKeys("01");

        WebElement yearPicker = driver.findElement(By.id("com.spotify.music:id/yearPicker"));
        yearPicker.sendKeys("1997");

        WebElement dobNext_btn = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        dobNext_btn.click();

        WebElement gender_btn = driver.findElement(By.id("com.spotify.music:id/male"));
        gender_btn.click();

        WebElement createAccount_btn = driver.findElement(By.id("com.spotify.music:id/createAccount"));
        createAccount_btn.click();
    }
}
