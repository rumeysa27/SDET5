package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainApp {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.techno.study/");
    }
}
