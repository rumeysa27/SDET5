package Gun06;

import Utility.BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {

    public static void main(String[] args) {
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
        //cssSelector kullanın

        //cssSelector de köşeli paranetez kullanıyoruz
        //[id='user-message'] bunu search butonuna yazınca direkt buluyor ya da input[id='user-message'] daha doğrudan

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="motorları maviliklere süreceğiz";
      WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
      txtBox.sendKeys(mesajim);
     // txtBox.sendKeys("Motorları maviliklere süreceğiz"); string ekleyip msjı ona yazınca yapınca buna gerek kalamadı

      WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
      btn.click();

      WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

      if (msg.getText().equals(mesajim))
          System.out.println("test passed");

      else
          System.out.println("test fail");



        BekleKapat();






    }
}
