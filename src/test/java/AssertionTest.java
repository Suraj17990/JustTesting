import gmail.Gmail;
import gmail.GuiController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by senorita on 3/12/2017.
 */
public class AssertionTest extends GuiController {
    Gmail gmail = new Gmail();
    @Parameters("browserName")
    @BeforeClass
    public void openBrowser(@Optional("firefox") String browserName){
        launchBrowser(browserName);
    }
    @Test
    public void testCaseVerifyHomePage() {
        driver.get("https://gmail.com/");
        Assert.assertEquals("Gmail", driver.getTitle(), "Strings are not matching");
    }

    @Test(enabled = true)
    public void verifyUserLogIn(){
        Assert.assertTrue(gmail.isUserLoggedInSuccessfully(), "User failed to login");
    }

    @Test (enabled = true)
    public void verifyUserLogOut(){
        Assert.assertFalse(gmail.isUserLoggedOut());
    }
}
