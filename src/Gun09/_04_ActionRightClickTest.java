package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(1);

        Actions aksiyonlar=new Actions(driver);

        Action aksyion=aksiyonlar.moveToElement(element).contextClick().build();//sağ tık yapınca ona contextclick deniliyor ondan yaptık
        //contextclick=rightclikle aynı ikisi de


       //Actions sadece webelementelrde yani sayfyaya ait elementlerde kullanılır
        //aksiyonlar.moveToElement(element).contextClick().build().perform();
       // new Actions(driver).contextClick(element).build().perform();


        BekleKapat();
    }
}
