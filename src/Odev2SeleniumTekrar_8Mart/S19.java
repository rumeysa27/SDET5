package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S19 extends BaseDriver {
    @Test
    public void Soru19(){
        //Bu websitesine gidiniz. [http://demo.seleniumeasy.com/table-search-filter-demo.html](http://demo.seleniumeasy.com/table-search-filter-demo.html)
        //Listed users tablosunun içinde; //First Name filtre kutusuna "an" giriniz.
        //web sitesindeki first name'leri bulunuz. (içinde "an" olanlar.)//Bu first name'leri yazdırınız.
        // First Name filtre kutusundaki yazıyı siliniz. //Usernames filtre kutusuna "ar" giriniz.
        //Web sitesindeki username'leri bulunuz (içinde "ar" olanlar.) //Bu username'leri yazdırınız.
        //Not: find elements kullanınız.ve for loop kullanınız.

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

        MyFunc.Bekle(2);
        //buna tıklamayınca name girmiyo
        WebElement filterButton = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-filter']"));
        filterButton.click();

        MyFunc.Bekle(2);
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("an");

        MyFunc.Bekle(2);
        WebElement firstName1 = driver.findElement(By.xpath("//td[text()='Daniel']"));
        WebElement firstName2 = driver.findElement(By.xpath("//td[text()='Rajano']"));
       List<WebElement> firstNames = new ArrayList<>(Arrays.asList(firstName1,firstName2));


        for (WebElement f : firstNames) {
            System.out.println("First name: "+f.getText());
        }
        MyFunc.Bekle(2);
        firstName.clear();

        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("ar");

        MyFunc.Bekle(2);
        WebElement surName1=driver.findElement(By.xpath("//td[text()='markino']"));
        WebElement surName2=driver.findElement(By.xpath("//td[text()='larrypt']"));
        List<WebElement> surNames=new ArrayList<>(Arrays.asList(surName1,surName2));

        for (WebElement s:surNames){
            System.out.println("SurName:"+ s.getText());
        }
        MyFunc.Bekle(2);


      BekleKapat();


    }
}
