package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPageFactory;

public class LoginFactory {

    String username = "tim@testemail.com";
    String password = "trpass";

    @Test
    public void loginTestPageFactory() {

        //1. Initialize the driver
        WebDriver driver = utilities.DriverFactory.open ( "firefox" );
        driver.get ( "http://sdettraining.com/trguitransactions/AccountManagement.aspx" );

        /* 2. Enter login information (Login Page) */
        LoginPageFactory loginPage = new LoginPageFactory ( driver );
        loginPage.login (username, password);

        /* Quit browser */
        driver.quit ();
    }
}