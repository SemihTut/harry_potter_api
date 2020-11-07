package StepDefinitions;

import POJOs.MyCharacters;
import POJOs.MyHouses;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
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
    MyHouses[]house ;

    @When("User get the current information from API for end point {string}")
    public void user_get_the_current_information_from_API_for_end_point(String endPoint) {
        response = given()
                .spec(requestSpecification)
                .when()
                .get(endPoint);
        response.then().log().all();
        //as = response.body().as(MyCharacters[].class);
        house = response.body().as(MyHouses[].class);

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
        houses.forEach(System.out::println);

    }

    @Then("Houses should include following items")
    public void houses_should_include_following_items(DataTable dataTable) {
        List<String> expectedHouses = dataTable.asList();
        System.out.println("expectedHouses = " + expectedHouses);
        List<String> actualHouses = new ArrayList<>();
        for(MyHouses mh : house){
            actualHouses.add(mh.getName());
        }
        System.out.println("actualHouses = " + actualHouses);

    }
}
