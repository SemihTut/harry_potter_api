package StepDefinitions;



import io.cucumber.java.*;
import io.restassured.RestAssured;
import utilities.ConfigurationReader;

public class Hooks {

    @Before
    public void setUp() {
        RestAssured.baseURI = ConfigurationReader.getProperty("happyPotterUrl");

    }

}