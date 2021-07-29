public class FizzBuzz {
    public String getNumber(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0) {
            return "Buzz";
        }else{
            return number + "";
        }
    }

    public String getFizz(int number){
        return "fizz";
    }

    public String getBuzz(int number){
        return "buzz";
    }

    public String getfizzBuzz(int number){
        return "FizzBuzz";
    }

//    public
}
