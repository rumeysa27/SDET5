package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S12 extends BaseDriver {
    @Test
    public void Soru12(){
        //Bu siteye gidiniz.  http://demo.seleniumeasy.com/basic-first-form-demo.html
        //Input forms'a tıklayınız.
        //Ajax from Submit'e tıklayınız.
        //Name giriniz.
        //Comment giriniz.
        //Submit'e tıklayınız.
        // Form submited Successfully! yazısı görüntülenmelidir.
        //Yazıyı yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        MyFunc.Bekle(1);
        WebElement inputForms=driver.findElement(By.linkText("Input Forms"));
        inputForms.click();

        WebElement ajaxFrom=driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
        ajaxFrom.click();

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Rümeysa");

        WebElement comment=driver.findElement(By.xpath("//textarea[@id='description']"));
        comment.sendKeys("yorumsuzum nnnalann:))");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        MyFunc.Bekle(1);
        WebElement succesMessage=driver.findElement(By.xpath("//div[text()='Form submited Successfully!']"));
        succesMessage.isDisplayed();
        System.out.println(succesMessage.getText());

        BekleKapat();
    }
}
