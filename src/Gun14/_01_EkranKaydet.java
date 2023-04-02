package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("rümeysa");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();


        //hatalı ise çıkan alert locatorı
        List<WebElement> hataMesaji=driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size()>0){//hata varsa ekran kaydet
            System.out.println("Hata oluştu");
           //hata olmasını beklediğimiz test NEGATİF testtir bu da geçerli bir  testtir yani olmayacağıını beklediğimiz test olmuyorsa..

           TakesScreenshot ts=(TakesScreenshot) driver;//1.aşama ekran görüntüsü alma değişkeni tanımlandı
          File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);//dosya olarak kaydetmesini istediğimiz için file ı seçtik
        //hafızadaki bu bilgiyi dosya olarak kaydet.
            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri\\screenshot.png"));

        }

        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //  biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
        //  bunu nasıl yaparsınız
        //  LocalDateTime alıcaksın bilgileri
        //  YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        MyFunc.Bekle(2);
        BekleKapat();











    }
}
