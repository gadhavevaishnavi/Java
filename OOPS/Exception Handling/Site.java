class Site
{
    public void login(int age) {
        System.out.println("welcome to your home !!! ");
        if (age>=70)
            home();
        else
        {
            throw new ArithmeticException();
        }
        System.out.println("thank you for visit....");
    }
    private void home() {
        System.out.println("welcome to your second home !!!");
    }
}
class MainClass3
{
    public static void main(String args[]){
        System.out.println("program started !!!");
        Site s = new Site();
        try {
            s.login(87);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("program ended....");
    }
}

//program started !!!
//welcome to your home !!!
//welcome to your second home !!!
//thank you for visit....
//program ended....

/*
class Site
{
    public void login(int age) {
        System.out.println("welcome to your home !!! ");
        if (age>=70)
            home();
        else
        {
            throw new ArithmeticException();
        }
        System.out.println("thank you for visit....");
    }
    private void home() {
        System.out.println("welcome to your second home !!!");
    }
}
class MainClass{
    public static void main(String args[]){
        System.out.println("program started !!!");
        Site s = new Site();
        try {
            s.login(50);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("program ended....");
    }
}

//program started !!!
//welcome to your home !!!
//java.lang.ArithmeticException
//program ended....
-----------------------------------

class Site
{
    public void login(int age) {
        System.out.println("welcome to your home !!! ");
        if (age>=70)
            home();
        else
        {
            throw new ArithmeticException();
        }
        System.out.println("thank you for visit....");
       }
        private void home() {
          System.out.println("welcome to your second home !!!");
    }
}
class MainClass{
    public static void main(String args[]){
        System.out.println("program started !!!");
        Site s = new Site();
        s.login(50);
        System.out.println("program ended....");
    }
}
//program started !!!
//welcome to your home !!!
//Exception in thread "main" java.lang.ArithmeticException
//	at Site.login(Main.java:9)
//	at MainClass.main(Main.java:21)
//throw keyword - stop execution of application (use -within block --with unchecked exception)
*/
