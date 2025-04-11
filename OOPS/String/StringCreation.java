class StringCreation
{
    public static void main(String[] args) 
{

        //How to create String
        //1-by using new keyword
        String s1 = new String("Hello");
        System.out.println(s1);

        //2-by using literal way
        String s2 = "World";
        System.out.println(s2);

        //3-by using char[] array
        // char c[]={'I','n','d','i','a'};
        //  System.out.println(c);   //We can return char[] directily into the SOP
        char c[]={'I','n','d','i','a'};
        String s3 = new String(c);    //String constructor takes the character array and converts it into a string representation.
        System.out.println(s3);//India
        System.out.println(c);//India

//4-By using anonymous way
        int size = "India".length();
        System.out.println(size);  //5

        char c1 = new String ("India").charAt(2);
        System.out.println(c1); //d

        System.out.println("International");

    }
}