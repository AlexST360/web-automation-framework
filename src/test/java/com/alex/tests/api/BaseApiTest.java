package api.tests;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;

public class BaseApiTest {

    @BeforeClass
    public void setup() {
        // Base URL de la API (puedes cambiarla a tu endpoint real)
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Logging automático de requests/responses
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
