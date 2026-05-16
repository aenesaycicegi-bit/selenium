package Task104;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_04_NullEpostaVeSifre {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.akakce.com/");

        driver.findElement(By.cssSelector("a[href='/hesabim/']")).click();

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"AP\"]/div[1]/div/button"));

        new Actions(driver).click(loginButton).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='update']/b")).click();

        WebElement element = driver.findElement(
                By.cssSelector("div.input-wrapper.er")
        );

        String errorMessage = element.getAttribute("data-e");

        System.out.println(errorMessage);

        Thread.sleep(3000);

        driver.quit();
    }
}
