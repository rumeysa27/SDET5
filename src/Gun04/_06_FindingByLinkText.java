package Gun04;

import Utility.MyFunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    //link ile arama
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        //LinkText  yoluyla eleman bulma işlemi a tag(<a href="burada link oluyor"> <a/>) inde kullanılır

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        //gözüken text siparişlerim olan a tag li webelement
        System.out.println("siparislerimLinki.getText()= "+ siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(href)=" +siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(title)="+ siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(rel)="+ siparislerimLinki.getAttribute("rel"));

        //partialLinkText parça şeklinde linkin bir parçasını veriyor
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = "+ link2.getText());


        MyFunc.Bekle(3);
        driver.quit();

    }
}
