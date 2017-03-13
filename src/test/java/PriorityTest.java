import org.testng.annotations.Test;

/**
 * Created by senorita on 3/12/2017.
 */
public class PriorityTest {
    @Test(priority = 0)
    public void firstTest(){
        System.out.println("This is first test");
    }

    @Test(priority = 1)
    public void secondTest(){
        System.out.println("This is second test");
    }

    @Test(priority = 2)
    public void thirdTest(){
        System.out.println("This is third test");
    }

    @Test(priority = 3)
    public void fourthTest(){
        System.out.println("This is fourth test");
    }
}
