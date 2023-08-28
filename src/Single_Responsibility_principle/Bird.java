package Single_Responsibility_principle;

public class Bird {
    private String name;
    private void setName(String name){
        this.name=name;
    }
    private BirdColor color;
    private void setColor(BirdColor color){
        this.color=color;
    }
    private Double weight;
    private void setWeight(Double weight){
        this.weight=weight;
    }
    private BirdType type;
    private void setType(BirdType type){
        this.type=type;
    }
    private BirdBeak beak;
    private void setBeak(BirdBeak beak){
        this.beak=beak;
    }
    private BirdSize size;
    private void setSize(BirdSize size){
        this.size=size;
    }
    public void fly()
    {
        if(this.type.equals(BirdType.EAGLE))
        {
            System.out.println("Eagle is flying");
        }
        else if(this.type.equals(BirdType.PARROT))
        {
            System.out.println("Parrot is flying");
        }
        else if(this.type.equals(BirdType.PEACOCK))
        {
            System.out.println("Peacock is flying");
        }
        else if(this.type.equals(BirdType.DOVE))
        {
            System.out.println("Dove is flying");
        }
    }
    public void eat()
    {
        System.out.println("I'm Hungry! Let's eat");
    }
    public void sleep()
    {
        System.out.println("I am tired! Let me sleep");
    }
}
