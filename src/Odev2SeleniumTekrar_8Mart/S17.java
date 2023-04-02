package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S17 extends BaseDriver {
    @Test
    public void Soru17(){
        //Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        //Input forms'a tıklayınız.//Radio buttons Demo'ya tıklayınız.//Group Radio Buttons Demo tablosunda;
        //male'a tıklayınız//0 to 5'e tıklayınız.//Sonucu yazdırınız.//Sonuç **Sex : Male   Age group: 0 - 5** olmalıdır**.**
        //5 to 15' tıklayınız.//Sonucu yazdırınız.//Sonuç **Sex : Male   Age group: 5 - 15** olmalıdır.
        //15 to 50'ye tıklayınız.//Sonucu yazdırınız.//Sonuç **Sex : Male   Age group: 15 - 50** olmalıdır.
        //female'a tıklayınız.//0 to 5'e tıklayınız.//Sonucu yazdırınız.
        // Sonuç **Sex : female Age group: 0 - 5** olmalıdır. //5 to 15'e tıklayınız.//Sonucu yazdırınız.
        //Sonuç  **Sex : female Age group: 5 - 15** olmalıdır.
        //15 to 50'ye tıklayınız.//Sonucu yazdırınız.//Sonuç  **Sex : female Age group: 15 - 50** olmalıdır.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        MyFunc.Bekle(1);
        WebElement inputForm=driver.findElement(By.linkText("Input Forms"));
        inputForm.click();

        MyFunc.Bekle(1);
        WebElement radioBttnDemo=driver.findElement(By.linkText("Radio Buttons Demo"));
        radioBttnDemo.click();

        MyFunc.Bekle(1);
        WebElement male=driver.findElement(By.xpath("//input[@type='radio'][@name='gender']"));
        male.click();

        MyFunc.Bekle(1);
        WebElement sifirBes=driver.findElement(By.xpath("//input[@type='radio'][@value='0 - 5']"));
        sifirBes.click();

        MyFunc.Bekle(1);
        WebElement getValues=driver.findElement(By.xpath("//button[text()='Get values']"));
        getValues.click();

        WebElement sonucMesaji=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println( sonucMesaji.getText());

        MyFunc.Bekle(2);
        WebElement besOnBes=driver.findElement(By.xpath("//input[@type='radio'][@value='5 - 15']"));
        besOnBes.click();

        getValues.click();

        MyFunc.Bekle(2);
        WebElement sonucMesaji2=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(sonucMesaji2.getText());

        MyFunc.Bekle(1);
        WebElement onBesElli=driver.findElement(By.xpath("//input[@type='radio'][@value='15 - 50']"));
        onBesElli.click();

        getValues.click();

        MyFunc.Bekle(2);
        WebElement sonucMesaji3=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(sonucMesaji3.getText());

        WebElement female=driver.findElement(By.xpath("//input[@name='gender'][@value='Female']"));
        female.click();

        MyFunc.Bekle(1);
        sifirBes.click();
        getValues.click();

        MyFunc.Bekle(1);
        WebElement sonucMesaji4=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(sonucMesaji4.getText());

        MyFunc.Bekle(1);
        besOnBes.click();
        getValues.click();

        MyFunc.Bekle(1);
        WebElement sonucMesaji5=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(sonucMesaji5.getText());

        MyFunc.Bekle(1);
        onBesElli.click();
        getValues.click();

        MyFunc.Bekle(1);
        WebElement sonucMesaji6=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(sonucMesaji6.getText());

        BekleKapat();




    }
}
