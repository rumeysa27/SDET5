package Mentoring;

import Utility.BaseDriver;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DersActions extends BaseDriver {

   @Test
    public void Test1(){

       driver.get("https://www.browserstack.com/");
       Actions aksiyonlar= new Actions(driver);
       WebElement getStartedFree=driver.findElement(By.xpath("//a[text()='Get started free']"));
       aksiyonlar.moveToElement(getStartedFree).click().build().perform();

       BekleKapat();
   }

   @Test
    public void Test2(){

       driver.get("https://www.browserstack.com/");
       Actions aksiyonlar= new Actions(driver);

       WebElement automate=driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-automate']"));
       aksiyonlar.moveToElement(automate).click().build().perform();

       BekleKapat();
   }

}
