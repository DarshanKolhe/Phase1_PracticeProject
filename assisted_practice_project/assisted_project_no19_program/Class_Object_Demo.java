package assisted_project_no19_program;

public class Class_Object_Demo 
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public Class_Object_Demo(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
        Class_Object_Demo scott = new Class_Object_Demo("Scott","papillon", 5, "black"); 
        System.out.println(scott.toString()); 
    } 
}

