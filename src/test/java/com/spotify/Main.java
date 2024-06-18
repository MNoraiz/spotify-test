package com.spotify;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        connection();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.signUp();

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();


    }

    public static void connection() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Tarbooza")
                .setUdid("dc36e413")
                .setPlatformName("Android")
                .setPlatformVersion("13")
                .setAppPackage("com.spotify.music")
                .setAppActivity("com.spotify.music.SpotifyMainActivity")
                .setAutomationName("UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, options);
    }
}
