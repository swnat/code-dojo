public class FizzBuzz {
    private int numero=1;
    private String value;

    public int getNumber(){
        return numero;
    }

    public String test2(int number){
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }

    public String multiploCinco(int number){
        if (number % 5 == 0) {
            value = "Buzz";
        }
        return value;
    }

    public String multiploCincoAndTres(int number){
        if (number % 3 == 0 && number % 5 == 0){
            value = "FizzBuzz";
        }
        return value;
    }


}
