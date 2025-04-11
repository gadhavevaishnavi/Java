class MainEncapsule
{
    public static void main(String args[])
    {
        Encapsule e = new Encapsule();
        e.setId(28);
        e.setName("VAISHNAVI");
        e.setCity("pune");
        e.setPercentage(86.40);

        System.out.println("ID : "+e.getId());
        System.out.println("NAME : "+e.getName());
        System.out.println("CITY : "+e.getCity());
        System.out.println("PERCENTAGE : "+e.getPercentage());

/*


        // Initialize the object using the constructor
        Encapsule e = new Encapsule(28, "VAISHNAVI", "Pune", 86.40);

        // Print the values
        System.out.println("ID : " + e.getId());
        System.out.println("NAME : " + e.getName());
        System.out.println("CITY : " + e.getCity());
        System.out.println("PERCENTAGE : " + e.getPercentage());
    
*/

    }
}