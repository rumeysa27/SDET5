package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class S20 extends BaseDriver {
    @Test
    public void Soru20(){
        //Bu web sitesine gidiniz. [http://en.wikipedia.org/wiki/FIFA_World_Cup]
        //Contents'in içindeki Attendance'e  tıklayınız. //Attendance tablosunun içinde //Bütün Host'ları yazdırınız.
        //Find elements kullanınız.




        driver.get(" https://en.wikipedia.org/wiki/FIFA_World_Cup");

        Actions aksiyonlar= new Actions(driver);
        WebElement contents=driver.findElement(By.xpath("//*[@id='vector-toc']/div/h2"));
        WebElement attendance=driver.findElement(By.xpath("//*[@id='toc-Attendance']/a/div"));

        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(contents).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(attendance).click().build().perform();

        MyFunc.Bekle(2);

        /* List<WebElement> links=driver.findElements(By.tagName("a")); //güzel saçmaladığım kısım
        for (WebElement link: links){
            if (!link.getAttribute("href").contains("wiki"))
                System.out.println("link.getText():"+ link.getText());} */


        List<WebElement> hosts=driver.findElements(By.xpath("//td[@style='text-align:left' or @style='text-align: left']"));

        for(WebElement h:hosts){
            System.out.println( "host:"+ h.getText());
        }
        System.out.println("size: " + hosts.size());
//** //td[@style='text-align:left' or @style='text-align: left'] //not: Eğer bi locator öğeyi bulamazsa, "or"kullanarak
//ikinci locatorı kullanılır. Bu şekilde, bir öğeye birden fazla locator ile erişmek için alternatif bir yöntem sağlanır.

        BekleKapat();
    }
}
