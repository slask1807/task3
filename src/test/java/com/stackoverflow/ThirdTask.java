package com.stackoverflow;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ThirdTask {
    @Test
    public void thirdTest() {
        System.setProperty("webdriver.chrome.driver", "D:/rex/src/main/resources/chromedriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        WebElement Autocomplete = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[2]/a"));
        Autocomplete.click();
        driver.switchTo().frame(0);
        WebElement TagsInput = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
        TagsInput.sendKeys("a");
        TagsInput.sendKeys(Keys.DOWN, Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
        driver.getPageSource().contains("Asp");
        driver.quit();
    }
}
