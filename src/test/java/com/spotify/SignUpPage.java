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
        WebElement signUpButton = driver.findElement(By.id("com.spotify.music:id/SignUp"));
        signUpButton.click();

        WebElement emailField = driver.findElement(By.id("com.spotify.music:id/email"));
        emailField.sendKeys("testemail@email.com");

        WebElement emailNextButton = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        emailNextButton.click();

        WebElement passwordField = driver.findElement(By.id("com.spotify.music:id/password"));
        passwordField.sendKeys("123456789abc@");

        WebElement passwordNextButton = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        passwordNextButton.click();

        WebElement monthPicker = driver.findElement(By.id("com.spotify.music:id/monthPicker"));
        monthPicker.sendKeys("Mar");

        WebElement dayPicker = driver.findElement(By.id("com.spotify.music:id/dayPicker"));
        dayPicker.sendKeys("01");

        WebElement yearPicker = driver.findElement(By.id("com.spotify.music:id/yearPicker"));
        yearPicker.sendKeys("1997");

        WebElement dobNextButton = driver.findElement(By.id("com.spotify.music:id/emailNext"));
        dobNextButton.click();

        WebElement genderButton = driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']"));
        genderButton.click();

        WebElement createAccountButton = driver.findElement(By.id("com.spotify.music:id/createAccount"));
        createAccountButton.click();
    }
}
