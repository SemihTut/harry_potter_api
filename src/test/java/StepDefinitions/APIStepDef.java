package StepDefinitions;

import POJOs.MyCharacters;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigurationReader;
import utilities.HarryPotterUtils;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIStepDef {
    Response response;
    RequestSpecification requestSpecification = HarryPotterUtils.requestIsReady();
    MyCharacters[] as;

    @When("User get the current information from API for end point {string}")
    public void user_get_the_current_information_from_API_for_end_point(String endPoint) {
        response = given()
                .spec(requestSpecification)
                .when()
                .get(endPoint);
        //response.then().log().all();
        as = response.body().as(MyCharacters[].class);
        System.out.println("as.getId() = " + as[0].get_id());
    }

    @Then("status code should be {int}")
    public void status_code_should_be(int statusCode) {
        response.then().statusCode(statusCode);

    }

    @Then("{string} should not be empty")
    public void should_not_be_empty(String string) {
        response.then().body(string,is(notNullValue()));

    }

    @Then("User should get the {string} of below names")
    public void userShouldGetTheOfBelowNames(String jsonData, List<String> chars) {

        List<String>houses = new ArrayList<>();
        for(MyCharacters s : as){
            if(chars.contains(s.getName())){
                switch (jsonData){
                    case "id":
                        houses.add(s.get_id());
                        break;
                    case "role":
                        houses.add(s.getRole());
                        break;
                    case "house":
                        houses.add(s.getHouse());
                        break;
                    case "school":
                        houses.add(s.getSchool());
                        break;
                }
            }
        }
        System.out.println("id = " + houses);

    }
}
