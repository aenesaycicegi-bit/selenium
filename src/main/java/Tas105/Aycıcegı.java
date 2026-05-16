package Tas105;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class Aycıcegı {

    static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("#H_a_v8 > i")).click();

        driver.findElement(By.xpath("//button[text()='Giriş Yap']")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("new-email")).sendKeys("fwlmdpgndchcajafii@kjkpc.net");

        driver.findElement(By.id("update")).click();

        Thread.sleep(3000);


        driver.findElement(By.id("umpc")).sendKeys("sanırsınEjderha1");

        Thread.sleep(3000);

        driver.findElement(By.id("update")).click();

        driver.findElement(By.cssSelector("a.mi.fvl[href='favori-listem/']")).click();


        Thread.sleep(1000);

        WebElement cıktı = driver.findElement(
                By.xpath("//p[text()='Listenizde Hiç Ürün Yok']"));

        System.out.println(cıktı.getText());


        Thread.sleep(10000);

        driver.quit();




    }
}
