public class FizzBuzz {

    public String getNumber(int i){
        if(i%3==0 && i%5!=0){
            return "Fizz";
        }
        if (i % 5 == 0 && i%3!=0) {
            return "Buzz";
        }

        if(i % 5 == 0 && i%3==0){
            return "FizzBuzz";
        }

        return String.valueOf(i);
    }

}

