
package kullanici_kismi;


public class Liderler {
    String kullanici_adi;
    int skor;

    public Liderler(String kullanici_adi, int skor) {
        this.kullanici_adi = kullanici_adi;
        this.skor = skor;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    
}
