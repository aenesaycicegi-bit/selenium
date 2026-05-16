package Task104;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_01_OturumAcma {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("a[href='/hesabim/']")).click();

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"AP\"]/div[1]/div/button"));

        new Actions(driver).click(loginButton).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[placeholder='E-postanızı yazın']")).sendKeys("jolib64899@getasail.com");

        // WebElement login = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("input[placeholder='E-postanızı yazın']"))));

        // login.sendKeys("jolib64899@getasail.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='update']/b")).click();

        driver.findElement(By.id("umpc")).sendKeys("Jolib.jk1");

        driver.findElement(By.cssSelector("div[class='bc']")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class='wbb_v8 lp']"))));

        driver.quit();
    }
}
