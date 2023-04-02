package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1(){
      driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(1);

        //actions select le tip olarak benzer ama selcet tek webelementte oluyor actions tüm webelementlerde

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();//bu işlemi uygula


        //bu iki yöntemi de yapabiliriz yukardailere alternatif olarak ama yukarısı daha çok kullacağımız yöntemler
        //aksiyonlar.doubleClick(element);
        //aksiyonlar.moveToElement(element).doubleClick().build().perform();












        BekleKapat();

    }
}
