package starter.stepdef.carts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.carts.PutUpdateCartsAPI;

public class PutUpdateCartsStepDef {

    @Steps
    PutUpdateCartsAPI putUpdateCartsAPI;

    @Given("Update carts with valid id {string}")
    public void updateCartsWithValidJson(String id) {
        putUpdateCartsAPI.setPutUpdateCarts(id);
    }

    @When("Send request put update carts")
    public void sendRequestPutUpdateCarts() {
        SerenityRest.when().put(PutUpdateCartsAPI.PUT_UPDATE_CARTS);
    }
}
