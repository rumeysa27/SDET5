package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectedclassGiris extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));
        //bu element select tag i ile başlıyorsa bunu SELECT e cast yap ve öyle kullan cast aşağıda yaptığımz new le olan

        Select menu=new Select(webMenu);//elementi daha rahat kullanabilir SELECT nesnesi haline dönüştürdü
        menu.selectByIndex(2);//yani 2.yi seç
       // menu.selectByValue("value değeri"); //veya bunu
       // menu.selectByVisibleText("görünen textini");//ya da bunu cast yaptığında bunları kullanabilirsin

        System.out.println("menu.getOptions().size()= "+ menu.getOptions().size());







        BekleKapat();

    }
}
