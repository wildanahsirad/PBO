abstract class Novel {
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

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // metode abstract untuk mendapatkan informasi novel
    public abstract String getInfo();
}

class Fiksi extends Novel {
    private final String jenis; // menerapkan  keyword 'final'

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
