package animal;

public class Animal {
    private String name;

    public void eat(){
        System.out.println(getName() + " is eating.");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }
}
