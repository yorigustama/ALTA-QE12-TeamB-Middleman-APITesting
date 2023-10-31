package starter.stepdef.adminproduct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.adminproduct.PostAdminProductAPI;

public class PostAdminProductStepDef {

    @Steps
    PostAdminProductAPI postAdminProductAPI;

    @Given("Create new product")
    public void createNewProductWithValidJson() {
        postAdminProductAPI.setPostAddProduct();
    }

    @When("Send request post create new product")
    public void sendRequestPostCreateNewProduct() {
        SerenityRest.when().post(PostAdminProductAPI.POST_ADD_PRODUCT);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    // Scenario 2

    @Given("Create new product without product name")
    public void createNewProductWithoutProductName() {
        postAdminProductAPI.setPostAddInvalidProductName();
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

}
