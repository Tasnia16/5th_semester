+
package workshop;
import java.sql.Array;
import java.util.*;

public class FizzBuzz {


        public static String check_number(int number) {

            String word = "";

            Integer[] num=new Integer[]{3,5};
            ArrayList<Integer>integers=new ArrayList<>(Arrays.asList(num));

            String[]str=new String[]{"Fizz","Buzz"};
            ArrayList<String>strings=new ArrayList<>(Arrays.asList(str));

            for(int i=0;i<integers.size();i++)
            {
                if(number% integers.get(i)==0)
                {
                    word+=strings.get(i);
                }
            }

//
//            if (number % 3 == 0)
//            {
//                word+= "Fizz";
//            }
//
//            if (number % 5 == 0)
//            {
//                word+= "Buzz";
//            }
//
//            else
//            {
//                return String.valueOf(number);
//            }

            return word;
        }
    }

