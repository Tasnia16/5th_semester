package Exception_Practice;

import java.io.FileNotFoundException;

public class Exception_Main {

    public static void main(String[] args) {
        int a=10,b=50;

        try{
            int c=a*b;

            if(c>300)
                throw new CustomException(c);
        }
        catch (CustomException e)
        {
            System.out.println(e);
            System.out.println("WRONG INPUT");
        }

        finally {
            System.out.println("HIIIII");
        }


    }
}
