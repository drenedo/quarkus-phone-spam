package me.renedo;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TelephoneResourceTest {

    @Test
    public void testTelephone() {
        given()
          .when().get("/phone/345")
          .then()
             .statusCode(TelephoneResource.RESPONSE_NOT_FOUND.getStatus());
    }

}
