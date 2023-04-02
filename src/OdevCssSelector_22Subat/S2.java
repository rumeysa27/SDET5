package OdevCssSelector_22Subat;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S2 extends BaseDriver {
    @Test
    public  void Test2 () {
      //  1) Bu siteye gidin. -> https://demo.applitools.com/
      //  2) Username kısmına "ttechno@gmail.com" girin.
       // 3) Password kısmına "techno123." girin.
        // 4) "Sign in" buttonunan tıklayınız.
      //  5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

        driver.get("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.cssSelector("[id='username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement passw=driver.findElement(By.cssSelector("[id='password']"));
        passw.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement login=driver.findElement(By.cssSelector("[id='log-in']"));
        login.click();
        MyFunc.Bekle(2);

        WebElement yazi=driver.findElement(By.cssSelector("[id='time']"));
        String mesaj="Your nearest branch closes in: 30m 5s";
        Assert.assertTrue(yazi.getText().equals(mesaj));


       // if (login.getText().equals(mesaj))
       //     System.out.println("Test passed");
       // else System.out.println("Test fail");

        BekleKapat();



    }
}
