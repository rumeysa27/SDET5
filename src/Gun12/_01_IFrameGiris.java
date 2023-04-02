package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://chercher.tech/practice/frames");

       // id=frame1 name=iamframe//index? bulunduğu sayfadaki kod sırası
        driver.switchTo().frame(0);//name ve id oldukça yavaş çalışıyor, index hızlı <iframe böyle aratman lazım

        WebElement input=driver.findElement(By.cssSelector("b[id='topic']+input"));////b[@id='topic']//following::input bu xpathi
        input.sendKeys("Türkiye");

        //iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım(switchTo ile yapılacak o işlem)
        //driver.switchTo().frame(0);//ilgili odaya(iframe) geç
       // driver.switchTo().parentFrame();//bir önceki odaya(parente) geçer
       // driver.switchTo().defaultContent();//ilk ana sayfaya direkt geçer(yine anasayfaya git)


        //bir sayfada iframe olduğunu inceleme yap kısmında sondan üçüncü yerde Wiew frame source(çerçeve kaynağını görüntüle çıkar)
        //sayfayı incelerken öyle farkedebilirsin

        BekleKapat();
    }
}
