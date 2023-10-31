package starter.StepDef.UsersProducts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.UserProducts.DeleteUserProductsAPI;

public class DeleteUserProducts {
    @Steps
    DeleteUserProductsAPI deleteUserProductsAPI;

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(DeleteUserProductsAPI.DELETE_USER_PRODUCTS);
    }

    @Then("Status code should be {int} Notfound")
    public void statusCodeShouldBeNoContent(int noContent) {
        SerenityRest.then().statusCode(noContent);
    }

    @Given("Delete products user valid user id {int}")
    public void deleteProductsUserValidUserId(int id) {
        deleteUserProductsAPI.setDeleteUserProducts(id);
    }

    @Given("Delete a user with invalid user id {}")
    public void deleteAUserWithInvalidUserId(Object param) {
        deleteUserProductsAPI.DeleteInvalidUser(param);
    }

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int ok) {
        SerenityRest.then().statusCode(ok);
    }
}
