package com.rafiatu.pages.manager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends CustomersTest and verifies the functionality
 * of deleting a customer from the customers list.
 */
public class DeleteCustomerTest extends CustomersTest {

    /**
     * This test ensures that a manager can successfully delete a customer
     * by clicking the corresponding 'Delete' button.
     */
    @Test
    public void deleteCustomer() {
        // Wait for the 'Delete' button corresponding to the customer with ID 'E725JB' to be clickable
        WebElement deleteButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(), 'E725JB')]/following-sibling::td/button[contains(text(), 'Delete')]"))
        );

        // Click the 'Delete' button to remove the customer
        deleteButton.click();
    }
}
