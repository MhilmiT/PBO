import java.util.Scanner;

public class latihanWhile {
    public static void main(String[] args) {

        String jwb="y";
        Scanner sc = new Scanner(System.in);

        while(jwb.equals("y")){
            System.out.println("halo selamat datang");
            System.out.print("apakah anda ingin mengulang [y/t]: ");
            jwb= sc.nextLine();
        }
        System.out.println("Terima Kasih Sudah menggunakan program ini");
    }
}
