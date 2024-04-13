package com.jsonplaceholder.tests;

import com.jsonplaceholder.util.JsonReader;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestCases {
    private static final String requestBodyPath = "src/test/resources/requestBody.json";


    @Test(priority = 1)
    public void testGettingAllPosts() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/posts")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test(priority = 2)
    public void testAddingNewPost() {
        String requestBody = JsonReader.getJsonBody(requestBodyPath);

        given().baseUri("https://jsonplaceholder.typicode.com")
                .body(requestBody)
                .when().post("/posts")
                .then().log().all()
                .assertThat().statusCode(201);
    }

}
