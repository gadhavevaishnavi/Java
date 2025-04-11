/*
** ENCAPSULATION **
(HIDE DATA WITHOUT DISTURB)
-Send data from one end to another

-also known as 
1-data binding process
2-data hiding process
3-100 % concrete class
4-wrapping of class
5-model class (Because ,it transfer data from 1 end to another end ) 


*/
class Encapsule 
{
    // Declare all variables as private to hide data
    private int id;  
    private String name;
    private String city;
    private double percentage;

    // Setter methods to set/initialize private elements
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
    public void setPercentage(double percentage) { this.percentage = percentage; }
   
    // Getter methods to get private data
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public double getPercentage() { return percentage; }
}