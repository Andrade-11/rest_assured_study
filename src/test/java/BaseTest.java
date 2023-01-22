import constants.Code;
import constants.Utils;
import io.restassured.RestAssured;
import org.junit.Before;
import static io.restassured.RestAssured.given;

public abstract class BaseTest {

    @Before
    public void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
    protected String getUri(String endpoint){
        return Utils.BASE_URL.getValue() + endpoint;
    }

    //In the Future implements Switch Case
    protected int getCode(int option) {
        if (option == 1) {
            return Code.SUCESS.getCode();
        } else if (option == 2) {
            return Code.BADREQUEST.getCode();
        }
        return -1;
    }
    protected void baseRequest(String endpoint,int option){
        given().contentType("application/json").body("").when().get(getUri(endpoint)).then().statusCode(getCode(option)).log().all();
    }

}
