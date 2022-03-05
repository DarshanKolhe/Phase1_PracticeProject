package assisted_project_no19_program;

class Polymorphism
{
    public int Polymorphism(int x, int y) 
    { 
        return (x + y); 
    } 
    public int Polymorphism(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double Polymorphism(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Polymorphism s = new Polymorphism(); 
        System.out.println(s.Polymorphism(10, 20)); 
        System.out.println(s.Polymorphism(10, 20, 30)); 
        System.out.println(s.Polymorphism(10.5, 20.5)); 
    } 
}

