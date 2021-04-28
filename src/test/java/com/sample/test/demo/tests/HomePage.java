package com.sample.test.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public ElementUtil elementUtil;

    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        elementUtil = new ElementUtil(driver);
        PageFactory.initElements(driver,this);
    }

    //Locators
    By pizza1 = By.id("pizza1Pizza");
    By pizza1Toppings1 = By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
    By pizza1Toppings2 = By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
    By pizza1Quantity = By.id("pizza1Qty");
    By pizza1Cost = By.id("pizza1Cost");

    By radioCreditCard = By.id("ccpayment");
    By radioCash = By.id("cashpayment");

    By email = By.id("email");
    By name = By.id("name");
    By phone = By.id("phone");

    By placeOrderButton = By.id("placeOrder");
    By resetButton = By.id("reset");

    By dialog = By.id("dialog");
    By dialogText = By.xpath("//div[@id='dialog']/p");


    public String getPageTitle() {
        return elementUtil.doGetPageTitle();
    }

    public String getPageUrl() {
        return elementUtil.doGetPageUrl();
    }

    public void choosePizzaType (String pizzaType){
        elementUtil.selectDropDownValue(driver, pizza1, pizzaType);
    }

    public void choosePizza1Topping1 (String pizzaTopping){
        elementUtil.selectDropDownValue(driver, pizza1Toppings1, pizzaTopping);
    }

    public void choosePizza1Topping2 (String pizzaTopping){
        elementUtil.selectDropDownValue(driver, pizza1Toppings2, pizzaTopping);
    }

    public void orderQuantity(int quantity){
        elementUtil.doSendKeys(pizza1Quantity, String.valueOf(quantity));
    }

    public void orderCost(){
        elementUtil.doGetText(pizza1Cost);
    }

    public void customerName (String customerName){
        elementUtil.doSendKeys(name, customerName);
    }

    public void customerEmail (String customerEmail){
        elementUtil.doSendKeys(email, customerEmail);
    }

    public void customerPhoneNumber (String customerPhone){
        elementUtil.doSendKeys(phone, customerPhone);
    }

    public void paymentCredit (){
        elementUtil.doClick(radioCreditCard);
    }

    public void paymentCash (){
        elementUtil.doClick(radioCash);
    }

    public void placeOrder (){
        elementUtil.doClick(placeOrderButton);
    }

    public String getOrderConfirmation (){
        return elementUtil.doGetText(dialogText);
    }

}
