import org.junit.Assert;
import org.junit.Test;

public class test {
private     FizzBuzz fizzBuzz = new FizzBuzz();

    @Test

    public void getNumber(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.multiplos(3));
    }

    @Test
    public void getNumberTest2(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.multiplos(5));
    }
}
