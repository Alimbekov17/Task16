package animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal shark = new Shark("Shark");
        Animal turtle = new Turtle("Turtle");
        Animal eagle = new Eagle("Eagle");

        Animal[] animals = {shark, turtle, eagle};

        Shark[] sharks = new Shark[0];
        Turtle[] turtles = new Turtle[0];
        Eagle[] eagles = new Eagle[0];

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            if (animal.getClass().equals(Shark.class)) {
                ((Shark) animal).attack();

                sharks = new Shark[]{(Shark) animal};

            } else if (animal.getClass().equals(Turtle.class)) {
                ((Turtle) animal).swim();

                turtles = new Turtle[]{(Turtle) animal};
                
            } else if (animal.getClass().equals(Eagle.class)) {
                ((Eagle) animal).fly();

                eagles = new Eagle[]{(Eagle) animal};
            }
        }
    }
}
