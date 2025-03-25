package com.restassured;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class ApplicationTest {

    @Test
    void verifyStatusCode() {

        given()
                .when()
                // .get("https://jsonplaceholder.typicode.com/posts/1")
                .get("https://jsonplaceholder.typicode.com/posts/99999")
                .then()
                // .statusCode(200);
                .statusCode(404);

    }

    @Test
    void verifyUserId() {

        given()
                .when()

                .get("https://jsonplaceholder.typicode.com/posts/")
                .then()
                .header("Content-Type", "application/json; charset=utf-8");

    }

    @Test
    void verifyContentTypeHeader() {
        given()
                .when()

                .get("https://jsonplaceholder.typicode.com/posts/18")
                .then()
                .body("userId", equalTo(1));

    }

    @Test
    void postRequest(){
        String requestBody = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}"; 
        given()
        .contentType("application/json")
        .body(requestBody)
                .when()

                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .body("title", equalTo("foo"))
                .body("body", equalTo("bar"))
                .body("userId", equalTo(1))
                .statusCode(201);


    }
}
