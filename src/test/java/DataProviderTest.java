import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.CheckPrimeNumber;

/**
 * Created by senorita on 3/13/2017.
 */
public class DataProviderTest {
    CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
    @DataProvider (name = "test")
    public static Object[][] primeNumbers(){
        return new Object[][] {{9,false},{8,false},{7,true},{2,true},{3,true},{4,false},{5,true},{6,false}};
    }

    @Test(dataProvider = "test")
    public void testPrimeNumber(int number, boolean expectedResult){
        System.out.println("Number="+number);
        System.out.println("Expected Result="+expectedResult);
        Assert.assertEquals(expectedResult,checkPrimeNumber.isPrimeNumber(number));
    }
}
