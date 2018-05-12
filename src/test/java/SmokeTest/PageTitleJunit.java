package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTitleJunit {

    //Declare variable and objects at CLASS level in order to access in multiple methods through program
    WebDriver driver = utilities.DriverFactory.open ("chrome");
    String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    @Test
    public void pageTitleJUnit(){

        System.out.println ("Running the test" );
        driver.get (webURL);
        String actualTitle = driver.getTitle ();
        System.out.println (actualTitle );
        String expectedTitle = "SDET Training | Account Management";
        // Assert.assertEquals (expectedTitle, actualTitle);
        // Assert.fail ();
    }
   // kumar
    @BeforeTest
    public void setUp(){
        System.out.println ("Setting up the test" );
        System.out.println ("Initializing the driver " );
    }

    @AfterTest
    public void tearDown(){
        System.out.println ("Closing the test" );
        System.out.println ("Closing the driver" );
        driver.close ();
    }

}
