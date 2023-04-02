package Mentoring;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cssSelector extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demo.nopcommerce.com/");

        String email1="rümbak@hotmail.com";
        String password="tchn1234";

        WebElement register=driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();
        MyFunc.Bekle(1);

        WebElement gender=driver.findElement(By.cssSelector("input[id='gender-male']"));
        gender.click();

        WebElement firstName=driver.findElement(By.cssSelector("input[id='FirstName']"));
        firstName.sendKeys("rüm");

        WebElement lastName=driver.findElement(By.cssSelector("input[id='LastName']"));
        lastName.sendKeys("bakr");

        WebElement email2=driver.findElement(By.cssSelector("input[id='Email']"));
        email2.sendKeys("rümbak@hotmail.com");

        WebElement companyName=driver.findElement(By.cssSelector("input[id='Company']"));
        companyName.sendKeys("technoStudy");

        WebElement companyPasswrd=driver.findElement(By.cssSelector("input[id='Password']"));
        companyPasswrd.sendKeys("tchn1234");

        WebElement confirmPassword=driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
        confirmPassword.sendKeys("tchn1234");

        WebElement registerButton=driver.findElement(By.cssSelector("button[id='register-button']"));
        registerButton.click();

        WebElement kayitdogrulama=driver.findElement(By.cssSelector("div[class='result']"));
        String message=kayitdogrulama.getText();

        Assert.assertTrue(message.contains("completed"));

        WebElement login=driver.findElement(By.cssSelector("a[class='ico-login']"));
        login.click();

        WebElement emailTekrar=driver.findElement(By.cssSelector("input[id='Email']"));
        emailTekrar.sendKeys(email1);

        WebElement passwordTekrar=driver.findElement(By.cssSelector("input[id='Password']"));
        passwordTekrar.sendKeys(password);

        WebElement loginTekrar=driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
        loginTekrar.click();

        WebElement logoutLink=driver.findElement(By.cssSelector("[class='ico-logout']"));//kayıt olduğunu logout burdan anlarsn

        Assert.assertTrue(logoutLink.isDisplayed());

        BekleKapat();
    }
}
