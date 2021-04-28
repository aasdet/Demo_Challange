package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// TODO complete the test cases
public class DemoTest extends TestBase {

    @BeforeMethod
    public void setUp() {
        PageFactory.initElements(driver, this);
        System.out.println("Before method running...");
    }

    @Test
    public void demoTest() {
        System.out.println("HELLO WORLD");
    }

    // Happy path case placing an order with valid input values
    @Test
    public void orderSuccess() {
        HomePage hp = new HomePage(driver);
        SoftAssert sa= new SoftAssert();

        hp.choosePizzaType(PizzaTypes.SMALL_ONETOPPINGS.getDisplayName());
        hp.choosePizza1Topping1(PizzaToppings.MANGOS.getDisplayName());
        hp.orderQuantity(2);
        hp.customerName("John Wayne");
        hp.customerEmail("johnwayne@gmail.com");
        hp.customerPhoneNumber("5553456754");
        hp.paymentCredit();
        hp.placeOrder();
        sa.assertTrue(hp.getOrderConfirmation().contains("Thank you for your order!"));
    }


    // Error case. Filling the form with invalid input values
    @Test
    public void orderFail() {
        HomePage hp = new HomePage(driver);
        SoftAssert sa= new SoftAssert();

        hp.choosePizzaType(PizzaTypes.LARE_NOTOPPINGS.getDisplayName());
        hp.choosePizza1Topping1(PizzaToppings.ONIONS.getDisplayName());
        hp.orderQuantity(-1);
        hp.customerName("JW");
        hp.customerEmail("jwgmailcom");
        hp.customerPhoneNumber("555345675423");
        hp.paymentCredit();
        hp.placeOrder();
        sa.assertFalse(hp.getOrderConfirmation().contains("Thank you for your order!"));
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method running...");
    }
}




