package OdevActions_28Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class Odev3 extends BaseDriver {
    @Test
    public void Test3(){
         //challenge sorusu
        //Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
        //buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions aksiyonlar=new Actions(driver);

        Map<String ,String> cevaplar=new HashMap<>();
        cevaplar.put("node18","box1");
        cevaplar.put("node19","box1");
        cevaplar.put("node20","box1");
        cevaplar.put("node12","box2");
        cevaplar.put("node1","box2");
        cevaplar.put("node7","box2");
        cevaplar.put("node3","box3");
        cevaplar.put("node9","box3");
        cevaplar.put("node14","box3");
        cevaplar.put("node21","box4");
        cevaplar.put("node16","box4");
        cevaplar.put("node5","box4");
        cevaplar.put("node4","box5");
        cevaplar.put("node10","box5");
        cevaplar.put("node15","box5");
        cevaplar.put("node6","box6");
        cevaplar.put("node11","box6");
        cevaplar.put("node17","box6");
        cevaplar.put("node8","box7");
        cevaplar.put("node13","box7");
        cevaplar.put("node2","box7");

       for (Map.Entry<String,String> cevap:cevaplar.entrySet()){
            WebElement sehir=driver.findElement(By.id(cevap.getKey()));
            WebElement simgeleri=driver.findElement(By.id(cevap.getValue()));

            aksiyonlar.clickAndHold(sehir).build().perform();
            MyFunc.Bekle(1);
            aksiyonlar.moveToElement(simgeleri).release().build().perform();
            MyFunc.Bekle(1);

        }
        driver.switchTo().alert().accept();//alerti kapatıver gari:)



      /*  WebElement rome=driver.findElement(By.id("node18"));
        aksiyonlar.clickAndHold(rome).build().perform();
        MyFunc.Bekle(2);

        WebElement italy=driver.findElement(By.id("box1"));
        aksiyonlar.moveToElement(italy).release().build().perform();
        MyFunc.Bekle(2);


        WebElement oslo=driver.findElement(By.id("node1"));
        aksiyonlar.clickAndHold(oslo).build().perform();
        MyFunc.Bekle(2);
        WebElement norway=driver.findElement(By.id("box2"));
        aksiyonlar.moveToElement(norway).release().build().perform();
       MyFunc.Bekle(2);


        WebElement london=driver.findElement(By.id("node3"));
        aksiyonlar.clickAndHold(london).build().perform();
        MyFunc.Bekle(2);
        WebElement uK=driver.findElement(By.id("box3"));
        aksiyonlar.moveToElement(uK).release().build().perform();
        MyFunc.Bekle(2);


        WebElement washington=driver.findElement(By.id("node5"));
        aksiyonlar.clickAndHold(washington).build().perform();
        MyFunc.Bekle(2);
        WebElement uSa=driver.findElement(By.id("box4"));
        aksiyonlar.moveToElement(uSa).release().build().perform();
        MyFunc.Bekle(2);


        WebElement beijing=driver.findElement(By.id("node4"));
        aksiyonlar.clickAndHold(beijing).build().perform();
       MyFunc.Bekle(2);
        WebElement china=driver.findElement(By.id("box5"));
        aksiyonlar.moveToElement(china).release().build().perform();
       MyFunc.Bekle(2);


        WebElement queenisland=driver.findElement(By.id("node11"));
        aksiyonlar.clickAndHold(queenisland).build().perform();
        MyFunc.Bekle(2);
        WebElement australia=driver.findElement(By.id("box6"));
        aksiyonlar.moveToElement(australia).release().build().perform();
        MyFunc.Bekle(2);


        WebElement paris=driver.findElement(By.id("node2"));
        aksiyonlar.clickAndHold(paris).build().perform();
       MyFunc.Bekle(2);
        WebElement france=driver.findElement(By.id("box7"));
        aksiyonlar.moveToElement(france).release().build().perform();
        MyFunc.Bekle(2);


      /* WebElement rome=driver.findElement(By.id("node18"));
        WebElement italy=driver.findElement(By.id("box1"));
        MyFunc.Bekle(1);
        aksiyonlar.dragAndDrop(rome,italy).build().perform();
        MyFunc.Bekle(1);*/



        BekleKapat();




    }
}
