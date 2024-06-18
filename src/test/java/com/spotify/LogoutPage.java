package com.spotify;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    private AndroidDriver driver;

    public LogoutPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        WebElement settings_btn = driver.findElement(By.id("com.spotify.music:id/profileButton"));
        settings_btn.click();

        WebElement settingPrivacy_btn = driver.findElement(By.id("com.spotify.music:id/settingPrivacyButton"));
        settingPrivacy_btn.click();

        WebElement logout_btn = driver.findElement(By.id("com.spotify.music:id/logoutButton"));
        logout_btn.click();

        WebElement confrimLogout_btn = driver.findElement(By.id("com.spotify.music:id/confirmLogoutButton"));
        confrimLogout_btn.click();
    }
}
