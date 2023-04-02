package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class S3 extends BaseDriver {
    @Test
    public void Soru3(){

        //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        // (https://testpages.herokuapp.com/styled/index.html)
        //[Find By Playground'a tıklayınız.](https://testpages.herokuapp.com/find_by_playground.php)
        // 5. text'i bulunuz.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(1);
        WebElement findByPly=driver.findElement(By.id("findbytest"));
        findByPly.click();

        MyFunc.Bekle(1);
        WebElement besinciText=driver.findElement(By.cssSelector("[class='specialDiv']>:nth-child(5)"));
        System.out.println(besinciText.getText());



        BekleKapat();
    }
}
