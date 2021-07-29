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

        String x = Integer.toString(i);
        int j;
        for (j=0; j<x.length(); j++){
            if ("3".equals(x.charAt(j))) {
                return "Fizz";
            }
        }

        return String.valueOf(i);
    }

}

