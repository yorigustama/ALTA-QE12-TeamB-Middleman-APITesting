package starter.StepDef.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.MiddlemanResponses;
import starter.middleman.Orders.PostOrdersUsersAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PostAddOrdersUsersStepDef {

    @Steps
    PostOrdersUsersAPI postOrdersUsersAPI;
    @Given("Create new user with json {string}")
    public void createNewUserWithJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postOrdersUsersAPI.setPostOrdersUsers(json);
    }

    @When("Send request post create new user")
    public void sendRequestPostCreateNewUser() {
        SerenityRest.when().post(PostOrdersUsersAPI.POST_ORDERS_USERS);
    }

//    @Then("Status code should be {int} Created")
//    public void statusCodeShouldBeOK(int created) {
//        SerenityRest.then().statusCode(created);
//    }

    @Given("Add Orders user with json {string}")
    public void addOrdersUserWithJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postOrdersUsersAPI.setPostOrdersUsers(json);
    }

    @And("Response body patch productId was {string} and productName was {string}")
    public void responBodyPatchProductIdWasAndProductNameWas(String productId, String productName) {
        SerenityRest.and().body(MiddlemanResponses.PRODUCT_ID, equalTo(productId));
        SerenityRest.and().body(MiddlemanResponses.PRODUCT_NAME, equalTo(productName));
    }
}
