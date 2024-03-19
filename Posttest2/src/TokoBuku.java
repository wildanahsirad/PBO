import java.util.ArrayList;

class TokoBuku {
    ArrayList<Novel> daftarNovel = new ArrayList<>();

    // Menambahkan data novel
    public void tambahNovel(String judul, String penulis, int tahunTerbit, double harga) {
        Novel novelBaru = new Novel(judul, penulis, tahunTerbit, harga);
        daftarNovel.add(novelBaru);
        System.out.println("Novel berhasil ditambahkan!");
    }

    // Menampilkan data novel
    void tampilkanDaftarNovel() {   
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

   // Metode untuk mengubah judul novel berdasarkan nomor urut
    // void ubahJudulNovel(int nomorUrut, String judulBaru) {
    //     if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
    //         Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
    //         novelYangDiubah.judul = judulBaru;
    //         System.out.println("Judul novel berhasil diubah!");
    //     } else {
    //         System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
    //     }
    // }
    protected void ubahJudulNovel(int nomorUrut, String judulBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setJudul(judulBaru);
            System.out.println("Judul novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    // Metode untuk mengubah pengarang novel berdasarkan nomor urut
    // void ubahPengarangNovel(int nomorUrut, String pengarangBaru) {
    //     if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
    //         Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
    //         novelYangDiubah.penulis = pengarangBaru;
    //         System.out.println("Pengarang novel berhasil diubah!");
    //     } else {
    //         System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
    //     }
    // }
    protected void ubahPengarangNovel(int nomorUrut, String pengarangBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setPenulis(pengarangBaru);
            System.out.println("Pengarang novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    // Metode untuk mengubah tahun terbit novel berdasarkan nomor urut
    // void ubahTahunTerbitNovel(int nomorUrut, int tahunTerbitBaru) {
    //     if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
    //         Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
    //         novelYangDiubah.tahunTerbit = tahunTerbitBaru;
    //         System.out.println("Tahun terbit novel berhasil diubah!");
    //     } else {
    //         System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
    //     }
    // }
    protected void ubahTahunTerbitNovel(int nomorUrut, int tahunTerbitBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setTahunTerbit(tahunTerbitBaru);
            System.out.println("Tahun terbit novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    // Metode untuk mengubah harga novel berdasarkan nomor urut
    // void ubahHargaNovel(int nomorUrut, double hargaBaru) {
    //     if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
    //         Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
    //         novelYangDiubah.harga = hargaBaru;
    //         System.out.println("Harga novel berhasil diubah!");
    //     } else {
    //         System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
    //     }
    // }
    protected void ubahHargaNovel(int nomorUrut, double hargaBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setHarga(hargaBaru);
            System.out.println("Harga novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    // Metode untuk mengubah semua data novel berdasarkan nomor urut
    // void ubahSemuaDataNovel(int nomorUrut, String judulBaru, String pengarangBaru, int tahunPenerbitBaru, double hargaBaru) {
    //     if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
    //         Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
    //         novelYangDiubah.judul = judulBaru;
    //         novelYangDiubah.penulis = pengarangBaru;
    //         novelYangDiubah.tahunTerbit = tahunPenerbitBaru;
    //         novelYangDiubah.harga = hargaBaru;
    //         System.out.println("Semua data novel berhasil diubah!");
    //     } else {
    //         System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
    //     }
    // }
    void ubahSemuaDataNovel(int nomorUrut, String judulBaru, String pengarangBaru, int tahunPenerbitBaru, double hargaBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setJudul(judulBaru);
            novelYangDiubah.setPenulis(pengarangBaru);
            novelYangDiubah.setTahunTerbit(tahunPenerbitBaru);
            novelYangDiubah.setHarga(hargaBaru);
            System.out.println("Semua data novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    // Menghapus data novel berdasarkan nomor urut
    void hapusNovel(int nomorUrut) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDihapus = daftarNovel.get(nomorUrut - 1);
            daftarNovel.remove(novelYangDihapus);
            System.out.println("Novel berhasil dihapus.");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.\n");
        }
    }

}

