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
     *
     * @throws InterruptedException to handle the sleep delay
     */
    @Test
    public void customerTest() throws InterruptedException {
        // Wait until the 'Customers' button is clickable and then click it
        WebElement customerButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Customers')]"))
        );
        customerButton.click();

        // Pause execution for 10 seconds (consider replacing this with an explicit wait for better performance)
        Thread.sleep(10000);
    }
}
