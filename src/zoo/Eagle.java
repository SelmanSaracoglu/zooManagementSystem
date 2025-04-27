package zoo;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name){
        super(name);
    }

    @Override
     void makeSound(){
        System.out.println(name + " screeches!");
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying high in the sky!");
    }
}
