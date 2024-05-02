import java.util.ArrayList;

final class TokoBuku { // Menerapkan keyword 'final' di class
    ArrayList<Novel> daftarNovel = new ArrayList<>();

    public void tambahNovel(Novel novel) {
        daftarNovel.add(novel);
        System.out.println("Novel berhasil ditambahkan!");
    }

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

    void ubahJudulNovel(int nomorUrut, String judulBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setJudul(judulBaru);
            System.out.println("Judul novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    void ubahPengarangNovel(int nomorUrut, String pengarangBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setPenulis(pengarangBaru);
            System.out.println("Pengarang novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    void ubahTahunTerbitNovel(int nomorUrut, int tahunTerbitBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setTahunTerbit(tahunTerbitBaru);
            System.out.println("Tahun terbit novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    void ubahHargaNovel(int nomorUrut, double hargaBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setHarga(hargaBaru);
            System.out.println("Harga novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    void ubahSemuaDataNovel(int nomorUrut, String judulBaru, String pengarangBaru, int tahunTerbitBaru, double hargaBaru) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            Novel novelYangDiubah = daftarNovel.get(nomorUrut - 1);
            novelYangDiubah.setJudul(judulBaru);
            novelYangDiubah.setPenulis(pengarangBaru);
            novelYangDiubah.setTahunTerbit(tahunTerbitBaru);
            novelYangDiubah.setHarga(hargaBaru);
            System.out.println("Semua data novel berhasil diubah!");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }

    void hapusNovel(int nomorUrut) {
        if (nomorUrut >= 1 && nomorUrut <= daftarNovel.size()) {
            daftarNovel.remove(nomorUrut - 1);
            System.out.println("Novel berhasil dihapus.");
        } else {
            System.out.println("Nomor urut tidak valid. Silakan pilih nomor urut yang benar.");
        }
    }
}
