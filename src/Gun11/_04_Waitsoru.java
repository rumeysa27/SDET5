package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Senaryo
//1-  https://www.demoblaze.com/index.html  siteyi açınız.
//2- Samsung galaxy s6  linkine tıklayınız.
//3- Sepete ekleyiniz.
//4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
// */

public class _04_Waitsoru extends BaseDriver {
    @Test
    public void Wait1(){
        //locator bulmasıyla ilgili bekletmeler için
        //bütün elemanlarda geçerli ve sadece bir kez
        //yazılan bekletme : imlicitlyWait
        //-- elemente özel ve her türlü değişimi süresiyle
        //ilgili sadece o elemente çalışan bekletme
        //ExplicitWait
        //MyFunc.Bekle : verilen süre kadar
        //intelliji durduruyor


        driver.get("https://www.demoblaze.com/index.html");

        WebElement link=driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepetLink=driver.findElement(By.linkText("Add to cart"));
        sepetLink.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());//alert çıkana kadar bekle

        driver.switchTo().alert().accept();//alerti kapatma böyle yapılıyor


        WebElement anaSayfa=driver.findElement(By.id("nava"));
        anaSayfa.click();


        BekleKapat();

        //        public static boolean isAlertPresent(){
//            try{
//                driver.switchTo().alert();
//                return true;
//            }catch(NoAlertPresentException ex){
//                return false;
//            }
//        }  bu fonksiyonla alert var mı yok mu bakıyor try catch ile kesin varsa bunu kullanma zaten

    }
}
