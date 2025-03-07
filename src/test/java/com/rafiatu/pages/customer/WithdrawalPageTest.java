package com.rafiatu.pages.customer;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends CustomerHomePageTest and contains test methods
 * for verifying the withdrawal functionality.
 */
public class WithdrawalPageTest extends CustomerHomePageTest {

    /**
     * This test verifies that a customer can navigate to the withdrawal page,
     * enter an amount, and successfully submit a withdrawal request.
     */
    @Test
    public void withdrawalPageTest() {
        // Wait for the 'Withdrawal' button to be clickable and click it
        WebElement withdrawalButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Withdrawal')]"))
        );
        withdrawalButton.click();

        // Wait for the withdrawal input field to be clickable and enter the withdrawal amount
        WebElement inputField = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder, 'amount')]"))
        );
        inputField.sendKeys("200");

        // Wait for the withdrawal submission button to be clickable and click it
        WebElement withdrawalSubmitButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"))
        );
        withdrawalSubmitButton.click();
    }
}
