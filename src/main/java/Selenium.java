import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Selenium {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        System.out.println(driver.getTitle()); // => "WIKI// "

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);

        WebElement searchButton = driver.findElement(By.name("search"));
        WebElement goButtom = driver.findElement(By.name("go"));

        searchButton.sendKeys("Sunes jul");
        searchButton.click();
        goButtom.click();
    }
}