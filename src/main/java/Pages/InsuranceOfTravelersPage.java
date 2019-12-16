package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsuranceOfTravelersPage {
    WebDriver driver;

    @FindBy (xpath = "")
    WebElement insuranceSum;

    @FindBy (xpath = "")
    WebElement button;

    WebElement element = driver.findElement(By.xpath("//*[@name='insured0_surname']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='insured0_surname']")));
        element.click();
        element.sendKeys("Aplanovich");


    element = driver.findElement(By.xpath("//*[@name='insured0_name']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='insured0_name']")));
         element.click();
         element.sendKeys("Aplan");

    element = driver.findElement(By.xpath("//*[@name='insured0_birthDate']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='insured0_birthDate']")));
         element.click();
         element.sendKeys("01011990");

    element = driver.findElement(By.xpath("//*[@name='surname']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='surname']")));
         element.click();
         element.sendKeys("Апланович");

    element = driver.findElement(By.xpath("//*[@name='name']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='name']")));
         element.click();
         element.sendKeys("Аплан");

    element = driver.findElement(By.xpath("//*[@name='middlename']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='middlename']")));
         element.click();
         element.sendKeys("Перфоманслабович");

    element = driver.findElement(By.xpath("//*[@name='birthDate']"));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='birthDate']")));
         element.click();
         element.sendKeys("01012001");

    clicks(By.xpath("//*[@name='female']"));

    element = driver.findElement(By.xpath("//*[@name='passport_series']"));
         element.click();
         element.sendKeys("6666");

    element = driver.findElement(By.xpath("//*[@name='passport_number']"));
         element.click();
         element.sendKeys("666666");

    element = driver.findElement(By.xpath("//*[@name='issueDate']"));

         element.click();
         element.sendKeys("10102000");

    element = driver.findElement(By.xpath("//*[@name='issuePlace']"));
         element.click();
         element.sendKeys("ОВД Красногорского района");

    public InsuranceOfTravelersPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOf(button));
        this.driver = driver;
    }

    public void clics{
кликаем на оформить
    }

}
