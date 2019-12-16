import Pages.MainPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyRefactoringTest extends BaseTest {
    @Test
    public void testInsurance() throws Exception {
        //int x = 0;
    //    while (x <= 1){
        driver.get(baseUrl + "/");


        MainPage mainPage = new MainPage(driver);
        mainPage.selectMenuItem("Страхование");
        mainPage.selectInsuranceItem("ДМС");
        //x++;
        Thread.sleep(5000);
        }

     /**   new DMSPage(driver).waitSendAppClickable();

        SendAppPage sendAppPage = new SendAppPage(driver);
        String actualTitle = sendAppPage.title.getText();
        String expectedTitle = "Заявка на добровольное медицинское страхование";
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));

        sendAppPage.checkbox.click();
        sendAppPage.fillField("Фамилия", "Иванов");
        sendAppPage.fillField("Имя", "Иван");
        sendAppPage.fillField("Отчество", "Иванович");
        sendAppPage.fillField("Телефон", "9191111112");
        sendAppPage.fillField("Эл. почта", "teststststs");
        sendAppPage.fillField("Комментарии", "test");
        sendAppPage.fillField("Регион", "Москва");

        sendAppPage.sendButton.click();

        sendAppPage.checkFieldErrorMessage("Эл. почта", "Введите адрес электронной почты");

    }*/

}//}
