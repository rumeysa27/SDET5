package OdevCssSelector_22Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S5 extends BaseDriver {
    @Test
    public  void Test5 () {
        //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        //Fake Alerts' tıklayınız.
        //Show Alert Box'a tıklayınız.
        //Ok'a tıklayınız.
        //Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAl=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAl.click();
        MyFunc.Bekle(2);

        WebElement showAl=driver.findElement(By.cssSelector("input[id='fakealert']"));
        //input[id='fakealert'][type='button'] daha sağlam istersen böyle yap
        showAl.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.cssSelector("[id='dialog-ok']"));
        //veya [id='dialog-ok'][class='dialog-button']
        ok.click();
        MyFunc.Bekle(1);



        //alerti kapatma nasıl





        BekleKapat();

    }
}
