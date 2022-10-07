package quiz;
import java.util.Scanner;

public class soalNo4 {

       final private double nilaiAkhir;
        private String huruf;
        public soalNo4(){ // membuat class construction
            Scanner leng = new Scanner(System.in);
            System.out.print("Masukkan total nilai = ");
            nilaiAkhir = leng.nextDouble(); // input total nilai
            System.out.println("Hasil:");
            if (nilaiAkhir >= 0 && nilaiAkhir <= 39.99){
                huruf = "E";
            }
            else if (nilaiAkhir >= 40 && nilaiAkhir <= 49.99){
                huruf = "D";
            }
            else if (nilaiAkhir >= 50 && nilaiAkhir <= 54.99){
                huruf = "C-";
            }
            else if (nilaiAkhir >= 55 && nilaiAkhir <= 59.99){
                huruf = "C";
            }
            else if (nilaiAkhir >= 60 && nilaiAkhir <= 64.99){
                huruf = "C+";
            }
            else if (nilaiAkhir >= 65 && nilaiAkhir <= 69.99){
                huruf = "B-";
            }
            else if (nilaiAkhir >= 70 && nilaiAkhir <= 74.99){
                huruf = "B";
            }
            else if (nilaiAkhir >= 75 && nilaiAkhir <= 79.99){
                huruf = "B+";
            }
            else if (nilaiAkhir >= 80 && nilaiAkhir <= 89.99){
                huruf = "A-";
            }
            else if (nilaiAkhir >= 90 && nilaiAkhir <= 99.99){
                huruf = "A";
            }
        }

        public static void main(String[] args) {
            soalNo4 hasil = new soalNo4();
            System.out.println(" \nNilai angka = " + hasil.nilaiAkhir);
            System.out.println("Grade       = " + hasil.huruf);
        }
    }

