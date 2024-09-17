package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemsPage {
    AndroidDriver driver;
    WebDriverWait wait;

    By inventoryItem = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Inventory item page\"]");
    By ATCButton = AppiumBy.accessibilityId("test-ADD TO CART");
    By RemoveButton = AppiumBy.accessibilityId("test-REMOVE");
    By backToHProductButton = AppiumBy.accessibilityId("test-BACK TO PRODUCTS");

    public ItemsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public boolean getinventoryItem() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen inventoryItem terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryItem));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(inventoryItem).isDisplayed();
    }
    public void ClickbackToHProductButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(backToHProductButton));
        driver.findElement(backToHProductButton).click();
    }
    public void ClickRemoveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RemoveButton));
        driver.findElement(RemoveButton).click();
    }
    public void ClickATCButton() {
        boolean elementFound = false;
        int attempts = 0;

        while (!elementFound && attempts < 5) { // Ulangi beberapa kali jika diperlukan
            try {
                // Tunggu sebentar sebelum melakukan scroll lagi
                Thread.sleep(2000);

                // Coba temukan elemen
                if (driver.findElements(ATCButton).size() > 0) {
                    elementFound = true;
                } else {
                    // Scroll ke bawah
                    ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("Error during scroll: " + e.getMessage());
            }
        }

        if (elementFound) {
            // Tunggu hingga elemen terlihat
            wait.until(ExpectedConditions.visibilityOfElementLocated(ATCButton));

            // Klik elemen setelah terlihat
            driver.findElement(ATCButton).click();
        } else {
            System.out.println("Element not found after scrolling");
        }
    }
}
