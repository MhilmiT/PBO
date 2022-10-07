package quiz;

import java.util.Scanner;

public class soalNo3 {
    //mendefinisikan nama variabel dengan menggunakan getter
    static double bayar_nulis
            (double nulis) {return (nulis/60) * 2000; }
    static double bayar_internet
            (double inet) {return (inet/60) * 4000; }

    static double bayar_game
            (double gaming) {return (gaming/60) * 5000; }
    static double bayar_printWarna
            (int cetakBewarna) {return (cetakBewarna)*500; }
    static double bayarprintabu
            (int cetakabu) {return cetakabu*300; }
    static double bayarjajan
            (int jajan) {return jajan*3000; }
    static double bayarscan
            (int scan) {return scan*1000; }
    static double totalbayar(int ngetik, int gaming, int inet, int cetakwarna, int cetakgray, int jajan, int scan) {
        return bayar_game(gaming) + bayar_internet(inet) + bayarjajan(jajan) + bayarscan(scan) + bayarprintabu(cetakgray)
                + bayar_nulis(ngetik) + bayar_printWarna(cetakwarna);
    }
    public static void main(String[] args) {
        Scanner leng = new Scanner(System.in);
        int ngetik;
        System.out.print(" Masukan Lamanya user Mengetik (menit) = ");
        ngetik = leng.nextInt();
        System.out.print(bayar_nulis(ngetik));
        System.out.println(" ");

        int inet;
        System.out.print("Masukan Lamanya User Menggunakan Internet (menit) = ");
        inet = leng.nextInt();
        System.out.print(bayar_internet(inet));
        System.out.println(" ");

        int gaming;
        System.out.print("Masukan Lama User Main Game-Online (menit) = ");
        gaming = leng.nextInt();
        System.out.print(bayar_game(gaming));
        System.out.println(" ");

        int cetakwarna;
        System.out.print("Masukan Banyaknya User menggunakan Cetak Berwarna = ");
        cetakwarna = leng.nextInt();
        System.out.print(bayar_printWarna(cetakwarna));
        System.out.println(" ");

        int cetakgray;
        System.out.print("Masukan Banyaknya User menggunakan Cetak Hitam-Putih = ");
        cetakgray = leng.nextInt();
        System.out.print(bayarprintabu(cetakgray));
        System.out.println(" ");

        int jajan;
        System.out.print("Masukkan Banyaknya Teh Botol Yang Dibeli User = ");
        jajan = leng.nextInt();
        System.out.print(bayarjajan(jajan));
        System.out.println(" ");

        int scan;
        System.out.print("Masukan Banyak File Yg Discan oleh User = ");
        scan = leng.nextInt();
        System.out.print(bayarscan(scan));
        System.out.println(" ");

        System.out.printf("Total yang harus di bayar Rp " + totalbayar(ngetik, gaming, inet, cetakwarna, cetakgray,
                jajan, scan));
    }
}

