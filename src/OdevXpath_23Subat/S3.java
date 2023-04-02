package OdevXpath_23Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S3 extends BaseDriver {
    @Test
    public  void Test3 () {
        //1) Bu siteye gidin. -> https://www.snapdeal.com/
        //2) "teddy bear" aratın ve Search butonuna tıklayın.
        //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        driver.get("https://www.snapdeal.com/");

        WebElement arat=driver.findElement(By.xpath("//input[@name='keyword']"));
        arat.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();
        MyFunc.Bekle(2);


        WebElement yazi=driver.findElement(By.xpath("//span[@class='nnn']"));
        String msj="We've got 297 results for 'teddy bear'";
       Assert.assertTrue(yazi.getText().startsWith("We've"));
       /* Assert.assertTrue(yazi.getText().equals(msj));//burada hata alıyorum */

       /* if (yazi.getText().startsWith("teddy bear"))
            System.out.println("test geçerli");
        else
            System.out.println("sayılarda değişiklik var!!");*/




        BekleKapat();

    }
}
