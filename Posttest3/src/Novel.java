class Novel {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;

    // Konstruktor untuk kelas Novel
    public Novel(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Getter untuk judul novel
    public String getJudul() {
        return judul;
    }

    // Setter untuk judul novel
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter untuk penulis novel
    public String getPenulis() {
        return penulis;
    }

    // Setter untuk penulis novel
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Getter untuk tahun terbit novel
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter untuk tahun terbit novel
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    // Getter untuk harga novel
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga novel
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk mendapatkan informasi novel
    public String getInfo() {
        // Format harga ke dalam format mata uang Rupiah
        String formattedHarga = String.format("Rp%,.2f", harga);

        return "Judul: " + judul + "\nPenulis: " + penulis + "\nTahun Terbit: " + tahunTerbit + "\nHarga: " + formattedHarga;
    }
}

class Fiksi extends Novel {
    private String jenis;

    public Fiksi(String judul, String penulis, int tahunTerbit, double harga, String jenis) {
        super(judul, penulis, tahunTerbit, harga);
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nJenis: " + jenis;
    }
}


class NonFiksi extends Novel {
    private String subjek;

    public NonFiksi(String judul, String penulis, int tahunTerbit, double harga, String subjek) {
        super(judul, penulis, tahunTerbit, harga);
        this.subjek = subjek;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSubjek: " + subjek + "\nJenis: Non-Fiksi";
    }
}
