package com.rafiatu.pages.customer;

import com.rafiatu.base.BasePageTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CustomerLoginPageTest extends BasePageTest {

    //Customer Page Login
    @Test
    void testCustomerLoginPage() {

        WebElement customerLoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Customer Login')]")));
        customerLoginButton.click();



        WebElement customerDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userSelect")));
        Select userSelect = new Select(customerDropdown);
        userSelect.selectByVisibleText("Harry Potter");


        WebElement LoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Login')]")));
        LoginButton.click();


    }
}