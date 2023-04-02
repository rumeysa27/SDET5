package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Soru extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.facebook.com/");

        // List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        //  if (cookiesAccept.size() > 0)  bu kısımları kod hata vermesin diye yaptı hoca
        //  cookiesAccept.get(0).click();
        //  MyFunc.Bekle(1);

        WebElement yeniHesap=driver.findElement(By.linkText("Yeni hesap oluştur"));
        yeniHesap.click();
        MyFunc.Bekle(1);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Rümeysa");
        MyFunc.Bekle(1);

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Bakır");
        MyFunc.Bekle(1);

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());//görünmediği için false vercek
        System.out.println("reEmail.isDisplayed()= "+ reEmail.isDisplayed());
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("rümbak@hotmail.com");
        MyFunc.Bekle(1);

        WebElement emailTekrar=driver.findElement(By.name("reg_email_confirmation__"));
        emailTekrar.sendKeys("rümbak@hotmail.com");

        Assert.assertTrue(reEmail.isDisplayed());//şimi görünmesi lazım
        System.out.println("reEmail.isDisplayed()= "+ reEmail.isDisplayed());

        WebElement sifre=driver.findElement(By.name("reg_passwd__"));
        sifre.sendKeys("12345");


        WebElement webDay=driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("17");
        MyFunc.Bekle(1);

        WebElement webMonth=driver.findElement(By.id("month"));
        Select month= new Select(webMonth);
        month.selectByVisibleText("Haz");//ekranda haz olarak gözüktüğü şekliyle byvisible o manada
       // month.selectByValue("6");//böyle değerine göre de seçebilirsin value ile iki şekilde de yapabilirsin
        MyFunc.Bekle(1);

        WebElement webYear=driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1994");
        MyFunc.Bekle(1);

        WebElement cinsyt=driver.findElement(By.xpath("//input[@type='radio'][@value='1']"));
        cinsyt.click();
        MyFunc.Bekle(1);

        WebElement submit=driver.findElement(By.name("websubmit"));
        submit.click();
        MyFunc.Bekle(1);


        BekleKapat();





    }
}
