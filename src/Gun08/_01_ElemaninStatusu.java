package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {
    @Test

    public void Test1(){
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("sali.isDisplayed()="+ sali.isDisplayed());
        System.out.println("sali.isEnabled()="+ sali.isEnabled());
        System.out.println("sali.isSelected()="+ sali.isSelected());

        sali.click();
        MyFunc.Bekle(2);
        System.out.println("sali.isSelected()="+ sali.isSelected());

        WebElement cumartesi=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input")); //şu kısmı tekrar et
        System.out.println("cumartesi.isDisplayed()="+ cumartesi.isDisplayed());//gözüküyor mu onu gösteriyo
        System.out.println("cumartesi.isEnabled()="+ cumartesi.isEnabled());//aktif mi onu gösteriyo
        System.out.println("cumartesi.isSelected()="+ cumartesi.isSelected());//saklı elemanlar

        //check box eğer kapalıysa ve ekranda tıklanmaya izin verilmiyorsa o elemntin bulunduğu locatorların oraya
        //orada disapled var onun üstüne sağ tıklayıp Edit as HTML ye tıklayıp (disabled="")i silersen enable hale gelir
        //artık check box a tıklayabilirsin (saturdaya yaptığımız gibi)

        //** display elemanın görünürlüğüne bakıtyor

        BekleKapat();

    }
}
