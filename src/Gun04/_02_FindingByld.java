package Gun04;

import Utility.MyFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByld {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

      WebElement isimKutusu= driver.findElement(By.id("first_8"));//elemanı id ile bul
        isimKutusu.sendKeys("Rümeysa");//(sendKeys)kutucuklara yazı gönderme işine yarıyor

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("bakır");

        MyFunc.Bekle(2);//sildikten sonra 2 sn bekle kapat
       // isimKutusu.clear(); click bunlar aktifken çalışmıyor çünkü burada ad soyadı temzliyor
      //  soyadKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        //(incept bölümü/inceleme) bölümü aktifken arama kutusunu açar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getTex()= "+ labelFirstName.getText());

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getTex()= "+ labelLastName.getText());

        WebElement sumbitButton=driver.findElement(By.id("input_2"));//butona click yapıyoruz
        sumbitButton.click();

        MyFunc.Bekle(3);
        driver.quit();

    }
    // # bu işaareti koyunca sadece id lerde arıyor arayacakları ctrl f ile tıklatıp arama kutucuğu aç
    //eleman bulmak için By. dan sonra aşağıdaki metodları kullanacağız
    //
   // id
   //         name
   // className
    //        linkText
   // PartialLinkText
   // Tag name
   // Css selector
   // Xpath

    //birşeyi incelmek istiyorsak sağ tuş incept(incele)



}
