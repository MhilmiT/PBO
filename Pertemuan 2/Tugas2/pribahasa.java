import java.util.Scanner;

public class pribahasa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pepatah = "'Kalau dilakukan dengan sepenuh hati maka besi batangan pun" +
                " kalau digosok terus menerus akan menjadi jarum'";
        String jawab ;

        System.out.println("Kalimat yang tersedia :");
        System.out.println("" + pepatah);
        System.out.println("");
        System.out.println("Mau mencari kata / frase, tuan?");
        System.out.println("");

        while(true){
            System.out.println("Masukkan kata / frase yang Anda cari! : ");
            jawab = sc.nextLine();

            if(pepatah.contains(jawab)){
                System.out.println("Selamat, kata tersebut ada di dalam pencarian Anda");
                break ;
            }else{
                System.out.println("kala    ");
                System.out.println("Kata / frase yang Anda cari tidak ada");
                System.out.println("Silahkan input ulang");
                System.out.println("");
            }
        }

    }
}
