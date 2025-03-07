//package com.rafiatu.base;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BasePage {
//    private final WebDriverWait wait;
//
//    public BasePage(WebDriverWait wait) {
//        this.wait = wait;
//    }
//
//    public WebElement getButton(String buttonName){
//        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//button[contains(text(), %s)]", buttonName))));
//    }
//}
