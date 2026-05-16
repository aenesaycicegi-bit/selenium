package Task104;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_03_GecersizEposta {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("a[href='/hesabim/']")).click();

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"AP\"]/div[1]/div/button"));

        new Actions(driver).click(loginButton).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[placeholder='E-postanızı yazın']")).sendKeys("testmail@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='update']/b")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"update\"]")).getText());

        Thread.sleep(3000);

        driver.quit();
    }
}
