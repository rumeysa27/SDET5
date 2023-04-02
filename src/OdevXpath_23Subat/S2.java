package OdevXpath_23Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S2 extends BaseDriver {
    @Test
    public void Test2() {
        //1) Bu siteye gidin. -> https://demo.applitools.com/
        //2) Username kısmına "ttechno@gmail.com" girin.
        //3) Password kısmına "techno123." girin.
        //4) "Sign in" buttonunan tıklayınız.
        //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        driver.get("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.xpath("//input[@class='form-control']"));//burada input id almadı
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement passw=driver.findElement(By.xpath("//input[@id='password']"));//burada da classı almadı
        passw.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement login=driver.findElement(By.xpath("//a[@id='log-in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement yazi=driver.findElement(By.xpath("//h6[@id='time']"));
        String msj="Your nearest branch closes in: 30m 5s";
        Assert.assertTrue(yazi.getText().equals(msj));



        BekleKapat();

        //xpath lerde
        //aradığımız elemanın kendi tag ını yazıyoruz yani (<)bunun hemen yanındakini örn:<input - <div - <h2- <span gibi
        //hrefler tag değil attribute olarak geçiyor (*)bu da tüm elemanları ara oluyor
        //a[@]  veya //input[@] - //div[@] //span[@]
    }
}
