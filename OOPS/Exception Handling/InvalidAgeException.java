class InvalidAgeException extends RuntimeException
{
    private String msg = "Invalid Age !!! ";
            InvalidAgeException(String msg)
            {
                this.msg = msg;
            }
            InvalidAgeException(){}
    public String toString()
    {
        return "InvalidAgeException :" + msg;
    }
}
class Site {
    public void Login(int age)
    {
        System.out.println("program started ...");
        if(age>=70)
            home();
        else
            throw new InvalidAgeException("Age Should be greater than 70 or above ");
        System.out.println("thank you for visit ..");
    }
    private void home()
    {
        System.out.println("welcome to your second home ");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("program started ");
 Site s = new Site();
 try {
     s.Login(50);
 }catch (InvalidAgeException e )
 {
     System.out.println(e);
 }
        System.out.println("program ended");
    }
}

//program started
//program started ...
//InvalidAgeException :Age Should be greater than 70 or above
//program ended