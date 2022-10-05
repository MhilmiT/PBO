package Pertemuan5;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class OOP {
    public static void main(String[] args) throws Exception{

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Hilmi";
        mahasiswa1.NIM = "2021071030";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Tileng";
        mahasiswa2.NIM = "2021071031";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.8;
        mahasiswa2.umur = 20;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }


}
