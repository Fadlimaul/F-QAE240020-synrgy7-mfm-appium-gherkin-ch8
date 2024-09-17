package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class CartPage {
    AndroidDriver driver;
    WebDriverWait wait;

    By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");
    By removeButton = AppiumBy.accessibilityId("test-REMOVE");
    By ContinueShoppingButton = AppiumBy.accessibilityId("test-CONTINUE SHOPPING");
    By deleteButton = AppiumBy.accessibilityId("test-Delete");
    By itemName = By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    By itemDisplay = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Item\"]");
    By itemDisplay1 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]");
    By itemDisplay2 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[2]");
    By itemDisplay3 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[3]");
    By itemDisplay4 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[4]");
    By itemDisplay5 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[5]");
    By itemDisplay6 = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[6]");
    By textFooter = By.xpath("//android.widget.TextView[@text=\"© 2024 Sauce Labs. All Rights Reserved.\"]");
    By PageTitle = By.xpath("//*[contains(@text, 'YOUR CART')]");

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void scrollAndClickCheckoutButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton));
        driver.findElement(checkoutButton).click();
    }

    public void ClickremoveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton));
        driver.findElement(removeButton).click();
    }


    public void ClickdeleteButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        driver.findElement(deleteButton).click();
    }

    public void scrollAndClickContinueShoppingButton() {
        // Scroll until the checkout button is visible
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                        "new UiSelector().description(\"test-CONTINUE SHOPPING\"));"));

        // Wait until the checkout button is visible and click it
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueShoppingButton));
        driver.findElement(ContinueShoppingButton).click();
    }

    public boolean itemDisplayDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemDisplay));  // Menunggu hingga elemen itemDisplay1 terlihat
        return driver.findElement(itemDisplay).isDisplayed();  // Mengembalikan true jika elemen terlihat
    }

    public boolean itemDisplay1Displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemDisplay1));  // Menunggu hingga elemen itemDisplay1 terlihat
        return driver.findElement(itemDisplay1).isDisplayed();  // Mengembalikan true jika elemen terlihat
    }

    public boolean itemDisplay2Displayed() {
        return driver.findElement(itemDisplay2).isDisplayed();
    }

    public boolean itemDisplay3Displayed() {
        boolean elementFound = false;
        int attempts = 0;

        while (!elementFound && attempts < 5) { // Ulangi hingga 5 kali atau hingga elemen ditemukan
            try {
                // Tunggu sebentar sebelum melakukan scroll lagi
                Thread.sleep(2000);

                // Coba temukan elemen
                if (driver.findElements(itemDisplay3).size() > 0) {
                    elementFound = true;
                } else {
                    // Scroll ke bawah jika elemen belum ditemukan
                    ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("Error during scroll: " + e.getMessage());
            }
        }

        if (elementFound) {
            // Jika elemen ditemukan, periksa apakah elemen tersebut ditampilkan
            return driver.findElement(itemDisplay3).isDisplayed();
        } else {
            System.out.println("Element itemDisplay3 not found after scrolling");
            return false;
        }
    }
    public boolean itemDisplay4Displayed() {
        boolean elementFound = false;
        int attempts = 0;

        while (!elementFound && attempts < 5) { // Ulangi hingga 5 kali atau hingga elemen ditemukan
            try {
                // Tunggu sebentar sebelum melakukan scroll lagi
                Thread.sleep(2000);

                // Coba temukan elemen
                if (driver.findElements(itemDisplay3).size() > 0) {
                    elementFound = true;
                } else {
                    // Scroll ke bawah jika elemen belum ditemukan
                    ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("Error during scroll: " + e.getMessage());
            }
        }

        if (elementFound) {
            // Jika elemen ditemukan, periksa apakah elemen tersebut ditampilkan
            return driver.findElement(itemDisplay4).isDisplayed();
        } else {
            System.out.println("Element itemDisplay3 not found after scrolling");
            return false;
        }
    }


    public boolean itemDisplay5Displayed() {
        boolean elementFound = false;
        int attempts = 0;

        while (!elementFound && attempts < 5) { // Ulangi hingga 5 kali atau hingga elemen ditemukan
            try {
                // Tunggu sebentar sebelum melakukan scroll lagi
                Thread.sleep(2000);

                // Coba temukan elemen
                if (driver.findElements(itemDisplay5).size() > 0) {
                    elementFound = true;
                } else {
                    // Scroll ke bawah jika elemen belum ditemukan
                    ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("Error during scroll: " + e.getMessage());
            }
        }

        if (elementFound) {
            // Jika elemen ditemukan, periksa apakah elemen tersebut ditampilkan
            return driver.findElement(itemDisplay5).isDisplayed();
        } else {
            System.out.println("Element itemDisplay3 not found after scrolling");
            return false;
        }
    }

    public boolean itemDisplay6Displayed() {
        boolean elementFound = false;
        int attempts = 0;

        while (!elementFound && attempts < 5) { // Ulangi hingga 5 kali atau hingga elemen ditemukan
            try {
                // Tunggu sebentar sebelum melakukan scroll lagi
                Thread.sleep(2000);

                // Coba temukan elemen
                if (driver.findElements(itemDisplay6).size() > 0) {
                    elementFound = true;
                } else {
                    // Scroll ke bawah jika elemen belum ditemukan
                    ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("Error during scroll: " + e.getMessage());
            }
        }

        if (elementFound) {
            // Jika elemen ditemukan, periksa apakah elemen tersebut ditampilkan
            return driver.findElement(itemDisplay6).isDisplayed();
        } else {
            System.out.println("Element itemDisplay3 not found after scrolling");
            return false;
        }
    }
    public String getNameProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemName));
        return driver.findElement(itemName).getText();
    }
    public boolean textFooterDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(textFooter));  // Menunggu hingga elemen textFooter terlihat
        return driver.findElement(textFooter).isDisplayed();  // Mengembalikan true jika elemen terlihat
    }
    public String gettextFooter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textFooter));
        return driver.findElement(textFooter).getText();
    }
    public void swipeLeftOnItem() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(itemDisplay));

        int startX = element.getLocation().getX() + element.getSize().getWidth();
        int endX = element.getLocation().getX();
        int startY = element.getLocation().getY() + (element.getSize().getHeight() / 2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, startY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }
    public boolean PageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));  // Menunggu hingga elemen PageTitle terlihat
        return driver.findElement(PageTitle).isDisplayed();  // Mengembalikan true jika elemen terlihat
    }
}
