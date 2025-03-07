package com.rafiatu.pages.customer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends CustomerHomePageTest and contains test methods
 * for verifying the deposit functionality on the customer page.
 */
public class DepositPageTest extends CustomerHomePageTest {

    /**
     * This test verifies that a customer can successfully navigate to
     * the deposit page, enter an amount, and submit the deposit request.
     */
    @Test
    public void depositPageTest() {
        // Wait for the 'Deposit' button to be clickable and click it
        WebElement depositButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Deposit')]"))
        );
        depositButton.click();

        // Wait for the deposit input field to be clickable and enter an amount
        WebElement inputField = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder, 'amount')]"))
        );
        inputField.sendKeys("200");

        // Wait for the deposit submission button to be clickable and click it
        WebElement depositSubmitButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"))
        );
        depositSubmitButton.click();
    }
}
