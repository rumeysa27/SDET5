package OdevCssSelector_22Subat;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S3 extends BaseDriver {
    @Test
    public void Test3 () {
       // 1) Bu siteye gidin. -> https://www.snapdeal.com/
      //  2) "teddy bear" aratın ve Search butonuna tıklayın.
       // 3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
       // Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        driver.get("https://www.snapdeal.com/");
//"[id='inputValEnter]"


        WebElement ara=driver.findElement(By.cssSelector("[id='inputValEnter']"));
        ara.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement button=driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        button.click();
        MyFunc.Bekle(2);


        String snc="We've got 297 results for teddy bear";
        WebElement result=driver.findElement(By.cssSelector("[class='nnn']"));
       // Assert.assertTrue(result.getText().equals(snc)); bunda sayılar değişince hata veriyor
         Assert.assertTrue(result.getText().startsWith("We've"));

       /* if (result.getText().startsWith("teddy bear"))
            System.out.println("test geçerli");
        else
            System.out.println("sayılar farklı!!"); */


        BekleKapat();

    }
}
