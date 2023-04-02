package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S5 extends BaseDriver {
    @Test
    public void Soru5(){
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //Calculate'e tıklayınız.
        //         İlk input'a herhangi bir sayı giriniz.
        //         İkinci input'a herhangi bir sayı giriniz.
        //Calculate button'una tıklayınız.
        //Sonucu alınız.
        //Sonucu yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement calculate=driver.findElement(By.id("calculate"));
        calculate.click();

        MyFunc.Bekle(1);
        WebElement input1=driver.findElement(By.cssSelector("#number1"));
        input1.sendKeys("56789");

        MyFunc.Bekle(1);
        WebElement input2=driver.findElement(By.xpath("//*[@id='number2']"));
        input2.sendKeys("123456");

        MyFunc.Bekle(1);
        WebElement submit=driver.findElement(By.id("calculate"));
        submit.click();

        MyFunc.Bekle(1);
        WebElement answer=driver.findElement(By.xpath("//*[@id='answer']"));
        answer.getText();
        System.out.println(answer.getText());



        BekleKapat();


    }
}
