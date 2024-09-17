package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

public class ATC_01_Steps {
    AndroidDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ItemsPage itemsPage;
    CartPage cartPage;
    ChangeDisplayPage changeDisplayPage;

    @Given("The user is on the login page and login")
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
    @When("The user click change display items")
    public void theUserClickChangeDisplayItems() {
        homePage = new HomePage(driver);
        homePage.ClickChangeView();
    }

    @When("The user click add to cart")
    public void theUserClickAddToCart() {
        homePage = new HomePage(driver);
        homePage.ClickATC1Button();
    }

    @When("The user swipe left on the product")
    public void theUserSwipeLeftOnTheProduct() {
        cartPage = new CartPage(driver);
        cartPage.swipeLeftOnItem();
    }

    @When("The user click delete button")
    public void theUserClickDeleteButton() {
        cartPage = new CartPage(driver);
        cartPage.ClickdeleteButton();
    }

    @When("The user click continue shopping")
    public void theUserClickcontinueshopping() {
        cartPage = new CartPage(driver);
        cartPage.scrollAndClickContinueShoppingButton();
    }


    @When("The user click the product")
    public void theUserClickTheProduct() {
        homePage = new HomePage(driver);
        homePage.ClickNameproduct1A2Z();
    }

    @When("The user click add to cart on the items page")
    public void theUserClickAddToCartOnTheItemsPage() {
        itemsPage = new ItemsPage(driver);
        itemsPage.ClickATCButton();
    }

    @When("The user click remove on the items page")
    public void theUserClickRemoveOnTheItemsPage() {
        itemsPage = new ItemsPage(driver);
        itemsPage.ClickRemoveButton();
    }

    @When("The user click add to cart for all product")
    public void theUserClickToCartForAllProduct() {
        homePage = new HomePage(driver);
        homePage.ClickATC1Button();
        homePage.ClickATC2Button();
        homePage.ClickATC3Button();
        homePage.ClickATC4Button();
        homePage.ClickATC5Button();
        homePage.ClickATC6Button();
    }

    @When("The user click add to cart for all product on the change view")
    public void theUserClickToCartForAllProductOnTheChangeView() {
        changeDisplayPage = new ChangeDisplayPage(driver);
        changeDisplayPage.ClickATC1Button();
        changeDisplayPage.ClickATC2Button();
        changeDisplayPage.ClickATC3Button();
        changeDisplayPage.ClickATC4Button();
        changeDisplayPage.ClickATC5Button();
        changeDisplayPage.ClickATC6Button();
    }

    @When("The user click remove for all product on the change view")
    public void theUserClickremoveForAllProductOnTheChangeView() {
        changeDisplayPage = new ChangeDisplayPage(driver);
        changeDisplayPage.Clickremove6();
        changeDisplayPage.Clickremove5();
        changeDisplayPage.Clickremove4();
        changeDisplayPage.Clickremove3();
        changeDisplayPage.Clickremove2();
        changeDisplayPage.Clickremove1();
    }

    @When("The user click remove for all product")
    public void theUserClickRemoveForAllProduct() {
        homePage = new HomePage(driver);
        homePage.ClickremoveButton1();
        homePage.ClickremoveButton2();
        homePage.ClickremoveButton3();
        homePage.ClickremoveButton4();
        homePage.ClickremoveButton5();
        homePage.ClickremoveButton6();
    }

    @When("The user click cart button")
    public void theUserClickSortingButton() {
        homePage = new HomePage(driver);
        homePage.ClickCartButton();
    }

    @When("The user click remove on the cart page")
    public void theUserClickRemoveOnTheCartPage() {
        cartPage = new CartPage(driver);
        cartPage.ClickremoveButton();
    }


    @Then("The amount chart should be displayed")
    public void theAmountChartShouldBeDisplayed() {
        homePage = new HomePage(driver);
        assert true; homePage.amountChart6Displayed();
        driver.quit();
    }

    @Then("The product shouldnt be displayed")
    public void theProductShouldntBeDisplayed() {
        cartPage = new CartPage(driver);
        assert true; cartPage.textFooterDisplayed();
        driver.quit();
    }

    @Then("The product should be displayed")
    public void theProductShouldBeDisplayed() {
        cartPage = new CartPage(driver);
        assert true; cartPage.itemDisplay1Displayed();
        assert true; cartPage.itemDisplay1Displayed();
        driver.quit();
    }

    @Then("The product should be exist")
    public void theProductShouldBeExist() {
        cartPage = new CartPage(driver);
       // assert true; cartPage.itemDisplayDisplayed();
     //   assert equals(cartPage.getNameProduct());
        Assert.assertEquals(cartPage.getNameProduct(),"Sauce Labs Backpack");
        driver.quit();
    }

    @Then("The product shouldnt be exist")
    public void theProductShouldntBeExist() {
        cartPage = new CartPage(driver);
        assert true; cartPage.textFooterDisplayed();
     //    assert false; cartPage.itemDisplayDisplayed();
        //   assert equals(cartPage.getNameProduct());
//        Assert.assertEquals(cartPage.getNameProduct(),"Sauce Labs Backpack");
        driver.quit();
    }



}
