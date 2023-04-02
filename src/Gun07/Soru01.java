package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru01 extends BaseDriver {
    @Test
    public void Test1() {
       //1- https://www.saucedemo.com/
       //2- Login işlemini yapınız.
       //( Accepted usernames are:
       //  standard_user
       //  locked_out_user
       //  problem_user
       //  performance_glitch_user
       //  Password for all users:
       //  secret_sauce)
       //3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
       //4- Sonra geri dönün (Back to products e tıklatın).
       //5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
       //6- Sepete tıklatın.
       //7- CheckOut a tıklatın.
       //8- Kullanıcı bilgilerini doldurup Continue ya tıklatın.
       //9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
       //   Item total e eşit olup olmadığını Assert ile test edin.
       //Bu soruda tamamen XPATH kullanılacaktır.

        driver.get("https://www.saucedemo.com/");

        WebElement usrnme=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usrnme.sendKeys("standard_user");
        MyFunc.Bekle(2);

       WebElement psswrd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
       psswrd.sendKeys("secret_sauce");
       MyFunc.Bekle(1);

       WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
       login.click();
       MyFunc.Bekle(1);

       WebElement sauce=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
       sauce.click();
       MyFunc.Bekle(1);

       WebElement adToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
       adToCart.click();
       MyFunc.Bekle(1);

       WebElement backToPro=driver.findElement(By.xpath("//button[@id='back-to-products']"));
       backToPro.click();
       MyFunc.Bekle(1);

       WebElement sauceLabsBolt=driver.findElement(By.xpath("//a[@id='item_1_title_link']"));
       sauceLabsBolt.click();
       MyFunc.Bekle(1);

       WebElement adTo=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
       adTo.click();
       MyFunc.Bekle(2);

       WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
       sepet.click();
       MyFunc.Bekle(1);

       WebElement checkOut=driver.findElement(By.xpath("//button[@id='checkout']"));
       checkOut.click();
       MyFunc.Bekle(1);

       WebElement firstName=driver.findElement(By.xpath("//input[@id='first-name']"));
       firstName.sendKeys("Rümeysa");
       MyFunc.Bekle(1);

       WebElement lastName=driver.findElement(By.xpath("//input[@id='last-name']"));
       lastName.sendKeys("Bakır");
       MyFunc.Bekle(1);

       WebElement zipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
       zipCode.sendKeys("4567");
       MyFunc.Bekle(1);

       WebElement cntnue=driver.findElement(By.xpath("//input[@id='continue']"));
       cntnue.click();
       MyFunc.Bekle(1);

       List<WebElement> item=driver.findElements(By.xpath("//div[@class='item_pricebar']"));//fiyat çubuğunun locatorı div ortak classtı iki üründe de aynı
      // ** //div[@class='inventory_item_price'] yukarda bu da olabilir
       //System.out.println(item.size()); //bu olsa da olur olmasa da şuan için
       MyFunc.Bekle(1);

       double toplam=0;
       for (WebElement i: item){//fiyat çubuğunu ikisini de okusun diye foreach e attım
          System.out.println("i.getText()=" +  i.getText()); //şunu sonradan yaptım elementleri yazdırsın diye

          String itemStr=i.getText().replace("$","");//bu işrti temizle önce
          toplam +=Double.parseDouble(itemStr);
          //toplam=toplam+Double.parseDouble(i.getText().substring(1));1den itibaren sonuna kadar al
       }
       //System.out.println("toplam ="+ toplam);// yukarı ve buraı hocanın yöntemi

       WebElement itemTotl=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));//item totalin locatorı
       String itemTtlStr=itemTotl.getText().replaceAll("[^0-9.]","");//0-9 ve . harici hepsini ""yap yani sil
       // System.out.println(itemTotl.getText()); bu ikisi de kısa yöntem
       // System.out.println(itemTotl.getText().replaceAll("[^0-9.] ",""));

       double itemTtlDouble=Double.parseDouble(itemTtlStr);


       Assert.assertTrue(toplam==itemTtlDouble);
     //(^) Simgesi eğer köşeli parantez ([]) içinde kullanılırsa, bu kendisinden sonraki karakter veya grubun
    //bulunmayacağını ifade eder.




      // WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
       // Assert.assertTrue(itemTotal.getText().equals());





       BekleKapat();
    }
}
