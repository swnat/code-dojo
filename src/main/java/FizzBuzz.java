public class FizzBuzz {
    private int numero=1;

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


}
