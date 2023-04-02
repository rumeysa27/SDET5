package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {
    @Test
    public void Test1(){
        //  Senaryo:
        //    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
        //    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
        //    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.

        driver.get("https://www.selenium.dev/");

        String anasayfaWindowId=driver.getWindowHandle();

        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link: linkler)
            if (!link.getAttribute("href").contains("mail"))//eğer hrefin özelliğinde mail yoksa tıklat
                link.click();
        //bu aşamada tüm sayfalar açıldı yukarda



        Set<String> windowsIdler=driver.getWindowHandles();
        for (String id: windowsIdler){

            MyFunc.Bekle(2);
            driver.switchTo().window(id);//sıradaki tabdaki window a geçti şuan
            System.out.println("title="+ driver.getTitle()+", url"+ driver.getCurrentUrl());
        } //her bir sayfyaya geçip url ve title ını yazdırma

        for (String id: windowsIdler){
            if (id.equals(anasayfaWindowId))//anasayfanın haricindekileri kapatmak için böyle yaptık
                continue;

            driver.switchTo().window(id);//sıradaki tabdaki window a geçti şuan
            System.out.println("title="+ driver.getTitle()+", url"+ driver.getCurrentUrl());
            driver.close();//hepsine geldiğinde bulunduğun yeri kapatma şekli
        }












        BekleKapat();


    }
}
