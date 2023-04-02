package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");

        //şu aşamada anasayfadayım burda bulunduğum windowid yi bulmak için de

        String anasayfaWindowId=driver.getWindowHandle();//bu da o an hangi sayfadaysan onun id sini veriyor handle
        System.out.println("anasayfaWindowId= "+ anasayfaWindowId);


      List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));

      for (WebElement link: linkler)
          if (!link.getAttribute("href").contains("mail"))//eğer hrefin özelliğinde mail yoksa tıklat maile girmesini istemiyoruz
          link.click();

      //şu açamada açılan tüm sayfalar
      Set<String> windowsIdler= driver.getWindowHandles();//açılan windowsların id lerini veriyor handles set tipiyle veriyor
        for (String id: windowsIdler)
            System.out.println("id ="+ id);


        driver.switchTo().window(anasayfaWindowId);//geri anasayfaya geçmek için de bunu kullan





        MyFunc.Bekle(10);
        BekleKapat();
    }
}
