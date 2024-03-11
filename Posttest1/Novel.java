package Posttest1;

class Novel {
    String judul;
    String penulis;
    int tahunTerbit;
    double harga;

    // Konstruktor untuk kelas Novel
    public Novel(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Metode untuk mendapatkan informasi novel
    public String getInfo() {
        // Format harga ke dalam format mata uang Rupiah
        String formattedHarga = String.format("Rp%,.2f", harga);

        return "Judul: " + judul + "\nPenulis: " + penulis + "\nTahun Terbit: " + tahunTerbit + "\nHarga: " + formattedHarga;
    }
}