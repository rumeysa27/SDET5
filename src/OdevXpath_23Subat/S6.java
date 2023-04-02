package OdevXpath_23Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S6 extends BaseDriver {
    @Test
    public void Test6 () {
//  Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        // Fake Alerts'e tıklayınız.
        //Show modal dialog buttonuna tıklayınız.
        //       Ok'a tıklayınız.
        //Alert kapanmalıdır.

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAl=driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAl.click();
        MyFunc.Bekle(2);

        WebElement showMod=driver.findElement(By.xpath("//input[@class='styled-click-button']"));
        showMod.click();
        MyFunc.Bekle(2);

        WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));//veya //button[@id='dialog-ok'][class='dialog-button']
        ok.click();
        MyFunc.Bekle(1);







        BekleKapat();

    }
}
