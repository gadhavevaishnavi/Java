public class multiCatch{
    public static void main(String[] args) {
        System.out.println("program started.....");
        String s1[] = {"123","234","235","ABC"};
        int num =0;
        /*
        try {       // try:to execute Doubtful statement 
            num = Integer.parseInt(s1[3].substring(4));
        }catch(ArrayIndexOutOfBoundsException e){    // catch: represent occured exception || provide user-defined msg||alternatives
            System.out.println(e);
            System.out.println("Catch 1 called");
        }catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("Catch 2 called");
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Catch 3 called");
        }catch(Exception e) {                // super catch
            System.out.println(e);
            System.out.println("Catch 4 called");
        }
        */
try {
    num = Integer.parseInt(s1[3]);
}catch(ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e){
    System.out.println(e);
} finally {               //invoke implicitly ,no matter exception occured or handled
    System.out.println("finally block executed ");
}
            System.out.println("Program ended.......");
    }
}
//program started.....
//java.lang.NumberFormatException: For input string: "ABC"
//finally block executed 
//Program ended.......