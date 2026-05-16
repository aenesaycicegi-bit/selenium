package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.BaseDriver.driver;

public class task1010 {
    static void main(String[] args) throws InterruptedException {

        //gamze

        //dogru giriş

        driver.get("https://www.akakce.com/");
        driver.findElement(By.xpath("//a[@title='Hesabım']")).click();
        driver.findElement(By.xpath("//button[text()=\"Giriş Yap\"]")).click();
        driver.findElement(By.xpath("//input[2][@value]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[2][@value]")).sendKeys("nosolef760@acanok.com");
        driver.findElement(By.cssSelector("#update")).click();
        driver.findElement(By.cssSelector("#name")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("gamze");
        driver.findElement(By.cssSelector("#surname")).click();
        driver.findElement(By.cssSelector("#surname")).sendKeys("ozakin");
        driver.findElement(By.cssSelector("#umpc")).click();
        driver.findElement(By.cssSelector("#umpc")).sendKeys("Gamze1224**");
        driver.findElement(By.cssSelector("#rnufpca")).click();
        driver.findElement(By.cssSelector("#rnufnee")).click();
        driver.findElement(By.cssSelector("#update")).click();

        if (driver.findElement(By.cssSelector(".ver-cod")).isDisplayed()) {
            System.out.println("Test Başarılı doğrulama sayfasına yönlendirildiniz.");
        } else System.out.println("Test başarısız inputları kontrol et");

        driver.quit();

    }
}
