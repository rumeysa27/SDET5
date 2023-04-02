package OdevCssSelector_22Subat;

import Utility.BaseDriver;
import Utility.MyFunc;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class S1 extends BaseDriver {
    @Test
    public void Test1 () {
        /*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın*/

        driver.get("https://demoqa.com/text-box");

        String mesaj="Automation";
        String eMail="Testing@gmail.com";

        WebElement fulNam=driver.findElement(By.cssSelector("[id='userName']"));
        fulNam.sendKeys(mesaj);
        MyFunc.Bekle(3);

        WebElement email=driver.findElement(By.cssSelector("[id='userEmail']"));
        email.sendKeys(eMail);
        MyFunc.Bekle(3);

        WebElement adres=driver.findElement(By.cssSelector("[id='currentAddress']"));
        adres.sendKeys("Testing Current Address");
        MyFunc.Bekle(3);

        WebElement perAdrs=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        perAdrs.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(3);


        WebElement submit=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        submit.click();
        MyFunc.Bekle(2);



        WebElement name=driver.findElement(By.id("name"));
        WebElement emailElement=driver.findElement(By.id("email"));

        Assert.assertTrue(name.getText().contains(mesaj));
        Assert.assertTrue(emailElement.getText().contains(eMail));

        BekleKapat();

    }
}
