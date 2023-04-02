package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class S13 extends BaseDriver {
    @Test
    public void Soru13(){
        //Bu websitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html](http://demo.seleniumeasy.com/basic-first-form-demo.html)
        //List box'a tıklayınız.
        //[Bootstrap List Box'a tıklayınız.] (http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html)
        //**bootstrap-duallist**'e tıklayınız. Sonra sağ ok (>)'a tıklayınız.
        //**Dapibus ac facilisis in'**e tıklayınız ve sağ ok (>)'a tıklayınız.
        //Sağa gönderilen elemanların üstüne bir kere daha tıklayıp beyaz hale getiriniz.
        //**Cras husto odio**'a tıklayınız ve sol ok(<)'a tıklayınız.
        //**Morbi leo risus**'a tıklayınız ve sol ok(<)'a tıklayınız.
        //Sol kutu bu şekilde olmalıdır. //- Morbi leo risus//- Porta ac consectetur ac //- Vestibulum at eros
        // - Cras justo odio //- Dapibus ac facilisis in //Sağ kutu bu şekilde olmalıdır. //Morbi leo risus
        //- Porta ac consectetur ac //- Vestibulum at eros //- bootstrap-duallist //- Dapibus ac facilisis in

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        MyFunc.Bekle(1);
        WebElement listbox=driver.findElement(By.linkText("List Box"));
        listbox.click();

        MyFunc.Bekle(1);
        WebElement bootStrapListBox =driver.findElement(By.linkText("Bootstrap List Box"));
        bootStrapListBox.click();

        MyFunc.Bekle(1);
        WebElement bootstrapDuallist=driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
       bootstrapDuallist.click();

       MyFunc.Bekle(1);
        WebElement sagOk=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
        sagOk.click();

        MyFunc.Bekle(1);
        WebElement dapibusAcFacilisis=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[2]"));
        dapibusAcFacilisis.click();

        MyFunc.Bekle(1);
        sagOk.click();

        MyFunc.Bekle(1);
        WebElement bootstrapDuallist2=driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        bootstrapDuallist2.click();

        MyFunc.Bekle(1);
        WebElement dapibusAcFacilisis2=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[2]"));
        dapibusAcFacilisis2.click();

        WebElement crasjustoOdio=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/ul/li[1]"));
        crasjustoOdio.click();

        WebElement solOk=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-left']"));
        solOk.click();

        WebElement morbiLerisus=driver.findElement(By.xpath("//li[text()='Morbi leo risus']"));
        morbiLerisus.click();

        MyFunc.Bekle(1);
        solOk.click();

        BekleKapat();


    }
}
