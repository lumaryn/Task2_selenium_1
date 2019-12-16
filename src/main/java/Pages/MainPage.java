package Pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MainPage extends BasePage {
    private WebDriver driver;
    private String baseUrl;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div")
    WebElement closeCoockie;

    @FindBy(xpath = "//*[@id=\"main\"]/div[4]/div/div/div/div[2]/nav/div[2]/div/div[5]/div[3]/a")
    WebElement Insurance;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    public void selectMenuItem(String itemName){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div[5]/div/div/div")));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[5]/div/div/div/div/div/div[3]"))).click();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка: "+e);
        }

      /**  boolean present;
        try {
            driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div/div/div/div/div[3]"));
            present = true;

        } catch (NoSuchElementException e) {
            present = false;
        }
        if (present == true){wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[5]/div/div/div/div/div/div[3]"))).click();

    //   menuItems = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/nav/div[2]/div/div[5]/div[3]/a")));
        //menuItems.click();
    }*/}

    public void selectInsuranceItem(String itemName){
        WebDriverWait wait = new WebDriverWait(driver, 20);
       try {
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/nav/div[2]/div/div[5]/div[3]/a")));

           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/nav/div[2]/div/div[5]/div[3]/a"))).click();
       }catch (Exception e){System.out.println("Error: "+e);}

    }
}
