import java.util.Random;
import java.util.Scanner;

public class suitSantuy {

    public static void main(String[] args) {
        
                String[] pilih = {"J", "T", "K"};
                Scanner tl = new Scanner(System.in);
                Random check = new Random();
                String jawab, yes;

                System.out.println("Halo, Selamat Datang");
                System.out.println("Se");
                System.out.println("Sudah siap untuk kalah?");

                do {

                    int randomNumber = check.nextInt(pilih.length);
                    System.out.println("=======================================");
                    System.out.print("Masukan J / T / K : ");
                    jawab = tl.next();
                    jawab = jawab.toUpperCase();
                    System.out.println("Komputer mengeluarkan : " + pilih[randomNumber]);
                    if        (pilih[randomNumber].equals("J") && jawab.equals("T")) {
                        System.out.println("Oops, Kamu Kalah");
                    } else if (pilih[randomNumber].equals("T") && jawab.equals("K")) {
                        System.out.println("Oops, Kamu Kalah");
                    } else if (pilih[randomNumber].equals("K") && jawab.equals("J")) {
                        System.out.println("Oops, Kamu Kalah");
                    } else if (pilih[randomNumber].equals(jawab)) {
                        System.out.println("Haha, Kamu Seri");
                    } else if (pilih[randomNumber].equals("J") && jawab.equals("K")) {
                        System.out.println("Haha, Kamu Menang");
                    } else if (pilih[randomNumber].equals("T") && jawab.equals("J")) {
                        System.out.println("Yay, Kamu Menang");
                    } else if (pilih[randomNumber].equals("K") && jawab.equals("T")) {
                        System.out.println("Yay, Kamu Menang");
                    } else {
                        System.out.println("Kamu menginput apa sih? ");
                    }
                    System.out.print("Apakah kamu ingin bermain lagi [y/t] ? ");
                    yes = tl.next();
                    System.out.println(" ");
                } while (yes.equals("y") || yes.equals("Y"));
                System.out.println("Yahh masa kabur, cemenn");
            }
        }
    

