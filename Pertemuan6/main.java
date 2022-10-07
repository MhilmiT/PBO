package TugasOOP;

import java.util.Scanner;

public class main {

    private static char Pilih;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Segitiga LuasSegitiga;
        Lingkaran LuasLingkaran;

        int sisi1, sisi2, r;

        LuasSegitiga = new Segitiga();
        LuasLingkaran = new Lingkaran();

        mainMenu();

        //kondisi
        switch(Pilih){
            case '1':
            {
                System.out.println("<---------------------------------------------------->");
                System.out.println("Masukkan alas segitiga: ");
                sisi1 = sc.nextInt();
                System.out.println("Masukan tinggi segitiga: ");
                sisi2=sc.nextInt();
                System.out.println("Luas segitiga : " +LuasSegitiga.luas(sisi1,sisi2));
                System.out.println("<---------------------------------------------------->");
                break;
            }

            case '2':
            {
                System.out.println("<---------------------------------------------------->");
                System.out.println("Masukan jari-jari lingkaran: ");
                r = sc.nextInt();
                System.out.println("Luas Lingkaran: " +LuasLingkaran.luas(r));
                System.out.println("<---------------------------------------------------->");
                break;
            }
            default:
            {
                System.out.println("Pilihan tidak ditemukan");
                break;
            }

        }

    }

    private static void mainMenu(){
        //pilihan menu

        System.out.println("<---------------------------------------------------->");
        System.out.println("Program Menentukan luas Segitiga dan Lingkaran");
        System.out.println("<---------------------------------------------------->");
        System.out.println("");
        System.out.println("Pilih bangun datar yang ingin dicari luasnya");
        System.out.println("1. Segitiga");
        System.out.println("2. Lingkaran");
        System.out.println("");
        System.out.println("Masukan Pilihan: ");

        Pilih = sc.next().charAt(0);




    }
}
