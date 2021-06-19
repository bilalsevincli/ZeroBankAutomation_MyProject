package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatementsPage extends BasePage{

    @FindBy(id = "os_accountId")
    public WebElement accountDropDown;

    @FindBy(xpath = "//div[@id='online_statements_for_account']/h2")
    public WebElement accountHeader;

    @FindBy(linkText = "2012")
    public WebElement year2012;

    @FindBy(linkText = "2011")
    public WebElement year2011;

    @FindBy(linkText = "2010")
    public WebElement year2010;

    @FindBy(linkText = "2009")
    public WebElement year2009;

}
