
package soru_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Soru_1 {

    
    public static void main(String[] args) {
       Alfa myAlfa=new Alfa();
       myAlfa.metineCevir();
       Beta myBeta=new Beta();
       myBeta.metineCevir();
       int sayac1=0;
       int sayac2=0;
       int toplam1=0;
       int toplam2=0;
       try {
                char character = 'A';
                File dosya = new File("Giris.txt");
                String read = null;
                Scanner reader = new Scanner(dosya);
                while (reader.hasNext()) {
                    read = reader.next();
                    if (character == read.charAt(0)) {
                        System.out.print(read + " ");
                        read = reader.next();
                        System.out.print(read + " ");
                        myAlfa.deger1 = Integer.parseInt(read);
                        read = reader.next();
                        System.out.println(read + " ");
                        myAlfa.deger2 = Integer.parseInt(read);
                        int sonuc = myAlfa.sonuc(myAlfa.deger1, myAlfa.deger2);
                        System.out.println(sonuc);
                        toplam1+=sonuc;
                        sayac1 += +1;
                        
                    } else {
                        System.out.print(read + " ");
                        read = reader.next();
                        System.out.println(read + " ");
                        myBeta.deger3 = Integer.parseInt(read);
                        int sonuc2 = myBeta.sonuc(myBeta.deger3);
                        System.out.println(sonuc2);
                        toplam2+=sonuc2;
                        sayac2 += 1;
                    }
                }
                System.out.println("Oluşturulan Alfa Obje Sayısı: " + sayac1);
                System.out.println("Oluşturulan Beta Obje Sayısı: " + sayac2);
                System.out.println("Alfalar Toplamı: " + toplam1);
                System.out.println("Betalar Toplamı: " + toplam2);
                System.out.println("Alfalar ve Betaların Toplamı: " + (toplam1 + toplam2));
                reader.close();
       
            } catch (FileNotFoundException ex) {

            }
      
    }
    
}
