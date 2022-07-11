
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    

    public static void main(String[] args) {
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        ekran.setResizable(false); //pencere boyutu ayarlanamaz
        ekran.setFocusable(false); //bütün işlemlerimizi panel'de yapmak istediğimizden dolayı panel'e focuslandırcaz
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Sırası önemli
        Oyun oyun = new Oyun(); //jPanel'imiz
        oyun.requestFocus();//panel'imizin klavye işlemleri anlaması için izin verdiriyoruz
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);//odağımız panel
        oyun.setFocusTraversalKeysEnabled(false);//klavye işlemlerini gerçekleştirebilmek için
        
        ekran.add(oyun);//jpanel'imizi jframe 'e ekledik
        ekran.setVisible(true);
    }
}
