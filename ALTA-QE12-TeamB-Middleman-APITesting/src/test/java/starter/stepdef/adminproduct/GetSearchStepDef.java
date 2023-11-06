package starter.stepdef.adminproduct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.adminproduct.GetSearchAPI;
import starter.utils.Constants;

import java.io.File;

public class GetSearchStepDef {
    @Steps
    GetSearchAPI getSearchAPI;

    @Given("admin search with valid json {string}")
    public void adminSearchWithValidJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        getSearchAPI.setGetAdminsSearch(json);
    }

    @When("Send request get admin search")
    public void sendRequestGetAdminSearch() {
        SerenityRest.when().get(GetSearchAPI.GET_ADMINS_SEARCH);
    }
}
