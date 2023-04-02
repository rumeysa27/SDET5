package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
//        Name giriniz.
//        Comment giriniz.
//        Submit'e tıklayınız.
//        Form submited Successfully! yazısı görüntülenmelidir.
//        assert ile kontrol ediniz

public class _03_FillingFormTask extends BaseDriver {
    @Test
    public void Wait1(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Rümeysa");

        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("Bakır");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        //implicitlyWait elemanın locator bulması süresiyle ilgili, buradaki elemanlar zaten bulunuyor
        //ama buradaki kriter bulunan elemanın görünen yazısının oluşma süresi yani exceptedCondition
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//find elementte kullanılıyor
        WebDriverWait bekle= new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
        //beklediğim kriterlerden texti bu olana kadar bekle, sol tarafa locatorı ver sağ tarafa value sini ver


        WebElement msj=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",msj.getText());


        BekleKapat();
    }
}
