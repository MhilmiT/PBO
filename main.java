//file ini berada di dalam package tutorial
package tutorial;

//import libary yang dibutuhkan
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
        public static void main(String[] args) throws IOException {

            Scanner leng = new Scanner(System.in); //input scanner yang digunakan untuk menginput data
            String pilih; //membuat variabel pilihanUser untuk menyimpan nilai input user
            boolean Lanjut = true; //Membuat variabel isLanjutkan untuk menentukan terus berjalan atau tidak

            // buat perulangan  dengan variabel isLanjutkan menjadi paramater, agar program terus mengulang jika
            //bernilai true
            while (Lanjut) {
                clearScreen(); // input clearScreen untuk membersihkan tampilan sebelumnya
                //Membuat tampilan menu utama
                System.out.println("Database Perpustakaan\n");
                System.out.println("1.\tLihat seluruh buku");
                System.out.println("2.\tCari data buku");
                System.out.println("3.\tTambah data buku");
                System.out.println("4.\tUbah data buku");
                System.out.println("5.\tHapus data buku");

                System.out.print("\n\nPilihan anda: ");
                pilih = leng.next();

                //membuat switch case agar user bisa memilih case mana yang diinginkan

                switch (pilih) {
                    case "1":
                        System.out.println("\n=================");
                        System.out.println("LIST SELURUH BUKU");
                        System.out.println("=================");
                        tampilkanData();
                        break;
                    case "2":
                        System.out.println("\n=========");
                        System.out.println("CARI BUKU");
                        System.out.println("=========");
                        // cari data
                        break;
                    case "3":
                        System.out.println("\n================");
                        System.out.println("TAMBAH DATA BUKU");
                        System.out.println("================");
                        // tambah data
                        break;
                    case "4":
                        System.out.println("\n==============");
                        System.out.println("UBAH DATA BUKU");
                        System.out.println("==============");
                        // ubah data
                        break;
                    case "5":
                        System.out.println("\n===============");
                        System.out.println("HAPUS DATA BUKU");
                        System.out.println("===============");
                        // hapus data
                        break;
                    default:
                        System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
                }

                Lanjut = getYesorNo("Apakah Anda ingin melanjutkan");
            }
        }

        //methode ini bisa mengeluarkan IOexception jika tidak menemukan database
        private static void tampilkanData() throws IOException{

            FileReader fileInput;
            BufferedReader bufferInput;

            //membuat try and catch untuk bisa menemukan data yang tidak ditemukan
            try {
                fileInput = new FileReader("C:\\Users\\hilmi\\IdeaProjects\\Belajar.JAVA\\src\\tutorial\\DataBase.txt");
                bufferInput = new BufferedReader(fileInput);
            } catch (Exception e){
                System.err.println("Database Tidak ditemukan");
                //jika data tidak ditemukan maka akan mengeluarkan peringatan seperti ini
                System.err.println("Silahkan tambah data terlebih dahoeloe");
                return;
            }

            // membuat tampilan output, tampilan akan keluar setelah user memilih case
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
            System.out.println("----------------------------------------------------------------------------------------------------------");

            //membuat variabel data dengan bufferinput untuk menampilkan data
            String data = bufferInput.readLine();
            int nomorData = 0;
            //membuat perulangan agar tidak melakukan penulisan kode yang sama
            while(data != null) {
                nomorData++;

                // // stringtokenizer untuk mengambil bagian dari satu baris per koma
                StringTokenizer stringToken = new StringTokenizer(data, ",");

                //memanggil data dari data base untuk ditampilkan pada layar
                stringToken.nextToken();
                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t%4s  ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%-20s   ", stringToken.nextToken());
                System.out.printf("|\t%s   ", stringToken.nextToken());
                System.out.print("\n");

                //berfungsi untuk menampilkan data selanjutnya
                data = bufferInput.readLine();
            }

            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

        //membuat fungsi getYesorNO untuk mengulang tampilan ketika user memilih y / yes
        private static boolean getYesorNo(String message){
            Scanner terminalInput = new Scanner(System.in);
            System.out.print("\n"+message+" (y/n)? ");
            String pilihanUser = terminalInput.next();

            //berfungsi ketika piliahannya salah, bukan y atau n

            while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
                System.err.println("Pilihan anda bukan y atau n");
                System.out.print("\n"+message+" (y/n)? ");
                pilihanUser = terminalInput.next();
            }

            //return supaya dapat dipanggil dalam fungsi main
            return pilihanUser.equalsIgnoreCase("y");

        }

        //membuat fungsi membersihkan tampilan sebelumnya dengan try and catch
        private static void clearScreen(){
            try {
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033\143");
                }
            } catch (Exception ex){
                System.err.println("tidak bisa clear screen");
            }
        }
    }





