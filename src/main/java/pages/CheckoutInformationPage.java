package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInformationPage {

    AndroidDriver driver;
    WebDriverWait wait;

    By firstNameField = AppiumBy.accessibilityId("test-First Name");
    By lastNameField = AppiumBy.accessibilityId("test-Last Name");
    By zipField = AppiumBy.accessibilityId("test-Zip/Postal Code");
    By continueButton = AppiumBy.accessibilityId("test-CONTINUE");
    By CancelButton = AppiumBy.accessibilityId("test-CANCEL");
    By FailMessageLN = By.xpath("//android.widget.TextView[@text=\"Last Name is required\"]");
    By FailMessageFN = By.xpath("//android.widget.TextView[@text=\"First Name is required\"]");
    By FailMessagePC = By.xpath("//android.widget.TextView[@text=\"Postal Code is required\"]");
    By PageTitle =  By.xpath("//*[contains(@text, 'CHECKOUT: INFORMATION')]");
    By ErrorMessage = AppiumBy.accessibilityId("test-Error message");

    public CheckoutInformationPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        driver.findElement(firstNameField).sendKeys(firstname);
    }
    public void InputLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        driver.findElement(lastNameField).sendKeys(lastname);
    }
    public void InputPostalCode(Integer postalcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipField));
        driver.findElement(zipField).sendKeys(postalcode.toString());
    }

    public void InputInvalidPostalCode(String postalcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipField));
        driver.findElement(zipField).sendKeys(postalcode);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        driver.findElement(continueButton).click();
    }
    public void ClickCancelButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CancelButton));
        driver.findElement(CancelButton).click();
    }
    public boolean FailMessageLNDisplayed() {
        return driver.findElement(FailMessageLN).isDisplayed();
    }
    public boolean FailMessageFNDisplayed() {
        return driver.findElement(FailMessageFN).isDisplayed();
    }
    public boolean FailMessagePCDisplayed() {
        return driver.findElement(FailMessagePC).isDisplayed();
    }
    public boolean ErrorMessageDisplayed() {
        return driver.findElement(ErrorMessage).isDisplayed();
    }
    public String getPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));  // Menunggu hingga elemen PageTitle terlihat
        return driver.findElement(PageTitle).getText();  // Mengambil teks elemen
    }
    public boolean PageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));  // Menunggu hingga elemen PageTitle terlihat
        return driver.findElement(PageTitle).isDisplayed();  // Mengembalikan true jika elemen terlihat
    }
}
