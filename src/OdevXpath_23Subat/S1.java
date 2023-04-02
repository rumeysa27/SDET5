package OdevXpath_23Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S1 extends BaseDriver {
    @Test
    public  void Test1 () {

        // 1) Bu siteye gidin. -> http://demoqa.com/text-box
        //  2) Full Name kısmına "Automation" girin.
        //  3) Email kısmına "Testing@gmail.com" girin.
        //  4) Current Address kısmına "Testing Current Address" girin.
        //  5) Permanent Address kısmına "Testing Permanent Address" girin.
        //  6) Submit butonuna tıklayınız.
        //  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        //  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

        driver.get("https://demoqa.com/text-box");

        String mesaj="Automation";
        String eMail="Testing@gmail.com";

        WebElement fulNam=driver.findElement(By.xpath("//input[@id='userName']"));
        fulNam.sendKeys(mesaj);
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys(eMail);
        MyFunc.Bekle(2);

        WebElement adres=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        adres.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement perAdrs=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        perAdrs.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        MyFunc.Bekle(2);

        WebElement name=driver.findElement(By.id("name"));
        WebElement emailElement=driver.findElement(By.id("email"));

        Assert.assertTrue(name.getText().contains(mesaj));
        Assert.assertTrue(emailElement.getText().contains(eMail));


        BekleKapat();

    }
}
