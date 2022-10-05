public class LatSubString {

    public static void main(String[] args) {

        String nim = "2021071030";
        String namaprodi = "";
        String kodeProdi =  nim.substring(4,7);
        String angkatan =  nim.substring(0,4);


        System.out.println("angkatan= " + angkatan);
        System.out.println("kode prodi= " + kodeProdi);

        if(kodeProdi.equals("071")) {
            namaprodi = "Informatika";
        }

        System.out.printf("Nim=  " + nim);
        System.out.printf("Prodi " + namaprodi);

        }
    }

