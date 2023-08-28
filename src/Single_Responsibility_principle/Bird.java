package Single_Responsibility_principle;

public abstract class Bird {
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
    public abstract void fly();
    //common method for all birds
    public void eat()
    {
        System.out.println("I'm Hungry! Let's eat");
    }
    //common method for all birds
    public void sleep()
    {
        System.out.println("I am tired! Let me sleep");
    }
}
