package stefdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BaseClass;
import pages.Locators;
import utils.drivers.Drivers;

import java.util.HashMap;
import java.util.Map;
import  static  pages.Locators.*;


public class LoginMyStepdefs extends BaseClass {
    @Given("user on {string}")
    public void userOn(String url) {
        driver.get(url);

    }

    @When("user click Login Sign button")
    public void userClickLoginSignButton() {
        click(lLogin);


    }

    @And("user login with the following credentials")
    public void userLoginWithTheFollowingCredentials(DataTable table) {
        Map<String,String>map=table.asMap();
        sendKeys(lImail,map.get("username"));
        sendKeys(LPassword,map.get("password"));
        click(LLoginButton);
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LlogoutLink));
    }
}
