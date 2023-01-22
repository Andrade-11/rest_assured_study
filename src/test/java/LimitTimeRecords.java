import org.junit.Test;

public class LimitTimeRecords extends BaseTest{
    @Test
    public void getFireballInformationLimitBy10(){
            baseRequest("?limit=20",1);
    }
}
