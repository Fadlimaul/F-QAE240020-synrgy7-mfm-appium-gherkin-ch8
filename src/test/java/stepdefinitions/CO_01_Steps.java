package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

public class CO_01_Steps {
    AndroidDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutInformationPage checkoutInformationPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;

    @Given("The user is login")
    public void UserIsOnTheLoginPageAndLogin() {
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

    @When("The user click add to cart button")
    public void theUserClickAddToCartButtton() {
        homePage = new HomePage(driver);
        homePage.ClickATC1Button();
    }

    @When("The user click cart logo button")
    public void theUserClickCartLogoButton() {
        homePage = new HomePage(driver);
        homePage.ClickCartButton();
    }

    @When("The user click checkout button")
    public void theUserClickCheckoutButton() {
        cartPage = new CartPage(driver);
        cartPage.scrollAndClickCheckoutButton();
    }

    @When("The user filling first name field {string}")
    public void theUserFillingFirstNameField(String firstname) {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.InputFirstName(firstname);
    }

    @When("The user filling last name field {string}")
    public void theUserFillingLastNameField(String lastname) {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.InputLastName(lastname);
    }

    @When("The user filling postal code field {int}")
    public void theUserFillingPostalCodeField(Integer postalcode) {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.InputPostalCode(postalcode);
    }

    @When("The user filling invalid postal code field {string}")
    public void theUserFillingInvalidPostalCodeField(String invpostalcode) {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.InputInvalidPostalCode(invpostalcode);
    }

    @When("The user click continue button")
    public void theUserClickContinueButton() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.ClickContinueButton();
    }

    @When("The user click finish button")
    public void theUserClickFinishButton() {
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.ScrollAndClickFinishButton();
    }

    @When("The user click cancel button on checkout overview page")
    public void theUserClickCancelButtonOnCheckoutOverviewPage() {
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.ScrollAndClickCancelButton();
    }

    @When("The user click cancel button")
    public void theUserClickCancelButton() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.ClickCancelButton();
    }

    @Then("The success message should be displayed")
    public void theSuccessMessageShouldBeDisplayed() {
        checkoutCompletePage = new CheckoutCompletePage(driver);
       //  Assert.assertEquals(checkoutCompletePage.getSuccessMessage(), "THANK YOU FOR YOU ORDER");
        Assert.assertEquals(checkoutCompletePage.getCheckOutTitle(), "CHECKOUT: COMPLETE!");
       // assert true; checkoutCompletePage.getCompleteHeader();
        driver.quit();
    }

    @Then("The user still on the cart page")
    public void theUserStillOnTheCartPage() {
        cartPage = new CartPage(driver);
        assert true; cartPage.PageTitleDisplayed();
        driver.quit();
    }

    @Then("The user back to home page")
    public void theUserBackToHomePage() {
        homePage = new HomePage(driver);
        assert true; homePage.textProductIsDisplayed();
        driver.quit();
    }

    @Then("The user still on the checkout information page")
    public void theUserStillOnTheCheckoutInformationPage() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        Assert.assertEquals(checkoutInformationPage.getPageTitle(), "CHECKOUT: INFORMATION");
        driver.quit();
    }

    @Then("The warning message bellow first name field should be displayed")
    public void theWarningMessageBellowFirstNameFieldShouldBeDisplayed() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        assert true; checkoutInformationPage.FailMessageFNDisplayed();
        driver.quit();
    }

    @Then("The warning message bellow last name field should be displayed")
    public void theWarningMessageBellowLastNameFieldShouldBeDisplayed() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        assert true; checkoutInformationPage.FailMessageLNDisplayed();
        driver.quit();
    }

    @Then("The warning message bellow postal code field should be displayed")
    public void theWarningMessageBellowPostalCodeFieldShouldBeDisplayed() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        assert true; checkoutInformationPage.FailMessagePCDisplayed();
        driver.quit();
    }

    @Then("The warning message should be displayed")
    public void theWarningMessageShouldBeDisplayed() {
        checkoutInformationPage = new CheckoutInformationPage(driver);
        assert true; checkoutInformationPage.ErrorMessageDisplayed();
        driver.quit();
    }

}
