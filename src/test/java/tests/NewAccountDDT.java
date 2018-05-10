package tests;

import demos.NewAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith (value = Parameterized.class)
public class NewAccountDDT {
    String name;
    String email;
    String phone;

    // This is our test method
    @Test
    public void newAcccountTest() {
        System.out.println ("New Record: " + name + "   " + email + " " + phone );
        if ( phone.equals ("71894561230") ){
            Assert.fail ();
        }
    }

    // This annotated method is designed to pass parameters into the class via constructor
    @Parameterized.Parameters
    public static List <String[]> getData() {

        return utilities.CSV.get ("/Users/rajeev.kumar/git/seleniumTraining/csvfile/UserAccounts.csv");

    }

    // constructor that passes parameters to the test method
    public NewAccountDDT(String name, String email, String phone, String gender, String password, String country,
                         String weeklyEmail, String monthlyEmail, String occassionalEmail){
        this.name = name;
        this.email = email;
        this.phone = phone;

    }
}
