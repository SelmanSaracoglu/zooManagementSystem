package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Maps_ShoppingCartandPrice {

    public static void main(String[] args) {

        Map<String, Double> cart = new HashMap<>();

        cart.put("Elma", 1.25);
        cart.put("Banana", 3.75);
        cart.put("Strawbery", 1.50);
        cart.put("Cucumber", 0.90);
        cart.put("Tomato", 0.50);

        double toplamFiyat = 0;

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " fiyatı: " + entry.getValue());
            toplamFiyat += entry.getValue();
        }

        System.out.println("Toplam Fiyat: " + toplamFiyat);

        String enPahaliUrun = "";
        double maxFiyat = 0;

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            if (entry.getValue() > maxFiyat ){
                maxFiyat = entry.getValue();
                enPahaliUrun = entry.getKey();
            }
        }
        System.out.println("\nEn pahalı ürün: " + enPahaliUrun + " - Fiyatı: " + maxFiyat);

        toplamFiyat = 0;

        for (Double price : cart.values()){
            toplamFiyat += price;
        }
        double ortalamaFiyat = toplamFiyat / cart.size();
        System.out.println("\nÜrünlerin Ortalama Fiyatı: " + ortalamaFiyat + "\n");

        for (Map.Entry<String, Double> entry : cart.entrySet()){
            if (entry.getValue() > 1.00){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        Scanner urun = new Scanner(System.in);

        System.out.println("Lutfen Kac Urun Gireceğinizi Belirtin: ");
        int urunAdedi = urun.nextInt();
        urun.nextLine();

        Map<String, Double> carttakiUrunler = new HashMap<>();

        for (int i = 1; i <= urunAdedi   ; i++) {
            System.out.println("Lutfen bir urun giriniz: ");
            String urunIsmi = urun.nextLine();

            System.out.println("Lutfen urunun fiyatini giriniz: ");
            double urunFiyati = urun.nextDouble();
            urun.nextLine();

            carttakiUrunler.put(urunIsmi, urunFiyati);
        }

        double totalPrice = 0;
        String enPahaliProduct = "";
        double enYuksekFiyat = 0;
        for (Map.Entry<String, Double> entry : carttakiUrunler.entrySet()){
            toplamFiyat += entry.getValue(); // Her ürünün fiyatını topluyoruz
            if (entry.getValue() > enYuksekFiyat){
                enYuksekFiyat = entry.getValue();
                enPahaliProduct = entry.getKey();
            }
        }
        System.out.println("Toplam Fiyat: " + toplamFiyat);
        System.out.println("En Pahalı Ürün: " + enPahaliUrun + " - " + enYuksekFiyat + " TL");
    }
}
