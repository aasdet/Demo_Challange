package com.sample.test.demo.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

    public WebDriver driver;
    WebDriverWait wait;

    public ElementUtil(WebDriver driver){
        this.driver=driver;
    }

    /**
     * get page URL
     * @return
     */
    public String doGetPageTitle() {
        try {
            return driver.getTitle();
        }
        catch (Exception e) {
            System.out.println("some exception got occured while getting the title...");
        }
        return null;
    }

    /**
     * get page URL
     * @return
     */
    public String doGetPageUrl() {
        try {
            return driver.getCurrentUrl();
        }
        catch (Exception e) {
            System.out.println("some exception got occured while getting URL...");
        }
        return null;
    }

    /**
     * this method is used to create the weblement on the basis of By locator
     * @param locator
     * @return
     */
    public WebElement getElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        }
        catch (Exception e) {
            System.out.println("some exception got occured while creating the web element...");
        }
        return element;
    }

    /**
     * this method is used to click the weblement on the basis of By locator
     * @param locator
     */
    public void doClick(By locator) {
        try {
            getElement(locator).click();
        }
        catch (Exception e) {
            System.out.println("some exception got occured while clicking the web element...");
        }
    }

    /**
     * this method is used to send  value in a field
     * @param locator
     * @param value
     */
    public void doSendKeys(By locator, String value) {
        try {
            WebElement element = getElement(locator);
            element.clear();
            element.sendKeys(value);
        }
        catch (Exception e) {
            System.out.println("some exception got occured while entering values in a field...");
        }
    }

    /**
     * is displayed
     * @param locator
     * @return
     */
    public boolean doIsDisplayed(By locator) {
        try {
            return getElement(locator).isDisplayed();
        }
        catch (Exception e) {
            System.out.println("some exception got occured...");
        }
        return false;
    }

    /**
     * is enabled
     * @param locator
     * @return
     */
    public boolean doIsEnabled(By locator) {
        try {
            return getElement(locator).isEnabled();
        }
        catch (Exception e) {
            System.out.println("some exception got occured...");
        }
        return false;
    }

    /**
     * is selected
     * @param locator
     * @return
     */
    public boolean doIsSelected(By locator) {
        try {
            return getElement(locator).isSelected();
        }
        catch (Exception e) {
            System.out.println("some exception got occured...");
        }
        return false;
    }

    /**
     * get text
     * @param locator
     * @return
     */
    public String doGetText(By locator) {
        try {
            return getElement(locator).getText();
        }
        catch (Exception e) {
            System.out.println("some exception got occured while getting text...");
        }
        return null;

    }

    /**
     * hover Over
     * @param driver
     * @param locator
     * @return
     */
    public WebElement hoverOver(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        return element;
    }

    /**
     * get Alert
     * @param text
     */
    public void getAlertText(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    /**
     * handle Alert
     */
    public void handleAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /**
     * is Title present
     * @param title
     * @return
     */
    public boolean waitForTitlePresent(String title) {
        wait.until(ExpectedConditions.titleIs(title));
        return true;
    }

    /**
     * presenceOfElementLocated
     * @param locator
     * @return
     */
    public boolean waitForElementPresent(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return true;
    }

    /**
     * visibilityOfElementLocated
     * @param locator
     * @return
     */
    public boolean waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;
    }

    /**
     * Provides dropdown menu
     * @param driver
     * @param locator
     * @param value
     */
    public void selectDropDownValue(WebDriver driver, By locator, String value) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

}
