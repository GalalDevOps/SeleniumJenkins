package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest 
{
 WebDriver driver ;
    @Test
    public void firstRun(){
        driver = new ChromeDriver ();
        driver.navigate().to("https://github.com/GalalDevOps");

    }
}