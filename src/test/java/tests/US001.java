package tests;


import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {

    @Test
    public void testUS001() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));

        AlloverPage alloverPage = new AlloverPage();
        alloverPage.signIn.click();
        alloverPage.username.sendKeys(ConfigReader.getProperty("userName"));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(alloverPage.signOut.isDisplayed());


    }
}
