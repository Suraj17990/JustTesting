import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by senorita on 3/12/2017.
 */
public class parameterTest {
    @Parameters({"userName","password"})
    @Test
    public void login(@Optional("Suraj") String userName,@Optional("mypassword") String password){
        System.out.println("My User Name:"+userName);
        System.out.println("My Password:"+password);
    }
}
