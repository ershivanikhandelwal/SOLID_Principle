package Single_Responsibility_principle;

public class Runner {
    //Defination- SRP:- A class/ unit should have only one responsibility.
    // In other words a class should have only one reason to change.

    //Defination- OCP:- A class should open for extension and close for modification
    public static void main(String[] args) {
        ParrotBird parrot= new ParrotBird("Parrot A", BirdColor.Green, 2.0,new StrongBeak(), BirdSize.Medium);
        parrot.fly();

        //penguin can not fly. class penguin not forced to implement fly method
        Bird pen= new Penguin("Penguin A", BirdColor.Green, 2.0,new WeakBeak(), BirdSize.Medium);
        pen.eat();
    }

}
