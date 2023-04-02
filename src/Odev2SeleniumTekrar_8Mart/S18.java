package Odev2SeleniumTekrar_8Mart;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class S18 extends BaseDriver {
    @Test
    public void Soru18(){
        //Bu web sitesine gidiniz.  http://demo.seleniumeasy.com/table-search-filter-demo.html
        //Task tablosunda; //"in progress" giriniz. //Tablodaki bütün Taskları bulun ve yazdırın.
        //Tablodaki bütün Assignee olanları bulun ve yazdırın.
        // Not: find element kullanın ve yazdırırken for loop kullanın.

       driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

     /*   MyFunc.Bekle(1);
        WebElement taskTablo=driver.findElement(By.id("task-table-filter"));
        taskTablo.sendKeys("in progress");

        List<WebElement> tasks=driver.findElements(By.xpath("//td[text()='in progress']//preceding-sibling::td[2]")); // "//tr[@style='display: table-row;']" ilk buldu bu locatorla sonra bulmadıı!!
        for (WebElement task: tasks){
            System.out.println("task:"+ task.getText());
        }

        MyFunc.Bekle(1);


        List<WebElement> assignees=driver.findElements(By.xpath("//td[text()='in progress']//preceding-sibling::td[1]"));
        for (WebElement assigne: assignees){
            System.out.println("assignee:"+ assigne.getText());
        }    */


        WebElement taskTablo = driver.findElement(By.id("task-table-filter"));
       taskTablo.sendKeys("in progress");

        WebElement task1 = driver.findElement(By.xpath("//td[text()='Wireframes']"));
        WebElement task2 = driver.findElement(By.xpath("//td[text()='Bootstrap 3']"));
        WebElement task3 = driver.findElement(By.xpath("//td[text()='Bug fixing']"));

        List<WebElement> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        for (WebElement task : tasks) {
            System.out.println(" task = " +task.getText());
        }


        WebElement assignee1= driver.findElement(By.xpath("//td[text()='John Smith']"));
        WebElement assignee2= driver.findElement(By.xpath("//td[text()='Emily John']"));
        WebElement assignee3=driver.findElement(By.xpath("//td[text()='Kilgore Trout']"));

        List<WebElement> assignees = new ArrayList<>();
        assignees.add(assignee1);
        assignees.add(assignee2);
        assignees.add(assignee3);

        for (WebElement assigne : assignees) {
            System.out.println(" assignee = " +assigne.getText());

        }

        BekleKapat();
}
}



