package starter.StepDef.Inoutbounds;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inoutbounds.DeleteInoutboundsAPI;

public class DeleteInoutboundsStepDef {
    @Steps
    DeleteInoutboundsAPI deleteInoutboundsAPI;
    @Given("Delete a inoutbounds with valid user id {int}")
    public void deleteAInoutboundsWithValidUserId(int id) {
        deleteInoutboundsAPI.setDeleteInoutbounds(id);
    }

    @When("Send request delete user products")
    public void sendRequestDeleteUserProducts() {
        SerenityRest.when().delete(DeleteInoutboundsAPI.DELETE_INOUTBOUNDS);
    }

    @Given("Delete inbound user with invalid user id {}")
    public void deleteInboundUserWithInvalidUserId(Object param) {
        deleteInoutboundsAPI.DeleteInvalidUser(param);
    }

    @When("Send request delete inbound")
    public void sendRequestDeleteInbound() {
        SerenityRest.when().delete(DeleteInoutboundsAPI.DELETE_INOUTBOUNDS_UNSUCCESS);
    }

    @Then("Status code should be {int} NoContent")
    public void statusCodeShouldBeNoContent(int Nocont) {
        SerenityRest.then().statusCode(Nocont);
    }
}
