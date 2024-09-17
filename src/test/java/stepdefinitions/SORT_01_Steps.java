package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

public class SORT_01_Steps {
    AndroidDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ItemsPage itemsPage;
    SortPage sortPage;
    ChangeDisplayPage changeDisplayPage;

    @Given("The user on the login page")
    public void UserOnTheLoginPage() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "samsung SM-A307GN");
        capabilities.setCapability("app", "D:/belajar/QA/SYNRGY Academy B7/Chapter 8/sample.apk");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);
        loginPage = new LoginPage(driver);

        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

//    @When("The user enter username {string} and password {string}")
//    public void theUserEnterUsernameAndPassword(String username, String password) {
//        loginPage = new LoginPage(driver);
//
//        loginPage.inputUsername(username);
//        loginPage.inputPassword(password);
//    }
//
//    @When("The user click button login")
//    public void theUserClickButtonLogin() {
//        loginPage = new LoginPage(driver);
//        loginPage.clickLoginButton();
//    }
    @When("The user click change display")
    public void theUserClickChangeDisplay() {
        homePage = new HomePage(driver);
        homePage.ClickChangeView();
    }

    @When("The user click sorting button")
    public void theUserClickSortingButton() {
        homePage = new HomePage(driver);
        homePage.ClickSortContainer();
    }

    @When("The user choose High to Low")
    public void theUserChooseHighToLow() {
        sortPage = new SortPage(driver);
        sortPage.ClickSortHightoLow();
    }

    @When("The user choose Low to High")
    public void theUserChooseLowToHigh() {
        sortPage = new SortPage(driver);
        sortPage.ClickSortLowtoHigh();
    }

    @When("The user choose A to Z")
    public void theUserChooseAtoZ() {
        sortPage = new SortPage(driver);
        sortPage.ClickSortAtoZ();
    }

    @When("The user choose Z to A")
    public void theUserChooseZtoA() {
        sortPage = new SortPage(driver);
        sortPage.ClickSortZtoA();
    }

    @When("The user choose cancel")
    public void theUserChooseCancel() {
        sortPage = new SortPage(driver);
        sortPage.Clickcancel();
    }

    @Then("The name product should be sorting from A to Z")
    public void theNameProductShouldBeSortingFromAtoZ() {
        assert homePage.Nameproduct1Displayed();
        driver.quit();
    }

    @Then("The name product should be sorting from Z to A")
    public void theNameProductShouldBeSortingFromZtoA() {
        assert homePage.Nameproduct2Displayed();
        driver.quit();
    }

    @Then("The product should be sorting from high to low price")
    public void theProductShouldBeSortingFromHighToLowPrice() {
        //assert homePage.isSortedByHighToLow();
        assert homePage.isPrice3MoreThanPrice4();
        driver.quit();
    }

    @Then("The product should be sorting from low to high price")
    public void theProductShouldBeSortingFromLowToHighPrice() {
//        assert homePage.isSortedByLowToHigh();
        assert homePage.isPrice1LessThanPrice2();
        driver.quit();
    }

    @Then("The user should back to the product page")
    public void theUserShouldBackToTheProductsPage() {
        assert homePage.textProductIsDisplayed();
        driver.quit();
    }


}
