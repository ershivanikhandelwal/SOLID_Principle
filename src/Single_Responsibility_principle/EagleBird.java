package Single_Responsibility_principle;

public class EagleBird extends Bird implements Flyable{
    public EagleBird(String name, BirdColor color, Double weight,BirdBeak beak, BirdSize size)
    {
        super(name, color, weight,beak, size);
    }
    public void fly()
    {
        System.out.println("Eagle is flying");
    }
}
