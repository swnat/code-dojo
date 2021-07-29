public class FizzBuzz {
    public String multiplos(int numero){
        String valor = "";
        if(numero % 3 == 0 && numero % 5 == 0) {
            valor = "FizzBuzz";
        } else if( numero % 3 == 0 ){
            valor = "Fizz";
        } else if(numero % 5 == 0) {
            valor = "Buzz";
        }
        return valor;
    }
}
