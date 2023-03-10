package ru.netology.postmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class EchoTest {
    @Test
    void shouldCheckSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"));
    }
}
