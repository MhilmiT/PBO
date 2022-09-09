import java.util.Scanner;

public class grade {

    public static void main(String[] args) {

        String nim, nama, angkatan = null, prodi = null;
        double uas,uts,nilai_tugas,pres,akhir ;
        char nilaiIndeks;


        Scanner myInput = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Input Data");
        System.out.println("-------------------------------------------------");

        System.out.print("NIM: ");
        nim= myInput.nextLine();

        System.out.print("Nama: ");
        nama= myInput.nextLine();

        System.out.println(" ");
        System.out.println("Masukan Nilai Mata Kuliah Pemrograman Berorientasi Objek");


        System.out.print("Nilai Presensi: ");
        pres= myInput.nextDouble();

        System.out.print("Nilai Tugas: ");
        nilai_tugas= myInput.nextDouble();

        System.out.print("Nilai UTS: ");
        uts= myInput.nextDouble();

        System.out.print("Nilai UAS: ");
        uas= myInput.nextDouble();

        System.out.println(" ");

        System.out.println("-------------------------------------------------");
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Object");
        System.out.println("-------------------------------------------------");

        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);

        if(nim.substring(4, 7).equals("071")){
            prodi = "Informatika";
        } else{
            prodi =   "Tidak Tersedia";
        }

        System.out.println("Jurusan: " +  prodi);

        if(nim.substring(0,4).equals("2021")){
            angkatan = "2021";
        } else {
            angkatan = " Tidak Tersedia";
        }

        System.out.println("Angkatan: " + angkatan);

        akhir =(0.1 * pres) + (0.2 * nilai_tugas) + (0.3 * uts) + (0.4 * uas) ;

        if(akhir >= 80 && akhir <= 100){
            nilaiIndeks = 'A';
        }
        else if (akhir > 70 && akhir <79){
            nilaiIndeks = 'B';
        }
        else if (akhir > 60 && akhir <69){
            nilaiIndeks = 'C';
        }
        else if ( akhir >50 && akhir <59){
            nilaiIndeks = 'D';
        }
        else   {
            nilaiIndeks = 'E';
        }


        System.out.println(" " );

        System.out.println("Nilai Presensi: " + pres);
        System.out.println("Nilai Tugas: " + nilai_tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("Nilai Akhir: " + akhir);
        System.out.println("Nilai Indeks: " + nilaiIndeks );
        System.out.println(" " );


    }
}
