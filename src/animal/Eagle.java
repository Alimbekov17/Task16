package animal;

public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(getName() + " can fly really high.");
    }
}
