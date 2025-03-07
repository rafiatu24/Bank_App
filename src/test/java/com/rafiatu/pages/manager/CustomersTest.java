package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends ManagerLoginTest and verifies the functionality
 * of accessing the 'Customers' page.
 */
public class CustomersTest extends ManagerLoginTest {

    /**
     * This test ensures that a manager can successfully navigate
     * to the 'Customers' page by clicking the 'Customers' button.
     */
    @Test
    public void customerTest() {
        // Wait for the 'Customers' button to be clickable and click it
        WebElement customerButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Customers')]"))
        );
        customerButton.click();
    }
}
