package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * This test class extends ManagerLoginTest and verifies the functionality
 * of opening a new account for a customer.
 */
public class OpenAccountTest extends ManagerLoginTest {

    /**
     * This test ensures that a manager can successfully open a new account
     * by selecting a customer, choosing a currency, and submitting the request.
     */
    @Test
    public void testOpenAccount() {
        // Wait for the 'Open Account' button to be clickable and click it
        WebElement openAccountButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Open Account')]"))
        );
        openAccountButton.click();

        // Wait for the customer dropdown to be visible and select a customer
        WebElement customerDropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("userSelect"))
        );
        Select userSelect = new Select(customerDropdown);
        userSelect.selectByVisibleText("Harry Potter");

        // Wait for the currency dropdown to be visible and select a currency
        WebElement currencyDropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("currency"))
        );
        Select currency = new Select(currencyDropdown);
        currency.selectByVisibleText("Dollar");

        // Wait for the 'Process' button to be clickable and click it to submit the request
        WebElement openAccountSubmitButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Process')]"))
        );
        openAccountSubmitButton.click();

        // Wait for the confirmation alert to appear and accept it
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}

