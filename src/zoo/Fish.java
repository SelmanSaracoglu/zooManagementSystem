package zoo;

public class Fish extends Animal{

    public Fish(String name){
        super(name);
    }

    @Override
    void makeSound(){

        System.out.println(name + " says: Gluck gluck!");

    }
}
