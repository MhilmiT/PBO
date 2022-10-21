import java.util.Scanner;
public class inputData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka;

      while(true){

          System.out.println("Masukkan angka dari 1-10: ");
          angka = sc.nextInt();

          if(angka >=0 && angka <= 10){
              break;
          }else {
              System.out.println("angka anda tidak terdaftar");
              System.out.println("Silahkan input ulang");
              System.out.println("");
          }

      }


    }
}
