package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogleSearch {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.techno.study");

        driver.findElement(By.id("menu-item-142")).click();
//        driver.findElement(By.name("btnK")).click();
    }
}
