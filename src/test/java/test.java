import org.junit.Assert;
import org.junit.Test;

public class test {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void getNumberTest() {
        Assert.assertEquals("1", fizzBuzz.getNumber(1));
    }

    @Test
    public void imprimir(){
        Assert.assertEquals("Fizz", fizzBuzz.getNumber(3));
    }
    @Test
    public void multiploCinco(){
        Assert.assertEquals("Buzz", fizzBuzz.getNumber(5));
    }
    @Test
    public void multiploCincoTres(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.getNumber(15));
    }

//    @Test
//    public void NotFizzBuzz(){
//        Assert.assertEquals(17, fizzBuzz.getNotFizzBuzz(17));
//    }
}
