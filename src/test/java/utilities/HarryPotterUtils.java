package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class HarryPotterUtils {
    public static RequestSpecification requestIsReady(){
       return new RequestSpecBuilder()
                .setContentType("application/json;charset=UTF-8")
                .setAccept(ContentType.JSON)
                .addHeader("Content-Type", "application/json")
                .addQueryParam("key","$2a$10$Ms8llmSAkduwkRr6B32Liuu8VNfHs33zug7dxrXCH4nNGDKdivoii")
                .build();

    }

}
