package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class BasePage {
    WebDriver driver;

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public void waitToBeClickable(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void fillField(WebElement element, String value, WebDriver driver) {
        try {
            waitToBeClickable(driver, element);
            element.clear();
        }catch (Exception e) {
            System.out.println("Данный элемент невозможно очистить "+e);
        }
        element.sendKeys(value);
    }

    public void checkFillField(String value, WebElement element) {
      try {
          assertEquals(value, element.getAttribute("value"));
      }catch(Exception e){
          e.printStackTrace();
      }
    }

    public void clicks(WebElement element) {
        try {
            element.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            element.click();
        }
    }
}
