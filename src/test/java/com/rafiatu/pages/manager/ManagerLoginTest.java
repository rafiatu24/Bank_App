package com.rafiatu.pages.manager;

import com.rafiatu.base.BasePageTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This test class extends BasePageTest and verifies the functionality
 * of the manager login process.
 */
public class ManagerLoginTest extends BasePageTest {

    /**
     * This test ensures that a manager can successfully log in
     * by clicking the 'Bank Manager Login' button.
     */
    @Test
    public void managerLoginTest() {
        // Wait for the 'Bank Manager Login' button to be clickable and click it
        WebElement managerLoginButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Bank Manager Login')]"))
        );
        managerLoginButton.click();
    }
}
