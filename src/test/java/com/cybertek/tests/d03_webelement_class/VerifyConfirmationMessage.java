package com.cybertek.tests.d03_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        ///////FIRST PART TO TEST IF EMAIL BOX ACCEPT RIGHT TYPE OF EMAIL //////////////////////

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput = driver.findElement(By.name("email"));
        Faker faker=new Faker();
        String mail=faker.internet().emailAddress();
        emailInput.sendKeys(mail);
        Thread.sleep(2000);
        String actualEmail=emailInput.getAttribute("value");
        if (actualEmail.equals(mail)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("Expected email is: "+mail);
            System.out.println("Actual email is: "+actualEmail);
        }

        ///////////SECOND PART TO TEST CONFIRMATION MESSAGE//////////////////////

        String expectedMessage="Your e-mail's been sent!";
        driver.findElement(By.id("form_submit")).click();
        WebElement textBox=driver.findElement(By.name("confirmation_message"));
        String actualMessage=textBox.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
            System.out.println("Expected message is: "+expectedMessage);
            System.out.println("Actual email is: "+actualMessage);
        }
        driver.quit();
    }
}
