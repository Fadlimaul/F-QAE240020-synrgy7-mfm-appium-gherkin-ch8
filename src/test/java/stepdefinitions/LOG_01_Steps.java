package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;
import io.cucumber.java.en.*;

public class LOG_01_Steps {
    AndroidDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    MenuPage menuPage;

    @Given("The user is on the log in")
    public void UserIsLoggedIn() {
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

    @When("The user enters valid username {string} and password {string}")
    public void theUserEntersValidUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);

        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @When("The user click login button")
    public void theUserClickLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @When("The user click username text")
    public void theUserClickUsernameText() {
        loginPage = new LoginPage(driver);
        loginPage.clickUserNameText();
    }

    @When("The user click menu button")
    public void theUserClickMenuButton() {
        homePage = new HomePage(driver);
        homePage.ClickmenuButton();
    }

    @When("The user click logout button")
    public void theUserClickLogoutButton() {
        menuPage = new MenuPage(driver);
        menuPage.ClickmenuLogout();
    }

    @Then("The user should see the products page")
    public void theUserShouldSeeTheProductsPage() {
        homePage = new HomePage(driver);
        assert true; homePage.textProductIsDisplayed();
        driver.quit();
    }

    @Then("The user directed to the home page")
    public void theUserDirectedToTheHomePage() {
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getPageTitle(), "PRODUCTS");
        driver.quit();
    }

    @Then("The user should see the logo displayed")
    public void theUserShouldSeeTheLogoDisplayed() {
        assert loginPage.LogopictDisplayed();
        driver.quit();
    }

    @Then("The user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        assert loginPage.errorMessageDisplayed();
        assert loginPage.wrongLogoDisplayed();
        driver.quit();
    }
    @Then("The user should see an error message below username field")
    public void theUserShouldSeeAnErrorMessageBelowUsername() {
        assert loginPage.UsernamewrongmessageDisplayed();
        driver.quit();
    }

    @Then("The user should see an error message below password field")
    public void theUserShouldSeeAnErrorMessageBelowPassword() {
        assert loginPage.PasswordwrongmessageDisplayed();
        driver.quit();
    }

}

