package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CartScannerExitExample {

        public static void main(String[] args) {
            Scanner urun = new Scanner(System.in);

            Map<String, Double> carttakiUrunler = new HashMap<>();

            while (true) {
                System.out.println("Lütfen bir ürün ismi giriniz (Çıkmak için 0 yazınız): ");
                String urunIsmi = urun.nextLine();

                if (urunIsmi.equals("0")) {
                    System.out.println("Ürün ekleme işlemi sonlandırıldı.");
                    break;
                }

                System.out.println("Lütfen ürünün fiyatını giriniz: ");
                double urunFiyati = urun.nextDouble();
                urun.nextLine(); // Satır boşluğunu temizle

                carttakiUrunler.put(urunIsmi, urunFiyati);
            }

            double toplamFiyat = 0;
            String enPahaliUrun = "";
            double enYuksekFiyat = 0;

            for (Map.Entry<String, Double> entry : carttakiUrunler.entrySet()) {
                toplamFiyat += entry.getValue();

                if (entry.getValue() > enYuksekFiyat) {
                    enYuksekFiyat = entry.getValue();
                    enPahaliUrun = entry.getKey();
                }
            }

            System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");
            if (!enPahaliUrun.equals("")) {
                System.out.println("En Pahalı Ürün: " + enPahaliUrun + " - " + enYuksekFiyat + " TL");
            } else {
                System.out.println("Sepetiniz boş.");
            }
        }

}
