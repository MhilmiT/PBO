package quiz;
import java.util.Scanner;

public class soalNo2 {
        private int jam;
        private int menit;
        private int detik;
        private double harga;

        public soalNo2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jam = ");
            jam = sc.nextInt();
            System.out.print("Masukkan menit = ");
            menit = sc.nextInt();
            System.out.print("Masukkan detik = ");
            detik = sc.nextInt();
        }

        public final double harga() {
            return (3600 * jam + 60 * menit + detik) * 30;
        }

        public static void main(String[] args) {
            soalNo2 biaya_pulsa = new soalNo2();
            System.out.println("========================================================");
            System.out.println("Waktu awal percakapan = (" + biaya_pulsa.jam + ":" + biaya_pulsa.menit + ":" +
                    biaya_pulsa.detik + ")");
            System.out.println("Biaya yang dikenakan sebesar = Rp." + biaya_pulsa.harga());
        }
    }


