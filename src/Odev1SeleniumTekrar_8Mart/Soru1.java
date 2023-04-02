package Odev1SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.awt.windows.WEmbeddedFrame;

import java.util.Random;
import java.util.Scanner;

public class Soru1 extends BaseDriver {
    @Test
    public void Soru1(){
        //Senaryo
        //1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
        //2- random 100 e kadar 2 sayı üretiniz.
        //3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
        //4- Sonuçları Assert ile kontrol ediniz.
        //5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");


        Actions actions = new Actions(driver);

        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);

        MyFunc.Bekle(1);
        WebElement workShops=driver.findElement(By.xpath("//*[@id='navbarResponsive']/ul/li[3]/a"));
        workShops.click();

        MyFunc.Bekle(1);
        WebElement calculate=driver.findElement(By.xpath("//*[@id='gotoBasicCalc']/div"));
        calculate.click();




       /*

        int rndmSayi1= (int) (Math.random()*100);
        System.out.println("Random sayı 1="+ rndmSayi1);
        int rndmSayi2=(int) (Math.random()*100);
        System.out.println("Random sayı 2= "+ rndmSayi2);


        int islem=oku.nextInt();
        for (int i = 1; i <= 5; i++) {
            System.out.println(islem);
        } */





        BekleKapat();


    }
}
