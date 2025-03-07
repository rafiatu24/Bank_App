package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends ManagerLoginTest and contains test methods
 * for verifying the 'Add Customer' functionality.
 */
public class AddCustomerPageTest extends ManagerLoginTest {

    /**
     * This test verifies that a manager can navigate to the 'Add Customer' page,
     * enter customer details, submit the form, and handle the confirmation alert.
     */
    @Test
    public void AddCustomerPageTest() {
        // Wait for the 'Add Customer' button to be clickable and click it
        WebElement addCustomerButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Add Customer')]"))
        );
        addCustomerButton.click();

        // Wait for the 'First Name' input field to be visible and enter a first name
        WebElement inputFieldFName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']"))
        );
        inputFieldFName.sendKeys("Rafiatu");

        // Wait for the 'Last Name' input field to be visible and enter a last name
        WebElement inputFieldLName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']"))
        );
        inputFieldLName.sendKeys("Ibrahim");

        // Wait for the 'Post Code' input field to be visible and enter a postal code
        WebElement inputFieldPCode = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Post Code']"))
        );
        inputFieldPCode.sendKeys("12345");

        // Wait for the 'Add Customer' submission button to be clickable and click it
        WebElement addCustomerSubmitButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"))
        );
        addCustomerSubmitButton.click();

        // Wait for the confirmation alert to appear and accept it
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
