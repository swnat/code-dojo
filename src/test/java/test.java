import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void getNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(1, fizzBuzz.getNumber());
    }

    @Test
    public void Check3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz",fizzBuzz.test2(3));
    }

    @Test
    public void Check5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.multiploCinco(5));
    }

    @Test
    public void Check3and5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.multiploCincoAndTres(15));
    }

}
