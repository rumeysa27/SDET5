package Mentoring;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DersXpath extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://demo.nopcommerce.com/");

        WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("adminTechno@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));// ** //input[contains(@class,'email')] böyle de olur
        password.sendKeys("Admin123");
        MyFunc.Bekle(1);

        WebElement giris=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        giris.click();














       // BekleKapat();
    }
}
