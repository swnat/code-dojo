import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void getNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getNumber(1));
    }

    @Test
    public void getFizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.getNumber(3));
    }

    @Test
    public void getBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.getNumber(5));
    }
}


