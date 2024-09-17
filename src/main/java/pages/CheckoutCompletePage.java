package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage {
    AndroidDriver driver;
    WebDriverWait wait;

    By checkOutTitle = By.xpath("//*[contains(@text, 'CHECKOUT: COMPLETE!')]");
    By completeHeader = By.xpath("//*[contains(@text, 'THANK YOU FOR YOU ORDER')]");
    By backToHomeButton = AppiumBy.accessibilityId("test-BACK HOME");

    public CheckoutCompletePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    public String getCheckOutTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutTitle));  // Menunggu hingga elemen terlihat
        return driver.findElement(checkOutTitle).getText();  // Mengambil teks elemen
    }
    public String getSuccessMessage() {
        return driver.findElement(completeHeader).getText();
    }
    public boolean getCompleteHeader() {
        return driver.findElement(completeHeader).isDisplayed();
    }
}
