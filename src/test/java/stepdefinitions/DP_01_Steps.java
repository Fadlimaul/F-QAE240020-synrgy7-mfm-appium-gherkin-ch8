package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;
import io.cucumber.java.en.*;

public class DP_01_Steps {
    AndroidDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ItemsPage itemsPage;
    ChangeDisplayPage changeDisplayPage;

    @Given("The user is on the login page")
    public void UserIsOnTheLoginPage() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "samsung SM-A307GN");
        capabilities.setCapability("app", "D:/belajar/QA/SYNRGY Academy B7/Chapter 8/sample.apk");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);
    }

    @When("The user enter username {string} and password {string}")
    public void theUserEnterUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);

        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @When("The user click button login")
    public void theUserClickButtonLogin() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @When("The user click change display product button")
    public void theUserClickChangeDisplayProductButton() {
        homePage = new HomePage(driver);
        homePage.ClickChangeView();
    }

    @When("The user click on the product")
    public void theUserClicknTheProduct() {
        homePage = new HomePage(driver);
        homePage.ClickNameproduct1A2Z();
    }


    @Then("The product display should be change")
    public void theProductDisplayShouldBeChange() {
        changeDisplayPage = new ChangeDisplayPage(driver);
        assert changeDisplayPage.Nameproduct3Displayed();
        // assert homePage.logoPictIsDisplayed();
        driver.quit();
    }

    @Then("The product inventory should be dispayed")
    public void theProductInventoryShouldBeDispayed() {
        itemsPage = new ItemsPage(driver);
        assert true; itemsPage.getinventoryItem();
        // assert homePage.logoPictIsDisplayed();
        driver.quit();
    }


}
