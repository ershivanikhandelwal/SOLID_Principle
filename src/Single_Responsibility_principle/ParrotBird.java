package Single_Responsibility_principle;

public class ParrotBird extends Bird implements Flyable{
    public ParrotBird(String name, BirdColor color, Double weight,Beak beak, BirdSize size)
    {
        super(name, color, weight,beak, size);
    }
    public void fly()
    {
        System.out.println("Parrot is flying");
    }
}
