import java.util.ArrayList;

/**
 * Kelas TokoBuku menggunakan keyword 'final' sehingga kelas ini tidak bisa diwariskan.
 * Kelas ini menyimpan daftar semua novel dan menyediakan metode untuk mengelola novel tersebut.
 */
final class TokoBuku {
    // Variabel daftarNovel sebagai ArrayList yang statis, sehingga bisa diakses dari kelas lain tanpa instansiasi
    static ArrayList<Novel> daftarNovel = new ArrayList<>();

    /**
     * Method statis untuk menambahkan novel ke dalam daftar.
     * @param novel objek Novel yang akan ditambahkan ke dalam daftar.
     */
    public static void tambahNovel(Novel novel) {
        daftarNovel.add(novel);
        System.out.println("Novel berhasil ditambahkan!");
    }

    /**
     * Method statis untuk menampilkan semua novel yang ada di daftar.
     * Menampilkan detail novel menggunakan method getInfo() dari setiap objek Novel.
     */
    static void tampilkanDaftarNovel() {
        if (daftarNovel.isEmpty()) {
            System.out.println("Tidak ada novel dalam sistem.");
        } else {
            int i = 1;
            System.out.println("\nDaftar Novel di Toko Buku Lupi:");
            System.out.println("------------------------------");
            for (Novel novel : daftarNovel) {
                System.out.println("Data ke-" + i);
                System.out.println(novel.getInfo());
                System.out.println("------------------------------");
                i++;
            }
        }
    }

    /**
     * Method statis untuk mengubah judul novel berdasarkan nomor urut dalam daftar.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     * @param judulBaru judul baru untuk novel tersebut.
     */
    static void ubahJudulNovel(int nomorUrut, String judulBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setJudul(judulBaru);
            System.out.println("Judul novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    /**
     * Method statis untuk mengubah pengarang novel berdasarkan nomor urut dalam daftar.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     * @param pengarangBaru pengarang baru untuk novel tersebut.
     */
    static void ubahPengarangNovel(int nomorUrut, String pengarangBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setPenulis(pengarangBaru);
            System.out.println("Pengarang novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    /**
     * Method statis untuk mengubah tahun terbit novel berdasarkan nomor urut dalam daftar.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     * @param tahunTerbitBaru tahun terbit baru untuk novel tersebut.
     */
    static void ubahTahunTerbitNovel(int nomorUrut, int tahunTerbitBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setTahunTerbit(tahunTerbitBaru);
            System.out.println("Tahun terbit novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    /**
     * Method statis untuk mengubah harga novel berdasarkan nomor urut dalam daftar.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     * @param hargaBaru harga baru untuk novel tersebut.
     */
    static void ubahHargaNovel(int nomorUrut, double hargaBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setHarga(hargaBaru);
            System.out.println("Harga novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    /**
     * Method statis untuk mengubah semua data novel berdasarkan nomor urut dalam daftar,
     * termasuk jenis dan detail jenis.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     * @param judulBaru judul baru untuk novel.
     * @param pengarangBaru pengarang baru untuk novel.
     * @param tahunTerbitBaru tahun terbit baru untuk novel.
     * @param hargaBaru harga baru untuk novel.
     * @param jenisBaru jenis baru untuk novel.
     * @param detailBaru detail baru sesuai dengan jenis.
     */
    static void ubahSemuaDataNovel(int nomorUrut, String judulBaru, String pengarangBaru, int tahunTerbitBaru, double hargaBaru, String jenisBaru, String detailBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            if (jenisBaru.equalsIgnoreCase("Fiksi")) {
                novelYangDiubah = new Fiksi(judulBaru, pengarangBaru, tahunTerbitBaru, hargaBaru, detailBaru);
            } else if (jenisBaru.equalsIgnoreCase("NonFiksi")) {
                novelYangDiubah = new NonFiksi(judulBaru, pengarangBaru, tahunTerbitBaru, hargaBaru, detailBaru);
            } else {
                System.out.println("Jenis novel tidak valid.");
                return;
            }
            // Update novel in list
            daftarNovel.set(nomorUrut - 1, novelYangDiubah);
            System.out.println("Semua data novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }


    /**
     * Method statis untuk menghapus novel berdasarkan nomor urut dalam daftar.
     * @param nomorUrut indeks novel dalam daftar (dimulai dari 1).
     */
    static void hapusNovel(int nomorUrut) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            daftarNovel.remove(nomorUrut - 1);
            System.out.println("Novel berhasil dihapus.");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    static void ubahJenisDanDetailNovel(int nomorUrut, Novel novelBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            daftarNovel.set(nomorUrut - 1, novelBaru);
            System.out.println("Jenis dan detail novel berhasil diubah.");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }
    
}
