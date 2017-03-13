import org.testng.annotations.*;

/**
 * Created by senorita on 3/5/2017.
 */
public class AnnotationsTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("In Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("In After Suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("In Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("In After Class");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("In Before Groups");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("In After Groups");
    }
    @BeforeMethod (dependsOnGroups = {"animal"})
    public void beforeMethod(){
        System.out.println("In Before Method");
    }
    @Test (groups = {"test"})
    public void testMethod(){System.out.println("In test method");}
    @Test (groups = {"animal"})
    public void dogTest(){System.out.println("in dog test");}
    @AfterMethod
    public void afterMethod(){
        System.out.println("In After Method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("In Before Test");
    }
    @AfterTest
    public void afterTest(){ System.out.println("In After test"); }
    @Test (groups = {"test"})
    public void test(){
        System.out.println("In Test Method");
    }
    @Test (groups = {"animal"})
    public void animalTest(){System.out.println("In animal test");}
}
