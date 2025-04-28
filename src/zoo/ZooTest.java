package zoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class ZooTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println("Yeni bir hayvan eklemek istiyor musunuz? (evet/hayır)");
        String cevap = scanner.nextLine();


        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Hayvan türü girin: ");
            String tur = scanner.nextLine();

            System.out.println("Hayvan ismi girin: ");
            String isim = scanner.nextLine();



            Animal yeniHayvan = null;

            if (tur.equalsIgnoreCase("Dog")){
                yeniHayvan = new Dog(isim);
            } else if (tur.equalsIgnoreCase("Eagle")) {
                yeniHayvan = new Eagle(isim);
            } else if (tur.equalsIgnoreCase("Fish")) {
                yeniHayvan = new Fish(isim);
            } else {
                System.out.println("Bilinmeyen tür. Hayvan eklenemedi.");
            }

            if (yeniHayvan != null){
                animals.add(yeniHayvan);
                System.out.println("Yeni bir hayvan eklendi: Tür = " + tur + ", İsim = " + isim);
                }

        } else {
            System.out.println("Program sonlandı.");
        }
        scanner.close();

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            System.out.println("------------");
        }

    }
}
