package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class MenuPage {
    AndroidDriver driver;
    WebDriverWait wait;

    // Locator atau element
    By menuAllItems = AppiumBy.accessibilityId("test-ALL ITEMS");
    By menuWebView = AppiumBy.accessibilityId("test-WEBVIEW");
    By menuQRCodeScanner = AppiumBy.accessibilityId("test-QR CODE SCANNER");
    By menuGeoLocation = AppiumBy.accessibilityId("test-GEO LOCATION");
    By menuDrawing = AppiumBy.accessibilityId("test-DRAWING");
    By menuAbout = AppiumBy.accessibilityId("test-ABOUT");
    By menuLogout = AppiumBy.accessibilityId("test-LOGOUT");
    By menuResetAppState = AppiumBy.accessibilityId("test-GEO LOCATION");
    By closebutton = AppiumBy.accessibilityId("test-Close");

    public MenuPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Action Method

    public void ClickmenuAllItems() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuAllItems));
        driver.findElement(menuAllItems).click();
    }
    public void ClickmenuWebView() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuWebView));
        driver.findElement(menuWebView).click();
    }
    public void ClickmenuQRCodeScanner() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuQRCodeScanner));
        driver.findElement(menuQRCodeScanner).click();
    }
    public void ClickmenuGeoLocation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuGeoLocation));
        driver.findElement(menuGeoLocation).click();
    }

    public void ClickmenuDrawing() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDrawing));
        driver.findElement(menuDrawing).click();
    }
    public void Clickclosebutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closebutton));
        driver.findElement(closebutton).click();
    }
    public void ClickmenuResetAppState() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuResetAppState));
        driver.findElement(menuResetAppState).click();
    }
    public void ClickmenuLogout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuLogout));
        driver.findElement(menuLogout).click();
    }

    public void ClickmenuAbout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuAbout));
        driver.findElement(menuAbout).click();
    }

}
