package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.drivers.Drivers;

import java.time.Duration;
import java.util.List;

public class BaseClass  {
  protected   WebDriver driver;
  protected   WebDriverWait wait;
    String url="https://automationexercise.com";

    protected BaseClass() {
        driver = Drivers.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        click(element);

    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        sendKeys(element,text);
    }

    public void sendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);

    }
}

