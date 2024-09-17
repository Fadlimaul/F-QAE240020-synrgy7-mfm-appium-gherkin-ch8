package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class SortPage {
    AndroidDriver driver;
    WebDriverWait wait;

    By sortL2H = By.xpath("//android.widget.TextView[@text=\"Price (low to high)\"]"); //*[contains(@text, 'Price (low to high)')]
    By sortH2L = By.xpath("//android.widget.TextView[@text=\"Price (high to low)\"]");
    By sortA2Z = By.xpath("//android.widget.TextView[@text=\"Name (A to Z)\"]");
    By sortZ2A = By.xpath("//android.widget.TextView[@text=\"Name (Z to A)\"]");
    By cancel = By.xpath("//android.widget.TextView[@text=\"Cancel\"]");


    public SortPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickSortLowtoHigh() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortL2H));
        driver.findElement(sortL2H).click();
    }
    public void ClickSortHightoLow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortH2L));
        driver.findElement(sortH2L).click();
    }
    public void ClickSortAtoZ() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortA2Z));
        driver.findElement(sortA2Z).click();
    }
    public void ClickSortZtoA() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortZ2A));
        driver.findElement(sortZ2A).click();
    }
    public void Clickcancel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cancel));
        driver.findElement(cancel).click();
    }
}
