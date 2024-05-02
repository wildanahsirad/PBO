abstract class Novel implements InfoNovel {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private double harga;

    public Novel(String judul, String penulis, int tahunTerbit, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    // Method abstract dari interface
    @Override
    public String getJudul() {
        return judul;
    }

    @Override
    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Override
    public String getPenulis() {
        return penulis;
    }

    @Override
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    @Override
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }
}

// Interface yang mengatur operasi dasar novel
interface InfoNovel {
    String getJudul();
    void setJudul(String judul);
    String getPenulis();
    void setPenulis(String penulis);
    int getTahunTerbit();
    void setTahunTerbit(int tahunTerbit);
    double getHarga();
    void setHarga(double harga);
    String getInfo(); // Metode untuk mendapatkan informasi mengenai novel
}

class Fiksi extends Novel {
    private final String jenis;

    public Fiksi(String judul, String penulis, int tahunTerbit, double harga, String jenis) {
        super(judul, penulis, tahunTerbit, harga);
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return "Judul: " + getJudul() + "\nPenulis: " + getPenulis() + "\nTahun Terbit: " + getTahunTerbit() +
               "\nHarga: Rp" + String.format("%,.2f", getHarga()) + "\nJenis: Fiksi (" + jenis + ")";
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
        return "Judul: " + getJudul() + "\nPenulis: " + getPenulis() + "\nTahun Terbit: " + getTahunTerbit() +
               "\nHarga: Rp" + String.format("%,.2f", getHarga()) + "\nSubjek: " + subjek + "\nJenis: Non-Fiksi";
    }
}
