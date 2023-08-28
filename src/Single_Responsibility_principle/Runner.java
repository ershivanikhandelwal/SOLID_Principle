package Single_Responsibility_principle;

public class Runner {
    //Defination- SRP:- A class/ unit should have only one responsibility.
    // In other words a class should have only one reason to change.

    //Defination- OCP:- A class should open for extension and close for modification
    public static void main(String[] args) {
        Bird parrot= new ParrotBird("Parrot A", BirdColor.Green, 2.0,BirdBeak.ShortBeak, BirdSize.Medium);
        parrot.fly();
    }

}
