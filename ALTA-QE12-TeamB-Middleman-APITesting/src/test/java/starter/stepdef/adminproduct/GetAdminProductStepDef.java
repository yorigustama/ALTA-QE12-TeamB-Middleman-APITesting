package starter.stepdef.adminproduct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.middleman.adminproduct.GetAdminProductAPI;

public class GetAdminProductStepDef {

    @Given("Get all admin product")
    public void getAdminProductWithId() {
        GetAdminProductAPI.setGetAdminProduct();
    }

    @When("Send get product request")
    public void sendGetProductRequest() {
        SerenityRest.when().get(GetAdminProductAPI.GET_ADMIN_PRODUCT);
    }
}
