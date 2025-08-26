package api.tests;

import api.pages.UserApi;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UserApiTest extends BaseApiTest {

    private final UserApi userApi = new UserApi();

    @Test
    public void getAllUsersTest() {
        Response response = userApi.getAllUsers();

        // Validar cantidad de usuarios
        assertEquals(response.jsonPath().getList("$").size(), 10);

        // Imprimir primer usuario
        String firstUserName = response.jsonPath().getString("[0].name");
        System.out.println("Primer usuario: " + firstUserName);
    }

    @Test
    public void getUserByIdTest() {
        Response response = userApi.getUserById(1);

        int id = response.jsonPath().getInt("id");
        assertEquals(id, 1);

        String name = response.jsonPath().getString("name");
        System.out.println("Usuario 1: " + name);
    }
}
