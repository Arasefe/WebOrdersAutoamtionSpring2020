package com.weborders.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {
    //Product Information
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    private WebElement pricePerUnit;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    private WebElement discount;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    private WebElement total;

    @FindBy(css = "[value='Calculate']")
    private WebElement calculateButton;

    //Address Information
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zip;

    //Payment Information
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expirationDate;

    @FindBy(xpath = "//input[@value = 'Visa']")
    private WebElement visaCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;

    public void selectProduct(String productName) {
        Select select = new Select(productDropdown);
        select.selectByVisibleText(productName);
    }

    public void enterQuantity(String quantityValue) {
        quantity.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), quantityValue);
    }

    public void enterPricePerUnit(String pricePerUnitValue) {
        pricePerUnit.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), pricePerUnitValue);
    }

    public void enterDiscount(String discountValue) {
        discount.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), discountValue);
    }

    public void clickToCalculate(){
        calculateButton.click();
    }

}
