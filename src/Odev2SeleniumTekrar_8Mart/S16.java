package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S16 extends BaseDriver {
    @Test
    public void Soru16(){
        //Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        //Input Forms'a tıklayınız. //Radio buttons Demo'a tıklayınız. //Get checked value buttonuna tıklayınız.
        //" **Radio button is Not checked** " görüntülenmelidir. //Male Radio buttonuna tıklayınız.
        //Get checked value buttonuna tıklayınız. //" **Radio button 'Male' is checked** " görüntülenmelidir.
        //Female Radio button'a tıklayınız //Get Checked Value buttonuna tıklayınız.
        //" **Radio button 'Female' is checked** " görüntülenmelidir.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        MyFunc.Bekle(1);
        WebElement inputForm=driver.findElement(By.linkText("Input Forms"));
        inputForm.click();

        MyFunc.Bekle(1);
        WebElement radioBttnDemo=driver.findElement(By.linkText("Radio Buttons Demo"));
        radioBttnDemo.click();

        MyFunc.Bekle(2);
        WebElement getCheckedValue=driver.findElement(By.id("buttoncheck"));
        getCheckedValue.click();

        MyFunc.Bekle(1);
        WebElement notChecked=driver.findElement(By.xpath("//p[text()='Radio button is Not checked']"));
        //notChecked.isDisplayed();
        Assert.assertEquals(notChecked.getText(),"Radio button is Not checked");

        MyFunc.Bekle(1);
        WebElement maleBttn=driver.findElement(By.xpath("//input[@type='radio'][@value='Male']"));
        maleBttn.click();

        MyFunc.Bekle(2);
        getCheckedValue.click();

        MyFunc.Bekle(1);
        WebElement isChecked=driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]"));
       // isChecked.isDisplayed();
        Assert.assertEquals(isChecked.getText(),"Radio button 'Male' is checked");

        MyFunc.Bekle(1);
        WebElement femaleBttn=driver.findElement(By.xpath("//input[@type='radio'][@value='Female']"));
        femaleBttn.click();

        MyFunc.Bekle(2);
        getCheckedValue.click();

        WebElement femaleIsChecked=driver.findElement(By.className("radiobutton"));
        Assert.assertEquals(femaleIsChecked.getText(),"Radio button 'Female' is checked");


        BekleKapat();




    }
}
