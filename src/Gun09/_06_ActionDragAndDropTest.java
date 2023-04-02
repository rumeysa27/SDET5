package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);


        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));
        MyFunc.Bekle(1);

        //1.yöntem
        aksiyonlar.dragAndDrop(oslo,norway).build().perform();//osloyu norwaya at

        //2.yöntema
      // aksiyonlar.clickAndHold(oslo).build().perform();//osloyu tıklat ve al
      // aksiyonlar.moveToElement(norway).release().build().perform();//norwayin üzerine git bırak





        BekleKapat();
    }
}
