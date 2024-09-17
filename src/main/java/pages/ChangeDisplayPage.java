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

public class ChangeDisplayPage {
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
    By itemPrices1 = By.xpath("//*[contains(@text, '$7.99')]");
    By itemPrices2 = By.xpath("//*[contains(@text, '$9.99')]");
    By itemPrices3 = By.xpath("//*[contains(@text, '$49.99')]");
    By itemPrices4 = By.xpath("//*[contains(@text, '$29.99')]");
    By logoPict = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
    By cartButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    By Nameproduct1A2Z = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]");
    By Nameproduct2Z2A = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Test.allTheThings() T-Shirt (Red)\"]");
    By Nameproduct3CV = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Bolt T-Shirt\"]");
    By menuButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]");
    By removeButton = AppiumBy.accessibilityId("test-REMOVE");
    By remove1 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By remove2 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By remove3 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By remove4 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By remove5 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");
    By remove6 = By.xpath("(//android.view.ViewGroup[@content-desc='test-REMOVE'])");

    public ChangeDisplayPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Action Method
    public boolean textProductIsDisplayed() {
        return driver.findElement(textProducts).isDisplayed();
    }
    public boolean logoPictIsDisplayed() {
        return driver.findElement(logoPict).isDisplayed();
    }
    public void ClickmenuButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuButton));
        driver.findElement(menuButton).click();
    }
    public void ClickATC1Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC1));
        driver.findElement(ATC1).click();
    }
    public void ClickATC2Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC2));
        driver.findElement(ATC2).click();
    }
    public void ClickATC3Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC3));
        driver.findElement(ATC3).click();
    }
    public void ClickATC4Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC4));
        driver.findElement(ATC4).click();
    }
    public void ClickATC5Button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC5));
        driver.findElement(ATC5).click();
    }
    public void ClickATC6Button() {
        // Scroll ke elemen yang ingin diklik
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\"test-ADD TO CART\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(ATC6));

        // Klik elemen setelah terlihat
        driver.findElement(ATC6).click();
    }
    public void Clickremove1() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove1));

        // Klik elemen setelah terlihat
        driver.findElement(remove1).click();
    }
    public void Clickremove2() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove2));

        // Klik elemen setelah terlihat
        driver.findElement(remove2).click();
    }
    public void Clickremove3() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove3));

        // Klik elemen setelah terlihat
        driver.findElement(remove3).click();
    }
    public void Clickremove4() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove4));

        // Klik elemen setelah terlihat
        driver.findElement(remove4).click();
    }
    public void Clickremove5() {
        // Scroll ke atas sampai elemen yang diinginkan terlihat
        ((AndroidDriver) driver).findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList().scrollBackward().scrollIntoView("
                        + "new UiSelector().description(\"test-REMOVE\"))"));

        // Tunggu hingga elemen terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove5));

        // Klik elemen setelah terlihat
        driver.findElement(remove5).click();
    }
    public void Clickremove6() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove6));
        driver.findElement(remove6).click();
    }
    public void ClickCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        driver.findElement(cartButton).click();
    }
    public void ClickSortContainer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortContainer));
        driver.findElement(sortContainer).click();
    }

    public boolean Nameproduct1Displayed() {
        return driver.findElement(Nameproduct1A2Z).isDisplayed();
    }
    public boolean Nameproduct2Displayed() {
        return driver.findElement(Nameproduct2Z2A).isDisplayed();
    }
    public boolean Nameproduct3Displayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen Nameproduct3CV terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(Nameproduct3CV));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(Nameproduct3CV).isDisplayed();
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

}
