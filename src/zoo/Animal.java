package zoo;

public abstract class Animal {

    String name;

    Animal(String name){
        this.name= name;
    }

    void eat(){
        System.out.println(name + " is eating...");
    }

    abstract void makeSound();

}
