
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{
    private int x;
    private int y;
    private int atesdirY=1;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAtesdirY() {
        return atesdirY;
    }

    public void setAtesdirY(int atesdirY) {
        this.atesdirY = atesdirY;
    }
    
    
}

//action listener action performed'da ki timeri kullanabilmemiz için implement ediliyor
public class Oyun extends JPanel implements KeyListener,ActionListener{
    private int gecen_sure=0;
    private int harcanan_ates=0;
    private BufferedImage image;
    
    
    private ArrayList<Ates> atesler = new ArrayList<Ates>();
    //private Iterator<Ates> itr = atesler.iterator();
    //private ArrayList<Ates> atesler2 = Collections.synchronizedList(new ArrayList<Ates>());
    

    
    //hareket
    //private int atesDirY=1; //ateşler timer'da y kordinatına eklenecek hareket etmesi için
    
    private int topX=0; // topun sağa sola hareket etmesi için
    private int topDirX=2;
    
    private int topY=0; // topun sağa sola hareket etmesi için
    private int topDirY=15;
    
    
    private int UzayGemisiX=0;
    private int dirUzayX=20; //uzaygemisinin sağa sola hareket ettirmek için
    //private int ivme=5;
    
    private int mermi_sayac=0;
    
    Timer timer = new Timer(5,this);
    //Timer timer2 = new Timer(200, null);
    
    /*
    public boolean kontrolEt(){
        for(Ates ates : atesler){
            //çarpışma rectangle metodu ile kontrol
            if(new Rectangle(ates.getX(),ates.getY(),10,20).intersects(new Rectangle(topX,0,20,20))){
                return true;
            }
        }
        return false;
    }*/
    

    private int konumX=770;
    private int konumY=550;
    
    public void carpisma(){
        for(Ates ates : atesler){
            //çarpışma rectangle metodu ile kontrol
            if(new Rectangle(ates.getX(),ates.getY(),30,30).intersects(new Rectangle(topX,0,20,20))){
                //JOptionPane.showMessageDialog(this, "çarpişma");
                ates.setAtesdirY(-1);
            }
            
            
           
            
            if(new Rectangle(ates.getX(), ates.getY(), 30, 10).intersects(new Rectangle(UzayGemisiX, 490,image.getWidth()/10,image.getHeight()/10))){
                mermi_sayac++;
                ates.setX(konumX);
                ates.setY(konumY-=10);
                ates.setAtesdirY(0);
        } 
        }
    }
    
    
    

    public Oyun() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzay.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.black);
        
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        gecen_sure+=5;
        g.setColor(Color.red);
        g.fillOval(topX, topY, 32, 32); //top y ekseninde değişmeyecek
        g.drawImage(image, UzayGemisiX, 500,image.getWidth()/10,image.getHeight()/10,this);
        
        //atesler frame den çıkarsa silmesini sağlayacağız
        for(Ates ates: atesler){
            if(ates.getY() < 0 || ates.getY() > 550){ //ates frame den çıkmışsa
                //atesler.remove(ates);  
            }
        }
        
        g.setColor(Color.WHITE);
        //ateş çizimi
        for(Ates ates: atesler){
            g.fillRect(ates.getX(), ates.getY(), 5, 10);
        } 
    }

    /*java her repaint çağırdığında aynı şekilde paint'ide çağırmış olur
    ileride actionperformed yazdığımız zaman repaint'i çağırıp
    şekillerin tekrardan oluşturmamızı sağlayacak.*/
    /*@Override
    public void repaint() { 
        super.repaint();
    }*/
    

    
    
    @Override
    public void keyTyped(KeyEvent e) {
  
    }

    
    private boolean kontrol = false;
    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if(c == KeyEvent.VK_LEFT){//sola basılmış ise
            if(UzayGemisiX<=0){ //sol sınırı aşmaması için frameden çıkmaması için
                UzayGemisiX=0;
            }
            else{
                UzayGemisiX-=dirUzayX; //sola kaydırma işlemi
            }
        }
        else if(c == KeyEvent.VK_RIGHT){     
            if(UzayGemisiX>=720){ //sağ sınırı aşmaması için frameden çıkmaması için
                UzayGemisiX=720;
            }
            else{
                UzayGemisiX+=dirUzayX; //sağa kaydırmai işlemi
                /*if(ivme!=0){
                  timer2.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent e) {
                         UzayGemisiX+=ivme;
                         ivme--;     
                         if(ivme==0){
                             timer2.stop();
                             ivme=8;
                         }
                      }
                  });
                  timer2.start();
                }*/
            }
        }
        
        //ateş etme
        else if(c == KeyEvent.VK_CONTROL){
            
            atesler.add(new Ates(UzayGemisiX+15,470));
            
            if(mermi_sayac>=1){
                atesler.add(new Ates(UzayGemisiX,470));
                harcanan_ates++;
            }
            if(mermi_sayac>=2){
                atesler.add(new Ates(UzayGemisiX+30,470));
                harcanan_ates++;
            }
             if(mermi_sayac>=3){
                atesler.add(new Ates(UzayGemisiX+45,470));
            }
             if(mermi_sayac>=4){
                atesler.add(new Ates(UzayGemisiX-15,470));
             }
             if(mermi_sayac>=5){
                atesler.add(new Ates(UzayGemisiX-30,470));
                atesler.add(new Ates(UzayGemisiX+60,470));
                kontrol=true;
             }    
            harcanan_ates++;
        }
    }

    

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       //ates hareketi sadece yukarı doğru
       carpisma();
       for(Ates ates: atesler){
           ates.setY(ates.getY()-ates.getAtesdirY());
        }         
    


       //top hareketi
       topX+=topDirX;
       if(topX>=750){
           topDirX=-topDirX;
       }
       if(topX<=0){
           topDirX=-topDirX;
       }
       
       /*if(kontrol){
           if(topX>=749 || topX<=1){
               topY+=topDirY;
               if(new Rectangle(topX, topY, 32, 32).intersects(new Rectangle(UzayGemisiX, 490,image.getWidth()/10,image.getHeight()/10))){
               JOptionPane.showMessageDialog(this, "gg");
                }
           }
           
       }*/
       
       
      /* if(kontrolEt()){
            timer.stop();
            String mesaj = "Kazandınız\nHarcanan Ateş: " + harcanan_ates
                    +"\nGeçen Süre: " + gecen_sure/1000.0;
            JOptionPane.showMessageDialog(this, mesaj);
            System.exit(0);*/
       
       
       
       repaint(); //her action performed çalıştığımızda repainti çağırmamız gerek paint'i otamatik çalıştırsın
    }
    
}
