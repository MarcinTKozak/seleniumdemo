package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test2@test.pl", "test1@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

   /* @Test
    public void logInWithInvalidDataTest() {

        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test23@test.pl", "test@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."), "Expected error text doesn't match");

    }*/
}
