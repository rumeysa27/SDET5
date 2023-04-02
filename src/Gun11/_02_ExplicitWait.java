package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {
    @Test
    public void Wait1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

       // Duration muhlet=Duration.ofSeconds(30);
       // WebDriverWait bekle= new WebDriverWait(driver,muhlet );
        WebDriverWait bekle=new WebDriverWait(driver,Duration.ofSeconds(30)); //direkt böyle de yapabilirsin
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //beklenen kriterlerden ExpectedConditions
        // verilene locatordaki element gözükür hale yani visibilityOfElementLocated
        // gelene kadar bekle yani bekle.until

        System.out.println("bitti");


    }
}
