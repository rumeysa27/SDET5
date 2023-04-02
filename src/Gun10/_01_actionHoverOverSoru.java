package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_actionHoverOverSoru extends BaseDriver {
    @Test
    public void Test1(){
        // https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.


        driver.get("https://www.etsy.com/");

        Actions aksiyonlar=new Actions(driver);

        WebElement jewellery=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement neckless=driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibNeckless=driver.findElement(By.id("catnav-l3-10881"));

        aksiyonlar.moveToElement(jewellery).build().perform();//bu aralara bekleme koymazsan hata veriyo açılana kadar bekletmen  gerekiyor
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(neckless).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bibNeckless).click().build().perform();
        MyFunc.Bekle(2);

        System.out.println("driver.getCurrentUrl()= "+ driver.getCurrentUrl());

       Assert.assertTrue("Url de bib neckless var mı?",driver.getCurrentUrl().contains("bib-necklaces")); //url nin son kısmı




        BekleKapat();
    }
}
