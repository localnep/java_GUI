
public class Kitaplar {
    private int id;
    private String kitap_adi;
    private String kitap_yazari;
    private String kitap_turu;
    private String kitap_mevcut;

    public Kitaplar(int id, String kitap_adi, String kitap_yazari, String kitap_turu, String kitap_mevcut) {
        this.id = id;
        this.kitap_adi = kitap_adi;
        this.kitap_yazari = kitap_yazari;
        this.kitap_turu = kitap_turu;
        this.kitap_mevcut = kitap_mevcut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitap_adi() {
        return kitap_adi;
    }

    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    public String getKitap_yazari() {
        return kitap_yazari;
    }

    public void setKitap_yazari(String kitap_yazari) {
        this.kitap_yazari = kitap_yazari;
    }

    public String getKitap_turu() {
        return kitap_turu;
    }

    public void setKitap_turu(String kitap_turu) {
        this.kitap_turu = kitap_turu;
    }

    public String getKitap_mevcut() {
        return kitap_mevcut;
    }

    public void setKitap_mevcut(String kitap_mevcut) {
        this.kitap_mevcut = kitap_mevcut;
    }

    
    
    
    
}