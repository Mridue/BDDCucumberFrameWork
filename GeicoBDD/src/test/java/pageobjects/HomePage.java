package pageobjects;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/input")
    public static WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/button")
    public static WebElement searchSubmitButton;
    @FindBy(xpath = "//a[@class='search']")
    public static WebElement searchIcon;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/h1[1]")
    public static WebElement searchResultHeadline;
    @FindBy(xpath = "//div[@id='header-right-links']/ul[1]/li[2]/a[@href='#']")
    public static WebElement login;
    @FindBy(id="LOGIN_policyNo")
    public static WebElement user_ID;
    @FindBy(id="LOGIN_password")
    public static  WebElement password;
    @FindBy(css=".checkbox")
    public static WebElement rememberMeCheckBox;
    @FindBy(id="manageSubmit")
    public static WebElement loginSubmitButton;
    @FindBy(id="userPassword-msgs")
    public static WebElement loginErrorMessage;

    public String getHomePage(){
        return driver.getCurrentUrl();
    }

    public   void waitToBeVisible(){
        searchIcon.click();
    }
    public String searchWithENTER(String searchKeys){
        waitToBeVisible();
        clearField(searchTextBox);
        searchTextBox.sendKeys(searchKeys, Keys.ENTER);
        return searchResultHeadline.getText();
    }
    public String getSearchList(){
        return searchResultHeadline.getText();
    }
    public String clickOnLoginIcon(){
        login.click();
        return driver.getCurrentUrl();
    }

    public  String  userLogin(String userIDKey, String  passwordKey){
        user_ID.sendKeys(userIDKey);
        password.sendKeys(passwordKey);
        rememberMeCheckBox.click();
        return driver.getCurrentUrl();
    }
    public String loginErrorMessage() {
        loginSubmitButton.click();
        return loginErrorMessage.getText();
    }

}
