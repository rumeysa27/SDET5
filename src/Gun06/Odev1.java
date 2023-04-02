package Gun06;

import Utility.BaseDriver;

import Utility.MyFunc;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector
    @Test
    public void Test1 () {
        //id lerde sıkıntı varsa başka türlü [type='radio'][value='Business'] olarak daha sağlam bulabilirsin
        //bunların en başına input koyarsan daha da sağlam olur ama genelde yukardaki iki kriter yeter

        driver.get("https://formsmarts.com/form/yu?mode=h5");

       //u_LHc_4586 direkt name den böyle bu cssSelector locator ı değil ondan hata verdi //[id^='u_']
        WebElement bsns=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        bsns.click();
        MyFunc.Bekle(3);


        WebElement onlineAd=driver.findElement(By.cssSelector("[id$='_4588']"))  ;//id si $bunla biten manasına geliyo
        onlineAd.click();
        MyFunc.Bekle(3);

        WebElement smb=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        smb.click();
        MyFunc.Bekle(3);

        WebElement evryDy=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        evryDy.click();
        MyFunc.Bekle(3);

        WebElement good=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        good.click();
        MyFunc.Bekle(3);

        WebElement usingX=driver.findElement(By.cssSelector("[id$=_4597]")) ; //bu ve aşağıdaki id ler aynı daha özele inemedim
        usingX.click();
        MyFunc.Bekle(3);

         WebElement secenk=driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        secenk.click();
        MyFunc.Bekle(3);

        //driver.findElement(By.xpath());

       /* cssSelector olmayan 2 hareket var

        elemandan geri gitme
        ekrandan gözüken yazısı ile bulma
        By.Id("firstName");
        By.Name("firstName");
        By.cssSelector("[id='firstName']")
        By.xpath(" //[@id='firstName']   ") */


        BekleKapat();


    }
}
