package org.testacademy;

import io.restassured.RestAssured;

public class Test001 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("REST Assured Test Case");
        System.out.println("GET Request Demo");

        // Gherkin
        // Given() -> url, headers, body, payloads
        // When -> http methods
        // Then -> Verify the response (using assertion)

        RestAssured.
                given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1").log().all()
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
