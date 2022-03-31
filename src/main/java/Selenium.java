import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Selenium {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.svt.se/");

        System.out.println(driver.getTitle()); // => "Google"

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        // Skriv något i textrutan
        searchBox.sendKeys("Selenium");
        searchButton.click();

        driver.getTitle();

        String urlValue = driver.getCurrentUrl();

        System.out.println(searchBox.getAttribute("value"));

        searchButton.getText();
        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"

        driver.quit();
    }
}