package org.example;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static Constants.Constants.*;

public class StepImplementation extends BaseTest {

WebDriverWait wait = new WebDriverWait(appiumDriver,60);

    @Step("Pop-up kapatildi")
    public void clickPopup()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(POP_UP))).click();

    }

    @Step("Cookie kapatildi")
    public void clickCookie()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(COOKIE))).click();

    }

    @Step("Bilet ala tiklandi")
    public void clickBookaFlight()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BILET_AL))).click();
    }

    @Step("Tek yon ucus secildi")
    public void oneWay()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(TEK_YON))).click();
    }

    @Step("Nereden bilgisi secildi")
    public void clickingFrom()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(NEREDEN))).click();
    }

    @Step("Havaalani aratma yerine <key> yazildi")
    public void airPortSearch(String key)  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(SAW))).sendKeys(key);
    }

    @Step("Havaalani aratma yerinde SAW havaalani secildi")
    public void choosingSAW()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(SAW_SEC))).click();
    }

    @Step("Nereye bilgisi secildi")
    public void clickingTo()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(NEREYE))).click();
    }

    @Step("Gidilecek havaalani aratma yerine <key> yazildi")
    public void airPorthSearchTo(String key)  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ESB))).sendKeys(key);
    }

    @Step("Havaalani aratma yerinde ESB havaalani secildi")
    public void choosingESB()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ESB_SEC))).click();
    }

    @Step("Takvim acildi")
    public void calenderClick()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(TAKVIM))).click();
    }

    @Step("Iki gun sonrasi secildi")
    public void clickingTwoDaysLater() throws InterruptedException {
        String currentDay = appiumDriver.findElementById(BIRGUN_SONRA).getText();
        int currentDayInt = Integer.parseInt(currentDay);
        int twoDaysLater = currentDayInt + 1;
        String s = "" + twoDaysLater;
        System.out.println(twoDaysLater);

        Thread.sleep(2000);

        for (int x = 4; x < 7; x++) {
            for (int y = 1; y < 8; y++) {
                String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup["+x+"]/android.widget.FrameLayout["+ y + "]/android.widget.TextView";
                MobileElement wantedElement = appiumDriver.findElementByXPath(xpath);
                String wantedElementText = wantedElement.getText();
                System.out.println(wantedElementText);
                if (wantedElementText.equals(s)) {
                    wantedElement.click();
                    wantedElement.click();
                    break;
                }

            }

        }

    }

    @Step("Tamama basildi")
    public void doneClick()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(DONE))).click();
    }

    @Step("Yetiskin sayisi bir arttirildi")
    public void adultPlus()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(YETISKIN))).click();
    }

    @Step("Ucus araya tiklandi")
    public void searchFlight()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(UCUS_ARA))).click();
    }

    @Step("Liste kontrol edildi")
    public void controllingList()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(LISTE)));
        Assert.assertEquals( "SORT AND FILTER", appiumDriver.findElementById(LISTE).getText());
    }

    @Step("Ucus secildi")
    public void choosingFlight()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(UCUS_SEC))).click();
    }

    @Step("Ekonomik ucus secildi")
    public void choosingEcoFlight()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EKONOMIK))).click();
    }

    @Step("Devama tiklandi")
    public void clickingContinue()  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(DEVAM))).click();
    }

}
