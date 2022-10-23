package pegawai;

import java.util.Scanner;

public class gaji {

    private double Gapok; //definisikan variabel yang dibutuhkan
    private double Tunjangan;
    private int gol;

    double hours;

    public gaji(int gol){ //Buat kondisi saat memilih golongan
        this.gol = gol;
        if (gol == 1){
            this.Gapok = 1486500;
            this.Tunjangan = 250000;
        }
        else if(gol == 2){
            this.Gapok = 1926000;
            this.Tunjangan = 30000;
        }
        else if (gol == 3){
            this.Gapok = 2456700;
            this.Tunjangan = 350000;
        }
        else if (gol == 4){
            this.Gapok = 2899500;
            this.Tunjangan = 400000;
        }
    }

    public double Gaji_Lembur(double jam) { //Buat perhitungan untuk menghitung gaji lembur yang didapat
        double Lama_kerja = jam;
        double gaji_lembur;
        gaji_lembur = Lama_kerja - 173;
        double total_lembur;
        total_lembur = gaji_lembur * 20000;
        return total_lembur;
    }

    public double Gapok(){ //mengembalikan nilai gaji pokok ke gaji pokok itu sendiri
        return this.Gapok;
    }

    public double Tunjangan(){ //mengembalikan nilai tunjangan ke tunjangan itu sendiri
        return this.Tunjangan;
    }

    public double gol(){ // mengembalikan nilai golongan ke golongan itu sendiri
        return this.gol;
    }

    // membuat tampilannya, gaji pokok, tunjangan, lembur, dan total gaji
    public void show(int jam){
        double total_gaji;
        System.out.println("");
        System.out.println("Gaji pokok Anda: "+ (Gapok - (Gapok * 0.005)));
        System.out.println("Tunjangan Anda: "+ (Tunjangan - (Tunjangan * 0.005)));
        System.out.println("Lembur Anda: " + Gaji_Lembur(jam));
        total_gaji = this.Gapok + this.Tunjangan + Gaji_Lembur(jam);
        total_gaji -= total_gaji * 0.005;
        System.out.println("Total gaji Anda : Rp. "+total_gaji);
    }


}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner leng = new Scanner((System.in)); //membuat scanner untuk menginput nilai

        //Buat tampilan awal program

        System.out.println("===================================================");
        System.out.println("Selamat Datang di Program Pencarian Besar Gaji");
        System.out.println("===================================================");

        System.out.println("");
        System.out.println("Normal Jam Kerja : 173 Jam");
        System.out.println("");

        System.out.println("====================");
        System.out.println("Jenis Golongan");
        System.out.println("Golongan I");
        System.out.println("Golongan 2");
        System.out.println("Golongan 3");
        System.out.println("Golongan 4");

        System.out.println("===================="); //tampilan program untuk menginput nilai
        System.out.println("Masukkan Golongan Anda: ");
        int golongan = leng.nextInt();
        System.out.println("Masukkan Jumlah Jam Kerja Anda: ");
        int jumlah = leng.nextInt();

        gaji tipe =new gaji(golongan);
        tipe.show(jumlah);

    }


    }


