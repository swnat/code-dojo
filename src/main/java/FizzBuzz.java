public class FizzBuzz {
    private final int numero = 3;
    private final int numero2 = 5;
    public String multiploDeTres(){
        String valor = "";
        if( numero % 3 == 0 ){

            valor = "Fizz";
        }
        return valor;
    }
    public String multiploDeCinco(){
        String valor2 = "";
        if( numero2 % 5 == 0 ){

            valor2 = "Buzz";
        }
        return valor2;
    }
}
