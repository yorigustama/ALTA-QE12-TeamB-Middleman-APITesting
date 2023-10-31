package starter.StepDef.UsersProducts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.UserProducts.GetUserSearchProductsAPI;
import starter.utils.Constants;

import java.io.File;

public class GetUserSearchProductsStepDef {
    @Steps
    GetUserSearchProductsAPI getUserSearchProductsAPI;

    @Given("user search valid json {string}")
    public void userSearchValidJson(String search) {
        getUserSearchProductsAPI.setGetUserProductSearch(search);
    }

    @When("Send request get search User")
    public void sendRequestGetSearchUser() {
        SerenityRest.when().get(GetUserSearchProductsAPI.GET_USER_PRODUCT_SEARCH);

    }
    @Then("Status code should be {int} oK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Given("user search invalid json {string}")
    public void userSearchInvalidJson(String seach) {
        getUserSearchProductsAPI.setGetUserProductUnsuccess(seach);

    }

    @When("Send request get invalid search User")
    public void sendRequestGetInvalidSearchUser() {
        SerenityRest.when().get(getUserSearchProductsAPI.GET_USER_PRODUCT_UNSUCCESS);
    }
}
