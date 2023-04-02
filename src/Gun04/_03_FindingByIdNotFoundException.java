package Gun04;

import Utility.MyFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try{
            WebElement labelFirstName=driver.findElement(By.id("hatalilocator"));
           // System.out.println("labelFirstName.getTex()= "+ labelFirstName.getText());
        }
        catch (Exception ex){
            System.out.println("WebElement bulunamadı"+ ex.getMessage());
        }

        //sublabel_8_first bunlara locator deniyo
        //hatalı locator girince bu msjı veriyo: NosuchElementException: böyle bi element yok


        MyFunc.Bekle(3);
        driver.quit();
    }
}
