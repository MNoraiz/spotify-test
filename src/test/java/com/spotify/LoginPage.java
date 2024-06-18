package com.spotify;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void login() {
        WebElement login = driver.findElement(By.id("com.spotify.music:id/Login"));
        login.click();
        WebElement emailField = driver.findElement(By.id("com.spotify.music:id/email"));
        emailField.sendKeys("noraiz.trax@gmail.com");
        WebElement passwordField = driver.findElement(By.id("com.spotify.music:id/password"));
        passwordField.sendKeys("junoon100$$");
        WebElement next_btn = driver.findElement(By.id("com.spotify.music:id/next"));
        next_btn.click();
    }
}
