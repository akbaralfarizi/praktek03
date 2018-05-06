package praktek03;

public class Sepeda {
    private string merk;
    private string warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t: "+harga);
    }

    public string getMerk() {
        return merk;
    }

    public void setMerk(string merk) {
        this.merk = merk;
    }

    public string getWarna() {
        return warna;
    }

    public void setWarna(string warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}
