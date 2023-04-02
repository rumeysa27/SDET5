package Gun05;


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));

        //<input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        // id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="" value="" strtindx="" endindx="">


//    elemanın parameterelerine ulaşmak için getAttribute u kullanıyoruz
        System.out.println("inputValEnter.getAttribute(class) ="+ inputValEnter.getAttribute("class"));

        System.out.println(" getCssValue(color )="+ inputValEnter.getCssValue("color"));
        System.out.println(" getCssValue(font-size)="+ inputValEnter.getCssValue("font-size"));
        System.out.println(" getCssValue(background)="+ inputValEnter.getCssValue("background"));


//aralarında boşluk varsa ' ' koyman zorunlu
        //proje açarken intellij diye değil maven olarak açacağız..

        BekleKapat();

    }
}
