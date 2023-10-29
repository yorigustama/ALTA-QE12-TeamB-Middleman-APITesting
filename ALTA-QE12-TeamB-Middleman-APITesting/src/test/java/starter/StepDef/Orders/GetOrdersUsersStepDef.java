package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.GetOrdersUsersAPI;

public class GetOrdersUsersStepDef {

    @Steps
    GetOrdersUsersAPI getOrdersUsersAPI;
    @Given("Get list orders user")
    public void getListOrdersUser() {
        getOrdersUsersAPI.setGetOrdersUsers();

    }

    @When("Send request get list orders")
    public void sendRequestGetListOrders() {
        SerenityRest.when().get(GetOrdersUsersAPI.GET_ORDERS_USERS);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);

    }

}
