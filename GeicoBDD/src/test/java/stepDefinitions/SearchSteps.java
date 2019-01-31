package stepDefinitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.HomePage;

public class SearchSteps extends HomePage {
    HomePage homePage= PageFactory.initElements(driver, HomePage.class);
    @When("^User write on search Box \"([^\"]*)\"and hit enter$")
    public void user_write_on_search_Box_and_hit_enter(String Product){
       Assert.assertEquals(searchWithENTER(Product),"Site Search");
    }
    @Then("^User is provided with list of desired products$")
    public void user_is_provided_with_list_of_desired_products() {
       Assert.assertEquals(getSearchList(),"Site Search");
    }
}
