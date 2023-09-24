import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TearDown {
    @Test
    public void tearDown(){
        Setup.driver.quit();
    }
}
