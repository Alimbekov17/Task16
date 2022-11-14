package animal;

public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    public void swim(){
        System.out.println(getName() + " swims in ocean.");
    }
}
