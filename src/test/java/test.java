import org.junit.Assert;
import org.junit.Test;

public class test {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void getNumberTest() {
        Assert.assertEquals(1, fizzBuzz.getNumber(1));
    }

    @Test
    public void imprimir(){
        Assert.assertEquals("fizz", fizzBuzz.getFizz(3));
    }
    @Test
    public void multiploCinco(){
        Assert.assertEquals("buzz", fizzBuzz.getBuzz(5));
    }
    @Test
    public void multiploCincoTres(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.getfizzBuzz(15));
    }
}
