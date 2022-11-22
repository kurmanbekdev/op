import cat.Cat;
import dog.Dog;
import fish.Fish;
import parrot.Parrot;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("kosia");
        cat.setAge(2);
        cat.setColor("white");
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setName("reks");
        dog.setAge(3);
        dog.setColor("brow");
        System.out.println(dog);

        Fish fish = new Fish();
        fish.setName("balyk");
        fish.setAge(1);
        fish.setColor("black");
        System.out.println(fish);

        Parrot parrot = new Parrot();
        parrot.setName("fly");
        parrot.setAge(2);
        parrot.setColor("green");
        System.out.println(parrot);
    }
}