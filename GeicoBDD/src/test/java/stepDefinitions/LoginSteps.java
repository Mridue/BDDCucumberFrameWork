package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.HomePage;

public class LoginSteps extends HomePage {
    HomePage homePage= PageFactory.initElements(driver, HomePage.class);

    @Given("^User is in Homepage$")
    public void user_is_in_Homepage() {

        Assert.assertEquals(getHomePage(), "https://www.geico.com/");
    }
    @When("^User click on login icon$")
    public void user_click_on_login_icon()  {
        Assert.assertEquals(clickOnLoginIcon(),"https://www.geico.com/");
    }
    @When("^User enter invalid userID and Password$")
    public void user_enter_invalid_userID_and_Password() {
        Assert.assertEquals(userLogin("wrong@gmail.com","1234"),"https://www.geico.com/");
    }
    @Then("^Unable to Login with Error Message$")
    public void unable_to_Login_with_Error_Message() throws InterruptedException {
        Assert.assertEquals(loginErrorMessage(),"");
    }
    @When("^User enter valid userID and Password$")
    public void user_enter_valid_userID_and_Password()  {
        Assert.assertEquals(userLogin("right@gmail.com","1234"),"https://www.geico.com/");

    }
}
