package starter.stepdef.carts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import starter.middleman.carts.PostCartsAPI;

public class PostCartsStepDef {

    @Steps
    PostCartsAPI postCartsAPI;

    @Given("Create post carts")
    public void createNewCartsWithValidJson() {
        postCartsAPI.setPostCreateUsers();
    }

    @When("Send request post create carts")
    public void sendRequestPostCreateNewCarts() {
        SerenityRest.when().post(PostCartsAPI.POST_CREATE_USERS);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int Ok) {
        SerenityRest.then().statusCode(Ok);
    }

    @And("Response body message {string}")
    public void responseBodyProduct_idWasAndQtyWas(String message) {
        SerenityRest.then().body("message", Matchers.equalTo(message));
    }
}
