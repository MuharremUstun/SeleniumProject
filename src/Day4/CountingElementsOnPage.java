package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.util.List;

public class CountingElementsOnPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Muharrem%20Ustun/IdeaProjects/SeleniumProject/src/Day3/Demo.html");

        WebElement element = driver.findElement(By.name("textbox"));
        String tagName = element.getTagName();
        System.out.println(tagName);

        driver.quit();
    }
}
