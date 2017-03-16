import org.testng.annotations.Factory;

/**
 * Created by senorita on 3/16/2017.
 */
public class SimpleTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new SampleTest(),
                new SampleTest()
        };
    }
}
