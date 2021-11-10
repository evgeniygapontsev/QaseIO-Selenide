package adapters;

import static io.restassured.RestAssured.given;

public class BaseAdapter {
String BASE_URL = "https://api.qase.io/";


    public void post(String body, String uri) {
        given().
                header("Content-Type", "application/json").
                header("Token", "90dd68e5ac7ee485e8b693d4d66c5f23c1406da2").
                body(body).
        when().
                post(BASE_URL + uri).
        then().
                log().all().
                statusCode(200);
    }

    public void del(String uri) {
        given().
                header("Content-Type", "application/json").
                header("Token", "90dd68e5ac7ee485e8b693d4d66c5f23c1406da2").
        when().
                delete(BASE_URL + uri).
        then().
                log().all().
                statusCode(200);
    }

    public String g(String uri) {
        String body =
                given().
                        header("Content-Type", "application/json").
                        header("Token", "90dd68e5ac7ee485e8b693d4d66c5f23c1406da2").
                when().
                        get(BASE_URL + uri).
                then().
                        log().all().
                        statusCode(200)
                        .extract().body().asString();
        return body;
    }
}
