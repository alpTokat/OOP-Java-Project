
package soru_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;


    class Object {
     abstract class hesapla{
        abstract int sonuc();
      }
     }
    class Alfa extends Object {
        public int deger1;
        public int deger2;
        
        public int sonuc(int deger1,int deger2){
        return deger1*deger2;
        }
        
        public void metineCevir(){
            try {
            File dosya = new File("Giris.txt");
            dosya.createNewFile();
            FileWriter writer = new FileWriter(dosya);
            Scanner input = new Scanner(System.in);
            System.out.print("Alfa adedini giriniz:");
            int alfa_Adet = input.nextInt();
            for (int i = 0; i < alfa_Adet; i++) {
                System.out.print((i+1)+"."+"Alfa'nın 1.değerini giriniz:");
                int value1 = input.nextInt();
                System.out.print((i+1)+"."+"Alfa'nın 2.değerini giriniz:");
                int value2 = input.nextInt();
                writer.write("A " + value1 + " " + value2 +"\n");
            }
            writer.close();
        } catch (IOException ex) {
        }
        
        }
    }
    class Beta extends Object {
        public int deger3;
        
         public int sonuc(int deger3){
         
         return 2*deger3*deger3;
        }
        public void metineCevir(){
            try {
            File dosya = new File("Giris.txt");
            FileWriter writer = new FileWriter(dosya,true);
            Scanner input = new Scanner(System.in);
            System.out.print("Beta Adedini giriniz:");
            int beta_Adet = input.nextInt();
            for (int i = 0; i < beta_Adet; i++) {
                System.out.print((i+1)+"."+"Beta'nın 1.değerini giriniz:");
                int value3 = input.nextInt();
                writer.write("B " + value3 +"\n");
            }
            writer.close();
        } catch (IOException ex) {
        }
        }
    }


