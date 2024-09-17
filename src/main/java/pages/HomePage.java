package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class HomePage {
    AndroidDriver driver;
    WebDriverWait wait;

    // Locator atau element
    By textProducts = By.xpath("//*[contains(@text, 'PRODUCTS')]");
    By ATC1 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By ATC2 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By ATC3 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By ATC4 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By ATC5 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By ATC6 = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])");
    By sortContainer = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By changeView = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]");
    By itemPrices1 = By.xpath("//*[contains(@text, '$7.99')]");
    By itemPrices2 = By.xpath("//*[contains(@text, '$9.99')]");
    By itemPrices3 = By.xpath("//*[contains(@text, '$49.99')]");
    By itemPrices4 = By.xpath("//*[contains(@text, '$29.99')]");
    By logoPict = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
    By cartButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    By Nameproduct1A2Z = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]");
    By Nameproduct2Z2A = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Test.allTheThings() T-Shirt (Red)\"]");
    By menuButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]");
    By removeButton = AppiumBy.accessibilityId("test-REMOVE");
    By removeButton1 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By removeButton2 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By removeButton3 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By removeButton4 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By removeButton5 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By removeButton6 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By amountChart6 = By.xpath("//android.widget.TextView[@text=\"6\"]");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Action Method
    public boolean amountChart6Displayed() {
        return driver.findElement(amountChart6).isDisplayed();
    }
    public boolean textProductIsDisplayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen textProducts terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(textProducts));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(textProducts).isDisplayed();
    }
    public boolean logoPictIsDisplayed() {
        return driver.findElement(logoPict).isDisplayed();
    }
    public void ClickATC1Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC1));
        driver.findElement(ATC1).click();
    }
    public void ClickmenuButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuButton));
        driver.findElement(menuButton).click();
    }
//    public void ClickATC2Button() {
//        // Wait until the element is visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC2));
//
//        // Find the element
//        WebElement element = driver.findElement(ATC2);
//
//        // Create a new TouchAction instance
//        TouchAction<?> touchAction = new TouchAction<>(driver);
//
//        // Perform the tap action on the element
//        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
//    }
    public void ClickATC2Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC2));
        driver.findElement(ATC2).click();
    }
    public void ClickATC3Button() {
        // Scroll ke elemen yang ingin diklik
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"test-ADD TO CART\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC3));

        // Klik elemen setelah terlihat
        driver.findElement(ATC3).click();
    }
    public void ClickATC4Button() {
        // Scroll ke elemen yang ingin diklik
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"test-ADD TO CART\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC4));

        // Klik elemen setelah terlihat
        driver.findElement(ATC4).click();
    }
    public void ClickATC5Button() {
        // Scroll ke elemen yang ingin diklik
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"test-ADD TO CART\"))"));

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen ATC5 terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC5));

        // Klik elemen setelah terlihat
        driver.findElement(ATC5).click();
    }
    public void ClickATC6Button() {
        // Scroll ke elemen yang ingin diklik
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"test-ADD TO CART\"))"));

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen ATC5 terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC6));

        // Klik elemen setelah terlihat
        driver.findElement(ATC6).click();
    }
    public void ClickCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        driver.findElement(cartButton).click();
    }
    public void ClickSortContainer() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen sortContainer terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortContainer));

        // Klik elemen setelah terlihat
        driver.findElement(sortContainer).click();
    }

    public void ClickChangeView() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(changeView));
        driver.findElement(changeView).click();
    }
    public boolean Nameproduct1Displayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen Nameproduct1A2Z terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(Nameproduct1A2Z));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(Nameproduct1A2Z).isDisplayed();
    }
    public boolean Nameproduct2Displayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen Nameproduct1A2Z terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(Nameproduct2Z2A));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(Nameproduct2Z2A).isDisplayed();
    }
    public void ClickremoveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton));
        driver.findElement(removeButton).click();
    }
    public void ClickNameproduct1A2Z() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Nameproduct1A2Z));
        driver.findElement(Nameproduct1A2Z).click();
    }

    public boolean isPrice1LessThanPrice2() {
        try {
            // Tunggu sampai elemen harga terlihat
            wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrices1));
            wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrices2));

            // Ambil elemen harga
            WebElement priceElement1 = driver.findElement(itemPrices1);
            WebElement priceElement2 = driver.findElement(itemPrices2);

            // Konversi teks harga menjadi double
            double price1 = Double.parseDouble(priceElement1.getText().replace("$", ""));
            double price2 = Double.parseDouble(priceElement2.getText().replace("$", ""));

            // Periksa apakah harga1 lebih kecil dari harga2
            return price1 < price2;
        } catch (Exception e) {
            // Jika terjadi kesalahan (misalnya elemen tidak ditemukan), kembalikan false
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPrice3MoreThanPrice4() {
        try {
            // Tunggu sampai elemen harga terlihat
            wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrices3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(itemPrices4));

            // Ambil elemen harga
            WebElement priceElement3 = driver.findElement(itemPrices3);
            WebElement priceElement4 = driver.findElement(itemPrices4);

            // Konversi teks harga menjadi double
            double price3 = Double.parseDouble(priceElement3.getText().replace("$", ""));
            double price4 = Double.parseDouble(priceElement4.getText().replace("$", ""));

            // Periksa apakah harga1 lebih kecil dari harga2
            return price3 > price4;
        } catch (Exception e) {
            // Jika terjadi kesalahan (misalnya elemen tidak ditemukan), kembalikan false
            e.printStackTrace();
            return false;
        }
    }
    public void ClickremoveButton1() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton1));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton1).click();
    }
    public void ClickremoveButton2() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton2));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton2).click();
    }
    public void ClickremoveButton3() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton3));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton3).click();
    }
    public void ClickremoveButton4() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton4));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton4).click();
    }
    public void ClickremoveButton5() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton5));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton5).click();
    }
    public void ClickremoveButton6() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(removeButton6));

        // Klik elemen setelah terlihat
        driver.findElement(removeButton6).click();
    }
    public String getPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));  // Menunggu hingga 40 detik
        wait.until(ExpectedConditions.visibilityOfElementLocated(textProducts));  // Menunggu hingga elemen PageTitle terlihat
        return driver.findElement(textProducts).getText();  // Mengambil teks elemen
    }
}


