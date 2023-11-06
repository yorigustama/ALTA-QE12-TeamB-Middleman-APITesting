package starter.stepdef.adminproduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import starter.middleman.adminproduct.PutUpdateProductAPI;

public class PutUpdateProductStepDef {
    @Steps
    PutUpdateProductAPI putUpdateProductAPI;

    @Given("Update product with valid id")
    public void updateProductWithValidId(){
        putUpdateProductAPI.setPutUpdateProduct();
    }

    @When("Send request put update product")
    public void sendRequestPutUpdateProduct() {
        SerenityRest.when().put(PutUpdateProductAPI.PUT_UPDATE_PRODUCT);
    }

    //Scenario 2
    @Given("Update product without product name")
    public void updateProductWithoutProductName() {
        putUpdateProductAPI.setPutUpdateWithoutProductName();
    }
    @Then("Status code should be {int} Method Not Allowed")
    public void statusCodeShouldBeMethodNotAllowed(int methodNotAllowed) {
        SerenityRest.then().statusCode(methodNotAllowed);
    }

    @And("Request body message {string}")
    public void requestBodyMessage(String message) {
        SerenityRest.then().body("message", Matchers.equalTo(message));
    }
}
