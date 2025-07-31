package exception;

public class CustomException {
    public static void main(String args[]) throws AgeLessThanZero{
      int age = -3;
      validAge(age);
    }

    private static void validAge(int age) throws AgeLessThanZero{
      if(age < 0){
        throw new AgeLessThanZero();
      }
    }
}

// public class AgeLessThanZero extends Exception{

// }