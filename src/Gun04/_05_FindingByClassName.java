package Gun04;

import Utility.MyFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        //burada id name yoksa nasıl bulacağımızı classtan bulacağız classı
        // birden fazla aynı locator a sahip eleman bulursa findElement ne yapar ?
                // cevap : ilk element i bulur
        //form-textbox validate[required] burada arada boşluk var eğer böyle olursa iki tane olmuş oluyor
        //iki classı var demektir burada

        //classlarda ara demek için ctrl f e bastığımızda açılan kutuya . yazıp ismi yazacağız
        //id lerde ise #(dies) bunu koyarak arayacağız

        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name=driver.findElement(By.className("form-textbox"));
        name.sendKeys("rümeysa");

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());

        for (WebElement e: labels)
            System.out.println("e.getText()= "+ e.getText());

        //İKİSİNİN ARASINDAKİ FARK ÖNEMLİ DİKKAT ET!!
        // aranılan eleman bulunamazsa : findElement NoSuchElement hatası veriri
        // findElements is size ı 0 olan List verir, yani hata vermez.







        MyFunc.Bekle(3);
        driver.quit();
    }
}
