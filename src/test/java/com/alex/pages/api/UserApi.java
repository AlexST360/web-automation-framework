package api.pages;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserApi {

    private final String basePath = "/users";

    public Response getAllUsers() {
        return given()
                .header("Accept", "application/json")
                .when()
                .get(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    public Response getUserById(int id) {
        return given()
                .header("Accept", "application/json")
                .when()
                .get(basePath + "/" + id)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
