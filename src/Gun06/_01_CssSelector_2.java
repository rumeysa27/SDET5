package Gun06;

import Utility.BaseDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _01_CssSelector_2  extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="motorları maviliklere süreceğiz";
        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

       // if (msg.getText().equals(mesajim))
        //    System.out.println("test passed");
       // else
         //   System.out.println("test fail");

        String kutuIcindeYazi=txtBox.getAttribute("value");
        System.out.println(kutuIcindeYazi);

        Assert.assertTrue("aranılan mesaj bulunamadi",msg.getText().equals(mesajim) );//tırnak içindeki hata olursa yazacak
        // Assert verilen değer true mi kontrol et demek ife benziyor ama if ten farkı hata varsa gösterir yoksa göstermez
        // eğer doğruysa bilgi vermez(assert yeşil renk verir), hata varsa bilgi verir
        // kısacası genel kuralı hata varsa göster
        //junit testleri organize ediyor

        //yani id si bunla başlayan manasında;[id^='u_'] [placeholder='First name']  ^bunla başlayan demek bu işaret
        //NOTLAR;
        //[id^='u_'] -> id si    u_ ile başlayan  startWith manasında
        //[id*='u_'] -> id sinde u_ geçen         contains
         //   [id$='u_'] -> id si    u_ ile biten     endWith




      /*  <div>  cocukları: span, span, div
        tumcocukları: span, span, div, img, input

                <span> merhaba 1 </span>
  <span> merhaba 2 </span>

  <div>  -> çocuk
            <img src=logo.png>
     <input type="text">
  </div>

</div>
<label>merhaba</label> -kardeşi
            <h2>merhaba</h2>       -diğer kardeş
        kardeş -> bitişik kardeş
        kardeşler -> tüm kardeşleri  */

      /*  div[id='user-message'] > label
        id si user-message olan DIV in çocuklarından label olan

        div[id='user-message'] > label + span
        id si user-message olan DIV in çocuklarından label dan hemen sonraki
        span

        div[id='user-message'] > span   yukarıdaki ile aynı

            [id='get-input'] input
        id si get-input olan elemanın bütün cocuklarındaki ilk input olan */


      /* bunlar elemanlara direkt ulaşamadığımız zaman yapacaklarımız

       >     -> cocuklarda arar
        space -> tüm cocuklarda(torunlar dahil) arar
            +     -> bitişik kardeş i bulur
        ~     -> tüm kardeşlerde ara

        [class='navbar-nav']>:nth-child(3) burada üçüncü li ye ulaşmayı gösteriyor(daha kolay yöntem)
         li+li+li bu uzun yol bu ikisi de üçüncü çocuk demek
        */

        //elemanları bulacak başka tür yöntem yoksa bunu kullan  [id='user-message']>span
       // [id='user-message']>* çocukların hepsini bulur torunlar yok bu da

       // WebElement btn=driver.findElement(By.cssSelector(""));yukardakileri bunu içinde yapıyoruz







        BekleKapat();

    }
}
