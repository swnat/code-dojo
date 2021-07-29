import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void getNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(1, fizzBuzz.getNumber(1));
    }
}
