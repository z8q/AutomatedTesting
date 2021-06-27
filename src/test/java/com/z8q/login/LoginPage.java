package com.z8q.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public WebDriver driver;
    // конструктор, занимающийся инициализацией полей класса
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'j_username')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@class, 'b-form__input-text js-auth__item js-validate--pass--simple ')]")
    private WebElement passwdField;

    @FindBy(xpath = "//*[contains(@class, 'old-button old-button--red') and contains(text(), 'Войти')]")
    private WebElement loginBtn;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }
    public void clickLoginBtn() {
        loginBtn.click();
    }
}