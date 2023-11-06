package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.GetOrdersUsersIdAPI;

public class GetOrdersUsersIdStepDef {

    @Steps
    GetOrdersUsersIdAPI getOrdersUsersIdAPI;
    @Given("Get list orders user id {int}")
    public void getListOrdersUserId(int id) {
        getOrdersUsersIdAPI.setGetOrdersUsersId(id);
    }

    @When("Send request get list orders user id")
    public void sendRequestGetListOrdersUserId() {
        SerenityRest.when().get(GetOrdersUsersIdAPI.GET_ORDERS_USERS_ID);
    }
}
