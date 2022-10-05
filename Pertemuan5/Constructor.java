package Pertemuan5;

class MMahasiswa{
    String nama;
    String NIM;
    String Jurusan;


    MMahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(Jurusan);
    }

}

public class Constructor {
    public static void main(String[] args) throws Exception {

    MMahasiswa mahasiswa1 = new MMahasiswa("Hilmi", "2021071030", "INF");
    MMahasiswa mahasiswa2 = new MMahasiswa("Tileng", "2021071031", "INF");



    }
}
