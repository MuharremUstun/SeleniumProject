package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumTask {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muharrem Ustun\\IdeaProjects\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Muharrem%20Ustun/IdeaProjects/SeleniumProject/src/Day3/Demo.html");

        WebElement textbox = driver.findElement(By.name("textbox"));
        textbox.sendKeys("Here is textbox.");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Abc123");

        WebElement textArea = driver.findElement(By.tagName("textarea"));
        textArea.sendKeys("Here is text area.");

        WebElement checkbox = driver.findElement(By.name("checkbox"));
        checkbox.click();

        List<WebElement> radioButton = driver.findElements(By.name("radioGroup"));
        WebElement firstRadioButton = radioButton.get(0);
//        firstRadioButton.click();
        WebElement secondRadioButton = radioButton.get(1);
//        secondRadioButton.click();
        WebElement thirdRadioButton = radioButton.get(2);
        thirdRadioButton.click();

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select dropDownList = new Select(dropdown);
        dropDownList.selectByVisibleText("Option 3");

       String string1 = textbox.getAttribute("value");
       String string2 = password.getAttribute("value");
       String string3 = textArea.getAttribute("value");
       String string4 = checkbox.getAttribute("value");
       String string5 = thirdRadioButton.getAttribute("value");
       String string6 = dropdown.getAttribute("value");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

//        driver.quit();
    }
}
