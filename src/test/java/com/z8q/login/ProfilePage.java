package com.z8q.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'b-link--inherit b-enterAccount__link--arrow qa-account')]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[contains(@class, 'b-link--inherit b-enterAccount__link--dt qa-logout-button')]")
    private WebElement logoutBtn;

    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'b-link--inherit b-enterAccount__link--arrow qa-account')]")));
        String userName = userMenu.getText();
        return userName; }

    public void entryMenu() {
        userMenu.click(); }

    public void userLogout() {
        logoutBtn.click(); } }