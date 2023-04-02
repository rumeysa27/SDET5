package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleContainer"));
       // element.sendKeys("Ahmet"); bu yapılır ama hoca yön tuşlarını nasıl kullancaz diye gösterdi

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar
                .moveToElement(element)//kutucuğa at
                .click()//içine tıklat
                .keyDown(Keys.SHIFT)//shift e bas
                .sendKeys("a")//shift+a  ->A
                .keyUp(Keys.SHIFT)//shift i bırak gerisini küçük yazsın diye
                .sendKeys("hmet")//yazıyı gönder
                .build();//aksiyon hazırlandı

        //yukarda heer türlü hazırlık gerçekleştkten sonra perform yaptık
        MyFunc.Bekle(2);
        aksiyon.perform();//gerçekleştirildi



        BekleKapat();
    }
}
