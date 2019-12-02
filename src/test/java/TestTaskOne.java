import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestTaskOne {

     private WebDriver driver;
     private String baseUrl;

     @Before
     public void testSber() throws Exception {
          System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
          driver = new ChromeDriver();
          baseUrl = "http://www.sberbank.ru/ru/person";
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.manage().window().maximize();
     }

     @Test
     public void testInsurance() throws Exception {
          driver.get(baseUrl + "/");
          clicks(By.xpath("//span[@class = 'lg-menu__text'][text() = 'Страхование']"));
          clicks(By.xpath("//*[@id='submenu-5']/div/div/div[1]/ul/li[2]"));

          assertEquals("Страхование путешественников",
                 driver.findElement(By.xpath("//*[@class='sbrf-rich-outer']/h1")).getText());

          clicks(By.xpath("//*[@class = 'sbrf-rich-outer']/p/a/img"));


         for (String winHandle : driver.getWindowHandles()) {
             driver.switchTo().window(winHandle);
         }


         clicks(By.xpath("//*[@class=\"b-form-prog-box\"]"));
         clicks(By.xpath("//*[@class = \"b-form-button-section\"]/span/span"));

        WebElement element = driver.findElement(By.xpath("//*[@name='insured0_surname']"));
        element.click();
        element.sendKeys("Aplanovich");


         element = driver.findElement(By.xpath("//*[@name='insured0_name']"));
         element.click();
         element.sendKeys("Aplan");

         element = driver.findElement(By.xpath("//*[@name='insured0_birthDate']"));
         element.click();
         element.sendKeys("01011990");

         element = driver.findElement(By.xpath("//*[@name='surname']"));
         element.click();
         element.sendKeys("Апланович");

         element = driver.findElement(By.xpath("//*[@name='name']"));
         element.click();
         element.sendKeys("Аплан");

         element = driver.findElement(By.xpath("//*[@name='middlename']"));
         element.click();
         element.sendKeys("Перфоманслабович");

         element = driver.findElement(By.xpath("//*[@name='birthDate']"));
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

/**Проверки заполненных полей*/

         comparison("Aplanovich", By.xpath("//*[@name='insured0_surname']"));
         comparison("Aplan", By.xpath("//*[@name='insured0_name']"));
         comparison("01.01.1990", By.xpath("//*[@name='insured0_birthDate']"));
         comparison("Апланович", By.xpath("//*[@name='surname']"));
         comparison("Аплан", By.xpath("//*[@name='name']"));
         comparison("Перфоманслабович", By.xpath("//*[@name='middlename']"));
         comparison("01.01.2001", By.xpath("//*[@name='birthDate']"));
         comparison("6666", By.xpath("//*[@name='passport_series']"));
         comparison("666666", By.xpath("//*[@name='passport_number']"));
         comparison("10.10.2000", By.xpath("//*[@name='issueDate']"));
         comparison("ОВД Красногорского района", By.xpath("//*[@name='issuePlace']"));

         clicks(By.xpath("//*[@class='b-continue-btn'][text()='Продолжить']"));

         Thread.sleep(2000);

         assertEquals("Заполнены не все обязательные поля",
                 driver.findElement(By.xpath("//*[text()='Заполнены не все обязательные поля']")).getText());

         tearDown();
     }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    private void comparison(String value, By locator) {
        assertEquals((value),
                driver.findElement(locator).getAttribute("value"));
    }
    private void clicks(By locator) {
         driver.findElement(locator).click();
    }
}