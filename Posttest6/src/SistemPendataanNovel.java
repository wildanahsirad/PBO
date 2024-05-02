import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SistemPendataanNovel {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
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
                        tambahNovel(br);
                        break;
                    case 2:
                        TokoBuku.tampilkanDaftarNovel();
                        break;
                    case 3:
                        ubahDataNovel(br);
                        break;
                    case 4:
                        hapusDataNovel(br);
                        break;
                    case 5:
                        System.out.println("Terima kasih! Keluar dari program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih kembali.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, pastikan Anda memasukkan angka.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca input dari pengguna.");
            }
        }
    }

    private static void tambahNovel(BufferedReader br) throws IOException {
        System.out.print("Masukkan judul novel: ");
        String judul = br.readLine();
        System.out.print("Masukkan nama penulis: ");
        String penulis = br.readLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = Integer.parseInt(br.readLine());
        System.out.print("Masukkan harga novel: ");
        double harga = Double.parseDouble(br.readLine());
        System.out.print("Masukkan jenis novel (Fiksi/NonFiksi): ");
        String jenis = br.readLine();

        if (jenis.equalsIgnoreCase("Fiksi")) {
            System.out.print("Masukkan genre novel Fiksi: ");
            String subjenis = br.readLine();
            TokoBuku.tambahNovel(new Fiksi(judul, penulis, tahunTerbit, harga, subjenis));
        } else if (jenis.equalsIgnoreCase("NonFiksi")) {
            System.out.print("Masukkan subjek novel Non-Fiksi: ");
            String subjek = br.readLine();
            TokoBuku.tambahNovel(new NonFiksi(judul, penulis, tahunTerbit, harga, subjek));
        } else {
            System.out.println("Jenis novel tidak valid.");
        }
    }

    private static void ubahDataNovel(BufferedReader br) throws IOException {
        if (TokoBuku.daftarNovel.isEmpty()) {
            System.out.println("Tidak ada novel dalam sistem.");
            return;
        }
        TokoBuku.tampilkanDaftarNovel();
    
        System.out.print("Mau ubah data ke- : ");
        int nomorUrut = Integer.parseInt(br.readLine());
    
        if (nomorUrut >= 1 && nomorUrut <= TokoBuku.daftarNovel.size()) {
            // Deklarasi variabel di awal
            String judulBaru = "";
            String pengarangBaru = "";
            int tahunTerbitBaru = 0;
            double hargaBaru = 0.0;
            Novel novelBaru = null;
    
            System.out.println("\nPilih data yang ingin diubah:");
            System.out.println("1. Judul");
            System.out.println("2. Pengarang");
            System.out.println("3. Tahun Terbit");
            System.out.println("4. Harga");
            System.out.println("5. Jenis dan Detail Jenis");
            System.out.println("6. Semua Data");
            System.out.println("7. Kembali");
            System.out.print("Pilih menu: ");
            int pilihanUbah = Integer.parseInt(br.readLine());
    
            switch (pilihanUbah) {
                case 1:
                    System.out.print("Masukkan judul baru: ");
                    judulBaru = br.readLine();
                    TokoBuku.ubahJudulNovel(nomorUrut, judulBaru);
                    break;
                case 2:
                    System.out.print("Masukkan pengarang baru: ");
                    pengarangBaru = br.readLine();
                    TokoBuku.ubahPengarangNovel(nomorUrut, pengarangBaru);
                    break;
                case 3:
                    System.out.print("Masukkan tahun terbit baru: ");
                    tahunTerbitBaru = Integer.parseInt(br.readLine());
                    TokoBuku.ubahTahunTerbitNovel(nomorUrut, tahunTerbitBaru);
                    break;
                case 4:
                    System.out.print("Masukkan harga baru: ");
                    hargaBaru = Double.parseDouble(br.readLine());
                    TokoBuku.ubahHargaNovel(nomorUrut, hargaBaru);
                    break;
                case 5:
                    System.out.print("Masukkan jenis novel baru (Fiksi/NonFiksi): ");
                    String jenisBaru = br.readLine();
                    Novel novelLama = TokoBuku.daftarNovel.get(nomorUrut - 1);
                    if (jenisBaru.equalsIgnoreCase("Fiksi")) {
                        System.out.print("Masukkan genre novel Fiksi: ");
                        String subjenis = br.readLine();
                        novelBaru = new Fiksi(novelLama.getJudul(), novelLama.getPenulis(), novelLama.getTahunTerbit(), novelLama.getHarga(), subjenis);
                    } else if (jenisBaru.equalsIgnoreCase("NonFiksi")) {
                        System.out.print("Masukkan subjek novel Non-Fiksi: ");
                        String subjek = br.readLine();
                        novelBaru = new NonFiksi(novelLama.getJudul(), novelLama.getPenulis(), novelLama.getTahunTerbit(), novelLama.getHarga(), subjek);
                    }
                    if (novelBaru != null) {
                        TokoBuku.ubahJenisDanDetailNovel(nomorUrut, novelBaru);
                        // System.out.println("Jenis dan detail novel berhasil diubah.");
                    } else {
                        System.out.println("Jenis novel tidak valid.");
                    }
                    break;
                
                case 6:
                    System.out.print("Masukkan judul baru: ");
                    judulBaru = br.readLine();
                    System.out.print("Masukkan pengarang baru: ");
                    pengarangBaru = br.readLine();
                    System.out.print("Masukkan tahun terbit baru: ");
                    tahunTerbitBaru = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan harga baru: ");
                    hargaBaru = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan jenis novel baru (Fiksi/NonFiksi): ");
                    String jenisBaru2 = br.readLine();
                    String detailBaru = "";
                    if (jenisBaru2.equalsIgnoreCase("Fiksi")) {
                        System.out.print("Masukkan genre novel Fiksi: ");
                        detailBaru = br.readLine();
                    } else if (jenisBaru2.equalsIgnoreCase("NonFiksi")) {
                        System.out.print("Masukkan subjek novel Non-Fiksi: ");
                        detailBaru = br.readLine();
                    }
                    TokoBuku.ubahSemuaDataNovel(nomorUrut, judulBaru, pengarangBaru, tahunTerbitBaru, hargaBaru, jenisBaru2, detailBaru);
                    break;
                
                case 7:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.\n");
            }
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.\n");
        }
    }
    

    private static void hapusDataNovel(BufferedReader br) throws IOException {
        if (TokoBuku.daftarNovel.isEmpty()) {
            System.out.println("Tidak ada novel dalam sistem.");
            return;
        }
        TokoBuku.tampilkanDaftarNovel();
        System.out.print("Mau hapus data ke- : ");
        int nomorUrutHapus = Integer.parseInt(br.readLine());
        TokoBuku.hapusNovel(nomorUrutHapus);
    }
}
