package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expirationDate;

    @FindBy(xpath = "//input[@value = 'Visa']")
    private WebElement visaCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;
}
