package zoo;

import java.util.ArrayList;

public class ZooTest {
    public static void main(String[] args) {
        // Hayvan nesneleri oluştur
        Dog dog = new Dog("Buddy");
        Fish fish = new Fish("Nemo");
        Eagle eagle = new Eagle("Freedom");

        // Hayvanları bir listeye ekle
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(fish);
        animals.add(eagle);

        for (Animal animal : animals){
            animal.eat();
            animal.makeSound();
            if (animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
            System.out.println("------------");
        }

    }
}
