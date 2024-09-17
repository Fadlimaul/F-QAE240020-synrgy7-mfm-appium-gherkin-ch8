package pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
// import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;

import java.time.Duration;
import java.util.Arrays;

public class LoginPage {
    AndroidDriver driver;
    WebDriverWait wait;

    // Locator atau element
    By usernameField = AppiumBy.accessibilityId("test-Username");
    By Logopict = By.xpath("//android.widget.ScrollView[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]");
    By passwordField = AppiumBy.accessibilityId("test-Password");
    By clickLoginButton = AppiumBy.accessibilityId("test-LOGIN");
    By errorMessage = By.xpath("//*[contains(@text, 'Username and password do not match any user in this service.')]");
    By wrongLogo = By.xpath("//*[contains(@bounds, '[623,443][650,476]')]");
    By Usernamewrongmessage = AppiumBy.accessibilityId("test-Error message");
    By Passwordwrongmessage = By.xpath("//android.widget.TextView[@text='Password is required']");
    By usernametext = By.xpath("//android.view.ViewGroup[@content-desc='test-standard_user']");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Action Method
    public void inputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }
    public void inputPassword(String password) {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen passwordField terlihat, lalu masukkan kata sandi
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }
    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickLoginButton)).click();
    }
    public boolean errorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
    public boolean UsernamewrongmessageDisplayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen Usernamewrongmessage terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(Usernamewrongmessage));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(Usernamewrongmessage).isDisplayed();
    }
    public boolean wrongLogoDisplayed() {
        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen wrongLogo terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(wrongLogo));

        // Mengembalikan true jika elemen terlihat
        return driver.findElement(wrongLogo).isDisplayed();
    }
    public boolean PasswordwrongmessageDisplayed() {
        return driver.findElement(Passwordwrongmessage).isDisplayed();
    }
    public boolean LogopictDisplayed() {
        return driver.findElement(Logopict).isDisplayed();
    }
    public void clickUserNameText() {

        // Scroll sampai elemen dengan XPath usernametext terlihat
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                        "new UiSelector().description(\"test-standard_user\"));"));

        // Tunggu sampai elemen usernametext terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernametext));

        // Tap pada elemen usernametext menggunakan W3C Actions
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),
                        driver.findElement(usernametext).getLocation().getX(),
                        driver.findElement(usernametext).getLocation().getY()))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(tap));
    }

}
