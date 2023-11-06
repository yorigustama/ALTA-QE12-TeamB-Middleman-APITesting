package starter.stepdef.carts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.carts.DeleteCartsAPI;

public class DeleteCartsStepDef {
    @Steps
    DeleteCartsAPI deleteCartsAPI;

    @Given("Delete carts with invalid id")
    public void deleteCartsWithInvalidId(){
        deleteCartsAPI.setDeleteCarts();
    }

    @When("Send request delete carts")
    public void sendRequestDeleteCarts(){
        SerenityRest.when().delete(DeleteCartsAPI.DELETE_CARTS);
    }
}
