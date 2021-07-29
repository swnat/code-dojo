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

    @Test
    public void getNumberTest3(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.multiplos(15));
    }

    @Test
    public void getNumberTest4(){
        fizzBuzz = new FizzBuzz();
        for(int i = 1; i<= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                Assert.assertEquals("FizzBuzz", fizzBuzz.multiplos(i));
            } else if (i % 3 == 0) {
                Assert.assertEquals("Fizz", fizzBuzz.multiplos(i));
            } else if (i % 5 == 0) {
                Assert.assertEquals("Buzz", fizzBuzz.multiplos(i));
            }
        }

    }

}
