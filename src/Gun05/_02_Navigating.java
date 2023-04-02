package Gun05;


import Utility.BaseDriver;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating  extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement element=driver.findElement(By.id("alerttest"));
       // WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();//click diyince sayfaya gidiyor elemente tıklıyor elementin komutu
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());//o anda bulunduğu url yi verir

        driver.navigate().back();//tarayıcı history sinden geri geliyor
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();//tarayıcı history sinden ileri gitti //driverın komuutu
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        BekleKapat();

    }
}
