package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

      /*  // acceptAll
        driver.switchTo().frame(8); // name:  gdpr-consent-notice

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

        List<WebElement> acceptAll=
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        if (acceptAll.size() > 0)
            acceptAll.get(0).click(); */

        /*********************/

        Robot rbt= new Robot();

        for (int i = 0; i < 21 ; i++) {
             MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı.  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor
        StringSelection dosyaYolu = new StringSelection("\"C:\\Users\\LENOVO\\Desktop\\notlar.txt\"");//buraya yol olarak kopyaladığımızı yapştırdık
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        //sağtuş shifte basılıyken (copy as path e yani yol olarak kopyalaya tıkla)

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER); // dosya Entera basılarak gönderildi
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        // checkBox gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE); // çeklendi
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        // butona gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER); // enterlandı
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement mesaj=wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());

        BekleKapat();
    }
}
