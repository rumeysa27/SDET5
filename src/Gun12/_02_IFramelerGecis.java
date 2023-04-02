package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGecis extends BaseDriver {

    @Test
    public void Test1(){
        //Senaryo :
  // https://chercher.tech/practice/frames sitesine gidiniz
  // Ekranda gözüken ilk kutucuğa Türkiye yazınız.
  // Daha sonra animals dan seçeneklerinden avatar ı seçiniz.

        driver.get("https://chercher.tech/practice/frames");

       driver.switchTo().frame(0);//0. indexe geçtim yani birinci frame

        WebElement input=driver.findElement(By.xpath("//b[@id='topic']//following::input"));//** b[id='topic']+input bu cssSelectorı
        input.sendKeys("Türkiye");

        // ** //b[@id='topic']/following-sibling::input -> xpath
        // * b[id='topic']~input -> cssSelector de bulma kardeşi de
        // * #topic+input  -> id nin kısası #   kardeşleri bulmanın diğer yolları

        driver.switchTo().defaultContent();//ana sayfaya geri döndüm
       // driver.switchTo().parentFrame();// bu da aynı işlemi yapıyor çünkü bir kademe içeri girmiştim

        driver.switchTo().frame(1);//2.frame geçtim
        WebElement webSelect=driver.findElement(By.id("animals"));//selectle başlıyo
        Select  nesneSelect=new Select(webSelect);
        nesneSelect.selectByVisibleText("Avatar");



        BekleKapat();
    }
}
