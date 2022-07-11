
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class GameFrame extends JFrame{

    public GameFrame() throws HeadlessException {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Play Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //? 2side pencere boyutu ile alakalı
        this.setVisible(true);
        this.setLocationRelativeTo(null); //ekran ortada çıkartır
    }
    
}
