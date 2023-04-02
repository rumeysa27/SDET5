package OdevXpath_23Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S4 extends BaseDriver {
    @Test
    public void Test4() {
        //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        //Calculate'e tıklayınız.
        //    İlk input'a herhangi bir sayı giriniz.
        //    İkinci input'a herhangi bir sayı giriniz.
        //Calculate button'una tıklayınız.
        //Sonucu alınız.
        //Sonucu yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement clct=driver.findElement(By.xpath("//a[@id='calculate']"));
        clct.click();
        MyFunc.Bekle(2);

        WebElement inpt1=driver.findElement(By.xpath("//input[@type='text']"));
        inpt1.sendKeys("869456");
        MyFunc.Bekle(2);

        WebElement inpt2=driver.findElement(By.xpath("//input[@type='text'][@id='number2']"));//veya //[@id='number2']
        inpt2.sendKeys("244612");
        MyFunc.Bekle(2);

        WebElement bttn=driver.findElement(By.xpath("//input[@type='submit'][@id='calculate']"));
        bttn.click();
        MyFunc.Bekle(2);

        WebElement sonuc=driver.findElement(By.xpath("//span[@id='answer']"));
        sonuc.getText();
        System.out.println(sonuc.getText());




        BekleKapat();

    }
}
