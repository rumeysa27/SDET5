package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import javax.swing.*;

public class _02_ActionsClickTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksiyonlar=new Actions(driver);//web saydası aksiyona açıldı

        Action aksiyon=  aksiyonlar.moveToElement(element).click().build();//movetoelemenet element üzerine git
        //elementin üzerine cl,ck için git orada bekle, aksiyonu hazırla
        System.out.println("Aksiyon hazırlandı");

        aksiyon.perform();//aksiyonu işleme al uygula veya gerçekleştir bla bla işte
       // aksiyonlar.moveToElement(element).click().build().perform();//böyle tek adımda da yapabilirsn yukardakilere gerek kalmadan
        System.out.println("Aksiyon gerçekleşti");






        BekleKapat();




    }
}
