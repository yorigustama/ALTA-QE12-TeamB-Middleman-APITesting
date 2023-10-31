package starter.StepDef.UsersProducts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import starter.middleman.UserProducts.PostUserProductsAPI;
import starter.utils.Constants;

import java.io.File;


public class PostUserProductsStepDef {
    @Steps
    PostUserProductsAPI postUserProductsAPI;

    @When("Send request post create User Products")
    public void sendRequestPostCreateUserProducts() {
        SerenityRest.when().post(PostUserProductsAPI.POST_ADD_PRODUCTS_USERS);
    }


    @Given("Create New Product User")
    public void createNewProductUser(){
        postUserProductsAPI.setPostAddProductsUsers();
    }

    @Given("Create New Invalid Product User")
    public void createNewInvalidProductUser() {
        postUserProductsAPI.setPostAddProductsUsersUnsuccess();
    }

}
