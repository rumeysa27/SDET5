package OdevActions_28Subat;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class Odev2 extends BaseDriver {
    @Test
    public void Test2(){
//Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//  buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

         driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions aksiyonlar=new Actions(driver);

        Map<String,String> idler=new HashMap<>();
        idler.put("node1","box1");
        idler.put("node2","box1");
        idler.put("node3","box1");
        idler.put("node4","box1");
        idler.put("node5","box2");
        idler.put("node6","box2");
        idler.put("node7","box2");
        idler.put("node8","box2");
        idler.put("node9","box3");
        idler.put("node10","box3");
        idler.put("node11","box3");
        idler.put("node12","box3");
        idler.put("node13","box4");
        idler.put("node14","box4");
        idler.put("node15","box4");
        idler.put("node16","box5");
        idler.put("node17","box5");
        idler.put("node18","box5");
        idler.put("node19","box5");
        idler.put("node20","box5");
        idler.put("node21","box5");
        for (Map.Entry<String,String> deger: idler.entrySet()){

            WebElement student=driver.findElement(By.id(deger.getKey()));
            WebElement team=driver.findElement(By.id(deger.getValue()));

            MyFunc.Bekle(1);
            aksiyonlar.clickAndHold(student).build().perform();
            MyFunc.Bekle(1);
            aksiyonlar.moveToElement(team).release().build().perform();


        }

         BekleKapat();
    }
}
