
public class gelecek_kitaplar {
    private int id;
    private String kitap_adi;
    private String kitap_yazari;

    public gelecek_kitaplar(int id, String kitap_adi, String kitap_yazari) {
        this.id = id;
        this.kitap_adi = kitap_adi;
        this.kitap_yazari = kitap_yazari;
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
    
    
}
