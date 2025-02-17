package in.reqres.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetAPITests {
    @Test
    public void shouldBeAbleToGetListOfUsers() {
        System.out.println("This is my First Test game");
        System.out.println("This is my First Test Road");
        given().header("content-type", "application/json")
                .baseUri("https://reqres.in").when().get("api/users?page=2")
                .then().log().all().assertThat().statusCode(200)
                .body("data[0].email",equalTo("michael.lawson@reqres.in"));

    }
}
