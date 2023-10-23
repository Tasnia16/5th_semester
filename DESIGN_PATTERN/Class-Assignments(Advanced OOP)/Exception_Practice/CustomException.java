package Exception_Practice;

public class CustomException extends Exception {
    CustomException(int t)
    {
        System.out.println(t+" is greater than 300");
    }
}
