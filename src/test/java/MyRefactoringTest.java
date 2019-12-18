import Pages.*;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class MyRefactoringTest extends BaseTest {
    @Test
    public void testInsurance() throws Exception {
        driver.get(baseUrl + "/");

        MainPage mainPage = new MainPage(driver);
        mainPage.closeCoockies();
        mainPage.selectInsuranceItem();

        InsurancePage insurancePage = new InsurancePage(driver);
        insurancePage.getOnline();
        insurancePage.checkTitle();

        InsuranceOfTravelersPage itp = new InsuranceOfTravelersPage(driver);
        itp.goToData();
        openNewWindow();

        SendDataPage sendDataPage = new SendDataPage(driver);
        WebElement sum = sendDataPage.getElement("Сумма страхования");
        clicks(sum);
        WebElement issue = sendDataPage.getElement("Кнопка Оформить");
        clicks(issue);

        sendDataPage.fillField( "Фамилия","Ivanov");
        sendDataPage.fillField( "Имя","Ivan");
        sendDataPage.fillField("Дата рождения", "01011990");
        sendDataPage.fillField("Фамилия страхователя", "Петрова");
        sendDataPage.fillField("Имя страхователя", "Наталья");
        sendDataPage.fillField("Отчество страхователя", "Петровна");
        sendDataPage.fillField("Дата рождения страхователя", "01012001");
        sendDataPage.fillField("Пол", "female");
        sendDataPage.fillField("Серия паспорта", "1234");
        sendDataPage.fillField("Номер паспорта", "123456");
        sendDataPage.fillField("Дата выдачи", "01012000");
        sendDataPage.fillField("Место выдачи", "ОВД Красногорского района");

        sendDataPage.checkField("Фамилия","Ivanov");
        sendDataPage.checkField("Имя","Ivan");
        sendDataPage.checkField("Дата рождения","01.01.1990");
        sendDataPage.checkField("Фамилия страхователя","Петрова");
        sendDataPage.checkField("Имя страхователя","Наталья");
        sendDataPage.checkField("Отчество страхователя","Петровна");
        sendDataPage.checkField("Дата рождения страхователя","01.01.2001");
        sendDataPage.checkField("Серия паспорта","1234");
        sendDataPage.checkField("Номер паспорта","123456");
        sendDataPage.checkField("Дата выдачи","01.01.2000");
        sendDataPage.checkField("Место выдачи","ОВД Красногорского района");


        WebElement btn_cntn = sendDataPage.getElement("Кнопка Продолжить");
        clicks(btn_cntn);
        WebElement errorText = sendDataPage.getElement("text");
        checkText(errorText);
        }
}
