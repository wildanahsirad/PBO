package Posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SistemPendataanNovel {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        TokoBuku tokoBuku = new TokoBuku();

        while (true) {
            System.out.println("\n===== Sistem Pendataan Novel di Toko Buku Lupi =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Program");

            System.out.print("Pilih menu: ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul novel: ");
                    String judul = br.readLine();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = br.readLine();
                    System.out.print("Masukkan tahun terbit: ");
                    int tahunTerbit = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan harga novel: ");
                    double harga = Double.parseDouble(br.readLine());
                    tokoBuku.tambahNovel(judul, penulis, tahunTerbit, harga);
                    break;

                case 2:
                    tokoBuku.tampilkanDaftarNovel();
                    break;

                case 3:
                    if (tokoBuku.daftarNovel.isEmpty()) {
                        System.out.println("Tidak ada novel dalam sistem.");
                        break;
                    }
                    tokoBuku.tampilkanDaftarNovel();
                    
                    // Menerima input nomor urut novel yang ingin diubah
                    System.out.print("Mau ubah data ke- : ");
                    int nomorUrut = Integer.parseInt(br.readLine());
                
                    // Verifikasi nomor urut yang valid
                    if (nomorUrut >= 1 && nomorUrut <= tokoBuku.daftarNovel.size()) {
                
                        // Menampilkan menu pilihan untuk pengguna
                        System.out.println("\nPilih data yang ingin diubah:");
                        System.out.println("1. Judul");
                        System.out.println("2. Pengarang");
                        System.out.println("3. Tahun Terbit");
                        System.out.println("4. Harga");
                        System.out.println("5. Semua Data");
                        System.out.println("6. Kembali");
                        System.out.print("Pilih menu: ");
                        int pilihanUbah = Integer.parseInt(br.readLine());
                
                        switch (pilihanUbah) {
                            case 1:
                                System.out.print("Masukkan judul baru: ");
                                String judulBaru = br.readLine();
                                tokoBuku.ubahJudulNovel(nomorUrut, judulBaru);
                                break;
                
                            case 2:
                                System.out.print("Masukkan pengarang baru: ");
                                String pengarangBaru = br.readLine();
                                tokoBuku.ubahPengarangNovel(nomorUrut, pengarangBaru);
                                break;
                
                            case 3:
                                System.out.print("Masukkan tahun terbit baru: ");
                                int tahunTerbitBaru = Integer.parseInt(br.readLine());
                                tokoBuku.ubahTahunTerbitNovel(nomorUrut, tahunTerbitBaru);
                                break;
                
                            case 4:
                                System.out.print("Masukkan harga baru: ");
                                double hargaBaru = Double.parseDouble(br.readLine());
                                tokoBuku.ubahHargaNovel(nomorUrut, hargaBaru);
                                break;
                
                            case 5:
                                System.out.print("Masukkan judul baru: ");
                                String judulBaruSemua = br.readLine();
                                System.out.print("Masukkan pengarang baru: ");
                                String pengarangBaruSemua = br.readLine();
                                System.out.print("Masukkan tahun terbit baru: ");
                                int tahunTerbitBaruSemua = Integer.parseInt(br.readLine());
                                System.out.print("Masukkan harga baru: ");
                                double hargaBaruSemua = Double.parseDouble(br.readLine());
                                tokoBuku.ubahSemuaDataNovel(nomorUrut, judulBaruSemua, pengarangBaruSemua, tahunTerbitBaruSemua, hargaBaruSemua);
                                break;
                
                            case 6:
                                System.out.println("Kembali ke menu utama.");
                                break;
                
                            default:
                                System.out.println("Pilihan tidak valid. Silakan pilih kembali.\n");
                        }
                    } else {
                        System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.\n");
                    }
                    break;

                case 4:
                    if (tokoBuku.daftarNovel.isEmpty()) {
                        System.out.println("Tidak ada novel dalam sistem.");
                        break;
                    }
                    tokoBuku.tampilkanDaftarNovel();
                    // Menerima input nomor urut novel yang ingin dihapus
                    System.out.print("Mau hapus data ke- : ");
                    int nomorUrutHapus = Integer.parseInt(br.readLine());
                
                    // Hapus novel berdasarkan nomor urut
                    tokoBuku.hapusNovel(nomorUrutHapus);
                    break;
                
                case 5:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.\n");
            }
        }
    }
}