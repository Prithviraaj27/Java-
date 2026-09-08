class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException  {
    public static void main(String[] args)  {
        try {
            checkEligibility(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Invalid age");
        }
        if(age > 18) {
            System.out.println("valid age");
        }
    }
}
