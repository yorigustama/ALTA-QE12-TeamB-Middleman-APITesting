package starter.StepDef.UsersProducts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.UserProducts.PutUpdateUserProductsAPI;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateUserProductsStepDef {
    @Steps
    PutUpdateUserProductsAPI putUpdateUsersProductAPI;

    @Given("Update product users with valid id")
    public void updateProductUsersWithValidId() {
        putUpdateUsersProductAPI.setPutUpdateUsers();
    }

    @When("Send request put update product users")
    public void sendRequestPutUpdateProductUsers() {
        SerenityRest.when().put(PutUpdateUserProductsAPI.PUT_UPDATE_USERS);
    }

    @Given("Update product users with invalid id")
    public void updateProductUsersWithInvalidId() {
        putUpdateUsersProductAPI.setPutUpdateUsersUnsuccess();
    }

    //Scenario 2


}
