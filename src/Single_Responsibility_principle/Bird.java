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
    private Beak beak;
    private BirdSize size;
    private void setSize(BirdSize size){
        this.size=size;
    }
    public Bird(String name, BirdColor color, Double weight,Beak beak, BirdSize size)
    {
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.beak=beak;
        this.size=size;
        this.beak.BeakInfo();
    }
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
