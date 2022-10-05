package Pertemuan5;

class MMMahasiswa{

    String nama;
    String NIM;

    MMMahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;

    }
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " . Salam kenal, nama saya adalah " + this.nama;
    }

}

public class Methode {
    public static void main(String[] args) throws Exception {
        MMMahasiswa mahasiswa1 = new MMMahasiswa("HILMI", "2021071030");
        mahasiswa1.show();
        mahasiswa1.setNama("Tileng");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Namanya bagus");
        System.out.println(data);

    }
}
