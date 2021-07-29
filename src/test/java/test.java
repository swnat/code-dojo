import org.junit.Assert;
import org.junit.Test;

public class test {
private     FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void getNumber(){
        Assert.assertEquals("Fizz", fizzBuzz.multiploDeTres());
    }

    @Test
    public void getNumberTest2(){
        Assert.assertEquals("Buzz", fizzBuzz.multiploDeCinco());
    }
}
