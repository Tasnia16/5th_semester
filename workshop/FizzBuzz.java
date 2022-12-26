package workshop;

public class FizzBuzz {

        public static String check_number(int number) {
            String word = "";

            if (number % 3 == 0)
            {
                word+= "Fizz";
            }

            if (number % 5 == 0)
            {
                word+= "Buzz";
            }

            else
            {
                return String.valueOf(number);
            }

            return word;
        }
    }

