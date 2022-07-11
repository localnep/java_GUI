
package kullanici_kismi;


public class soru {
    
    static int dogruCevapSayisi=0;
    static int yanlisCevapSayisi=0;
    
    String soruMetni;
    String secenekA,secenekB,secenekC,secenekD;
    public enum Cevap {CEVAP_A,CEVAP_B,CEVAP_C,CEVAP_D}; //yeni bir type belirlemek istiyorsak
    //enum yerine strinde kullanabilirdik fakat string kullansaydık hem karşılaştırmak zorunda kalacaktık
    //hem de fazladan yer tutatacaktı
    Cevap dogruCevap;

    public soru(String soruMetni, String secenekA, String secenekB, String secenekC, String secenekD,Cevap dogruCevap) {
        this.soruMetni = soruMetni;
        this.secenekA = secenekA;
        this.secenekB = secenekB;
        this.secenekC = secenekC;
        this.secenekD = secenekD;
        this.dogruCevap = dogruCevap;
    }
    
    boolean cevapKontrol(Cevap cevap){
        if(dogruCevap == cevap){
            dogruCevapSayisi++;
        }
        else{
            yanlisCevapSayisi++;
        }
      return dogruCevap == cevap; //eşit ise true döner       
    }
    
    
    
}
