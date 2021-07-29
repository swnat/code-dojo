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
}
