package starter.StepDef.UsersProducts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.DummyJsonResponses;
import starter.middleman.UserProducts.DeleteUserProductsAPI;
import starter.middleman.UserProducts.GetUsersProductsAPI;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetUserProductsStepDef {

    @Given("Get all product users")
    public void getAllProductUsers() {
        GetUsersProductsAPI.setGetUsersProduct();
    }

    @When("Send get product users request")
    public void sendGetProductUsersRequest() {
        SerenityRest.when().get(GetUsersProductsAPI.GET_USERS_PRODUCT);
    }

    @Given("Get all Product User Invalid")
    public void getAllProductUserInvalid() {
        GetUsersProductsAPI.setGetUsersProductUnsuccess();
    }

    @Then("Status code should be {int} Badrequ")
    public void statusCodeShouldBeBadrequ(int aunauth) {
        SerenityRest.then().statusCode(aunauth);
    }
}
