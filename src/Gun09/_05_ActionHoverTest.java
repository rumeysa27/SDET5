package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionHoverTest extends BaseDriver {
    @Test
    public void Test1 (){
        driver.get("https://www.hepsiburada.com/");
        //click dobule click bunlar yok sadece aksiyonun üstüne gelme işlemi var burada
        //mouse üzerine geldiğinde işlemi gerçekleştir

        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        //<span>  Moda  </span> arasındaki text xpathle //span[text()='Moda'] şeklinde alınır
        MyFunc.Bekle(1);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).build();//üzerine gel oluştur
        aksiyon.perform();//uygula






        BekleKapat();




    }
}
