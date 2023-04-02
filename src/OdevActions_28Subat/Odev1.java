package OdevActions_28Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class Odev1 extends BaseDriver {
    @Test
    public void Test1(){
        //Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
        //buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri
        // doğru ülkere dağıtınız.

        ////seçili element/following-sibling::div[1]  XPATH yandaki kardeşi alma

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions aksiyonlar =new Actions(driver);

        Map<String, String> cevaplar = new HashMap<>();
        cevaplar.put("a8", "//div[@id='q8']/following-sibling::div[1]");
        cevaplar.put("a14", "//div[@id='q14']/following-sibling::div[1]");
        cevaplar.put("a12", "//div[@id='q12']/following-sibling::div[1]");
        cevaplar.put("a4", "//div[@id='q4']/following-sibling::div[1]");
        cevaplar.put("a11", "//div[@id='q11']/following-sibling::div[1]");
        cevaplar.put("a1", "//div[@id='q1']/following-sibling::div[1]");
        cevaplar.put("a6", "//div[@id='q6']/following-sibling::div[1]");
        cevaplar.put("a9", "//div[@id='q9']/following-sibling::div[1]");
        cevaplar.put("a7", "//div[@id='q7']/following-sibling::div[1]");
        cevaplar.put("a10", "//div[@id='q10']/following-sibling::div[1]");
        cevaplar.put("a15", "//div[@id='q15']/following-sibling::div[1]");
        cevaplar.put("a5", "//div[@id='q5']/following-sibling::div[1]");
        cevaplar.put("a13", "//div[@id='q13']/following-sibling::div[1]");
        cevaplar.put("a2", "//div[@id='q2']/following-sibling::div[1]");
        cevaplar.put("a3", "//div[@id='q3']/following-sibling::div[1]");



        for (Map.Entry<String, String> cevap : cevaplar.entrySet()) {
            WebElement sehir = driver.findElement(By.id(cevap.getKey()));
            WebElement ulke = driver.findElement(By.xpath(cevap.getValue()));

            aksiyonlar.clickAndHold(sehir).build().perform();
            MyFunc.Bekle(1);
            aksiyonlar.moveToElement(ulke).release().build().perform();
            MyFunc.Bekle(1);
        }

        BekleKapat();


/*
        MyFunc.Bekle(1);
        WebElement london=driver.findElement(By.id("a8"));
        WebElement uK=driver.findElement(By.className("destinationBox"));
        MyFunc.Bekle(1);
        aksiyonlar.dragAndDrop(london,uK).build().perform(); */

      /*  WebElement london=driver.findElement(By.id("a8"));
        aksiyonlar.clickAndHold(london).build().perform();
        MyFunc.Bekle(2);
        WebElement uK=driver.findElement(By.xpath("//div[@id='q8']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(uK).release().build().perform();
        MyFunc.Bekle(2);


        WebElement madrid=driver.findElement(By.id("a6"));
        aksiyonlar.clickAndHold(madrid).build().perform();
        MyFunc.Bekle(2);
        WebElement spain=driver.findElement(By.xpath("//div[@id='q6']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(spain).release().build().perform();
        MyFunc.Bekle(2);

        WebElement newDehli=driver.findElement(By.id("a12"));
        aksiyonlar.clickAndHold(newDehli).build().perform();
        MyFunc.Bekle(2);
        WebElement india=driver.findElement(By.xpath("//div[@id='q12']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(india).release().build().perform();
        MyFunc.Bekle(2);

        WebElement stockHolm=driver.findElement(By.id("a2"));
        aksiyonlar.clickAndHold(stockHolm).build().perform();
        MyFunc.Bekle(2);
        WebElement sweden=driver.findElement(By.xpath("//div[@id='q2']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(sweden).release().build().perform();
        MyFunc.Bekle(2);

        WebElement vienna=driver.findElement(By.id("a9"));
        aksiyonlar.clickAndHold(vienna).build().perform();
        MyFunc.Bekle(2);
        WebElement austria=driver.findElement(By.xpath("//div[@id='q9']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(austria).release().build().perform();
        MyFunc.Bekle(2);

        WebElement rome=driver.findElement(By.id("a10"));
        aksiyonlar.clickAndHold(rome).build().perform();
        MyFunc.Bekle(2);
        WebElement italy=driver.findElement(By.xpath("//div[@id='q10']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(italy).release().build().perform();
        MyFunc.Bekle(2);

        WebElement washington=driver.findElement(By.id("a4"));
        aksiyonlar.clickAndHold(washington).build().perform();
        MyFunc.Bekle(2);
        WebElement uSa=driver.findElement(By.xpath("//div[@id='q4']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(uSa).release().build().perform();
        MyFunc.Bekle(2);

        WebElement paris=driver.findElement(By.id("a5"));
        aksiyonlar.clickAndHold(paris).build().perform();
        MyFunc.Bekle(2);
        WebElement france=driver.findElement(By.xpath("//div[@id='q5']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(france).release().build().perform();
        MyFunc.Bekle(2);

        WebElement athens=driver.findElement(By.id("a7"));
        aksiyonlar.clickAndHold(athens).build().perform();
        MyFunc.Bekle(2);
        WebElement greece=driver.findElement(By.xpath("//div[@id='q7']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(greece).release().build().perform();
        MyFunc.Bekle(2);

        WebElement copenhagen=driver.findElement(By.id("a3"));
        aksiyonlar.clickAndHold(copenhagen).build().perform();
        MyFunc.Bekle(2);
        WebElement denmark=driver.findElement(By.xpath("//div[@id='q3']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(denmark).release().build().perform();
        MyFunc.Bekle(2);

        WebElement oslo=driver.findElement(By.id("a1"));
        aksiyonlar.clickAndHold(oslo).build().perform();
        MyFunc.Bekle(2);
        WebElement norway=driver.findElement(By.xpath("//div[@id='q1']/following-sibling::div[1]"));
       aksiyonlar.moveToElement(norway).release().build().perform();
        MyFunc.Bekle(2);

       WebElement nairobi=driver.findElement(By.id("a13"));
        aksiyonlar.clickAndHold(nairobi).build().perform();
        MyFunc.Bekle(2);
        WebElement kenya=driver.findElement(By.xpath("//div[@id='q13']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(kenya).release().build().perform();
        MyFunc.Bekle(2);

        WebElement santiago=driver.findElement(By.id("a11"));
        aksiyonlar.clickAndHold(santiago).build().perform();
        MyFunc.Bekle(2);
        WebElement chile=driver.findElement(By.xpath("//div[@id='q11']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(chile).release().build().perform();
        MyFunc.Bekle(2);

        WebElement hanoi=driver.findElement(By.id("a15"));
        aksiyonlar.clickAndHold(hanoi).build().perform();
        MyFunc.Bekle(2);
        WebElement vietnam=driver.findElement(By.xpath("//div[@id='q15']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(vietnam).release().build().perform();
        MyFunc.Bekle(2);


        WebElement kualaLumpur=driver.findElement(By.id("a14"));
        aksiyonlar.clickAndHold(kualaLumpur).build().perform();
        MyFunc.Bekle(2);
        WebElement malezya=driver.findElement(By.xpath("//div[@id='q14']/following-sibling::div[1]"));
        aksiyonlar.moveToElement(malezya).release().build().perform();
        MyFunc.Bekle(2);   */




    }
}
