
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener{

    //global property
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SİZE = 25; //item boyutu
    static final int GAME_UNİTS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SİZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNİTS]; //14400
    final int y[] = new int[GAME_UNİTS];


    
    //game property
    int bodyParts = 6; //yılanın başlangıç birim kare sayısı
    int applesEaten;
    int appleX;
    int appleY;
    int insectX;
    int insectY;
    int sayac1=0,sayac2=0;
    private BufferedImage image;
    boolean goster = false;
    char direction = 'R'; //default right hareket devam eder
    boolean running = false;
    Timer timer,timer2;
    Random random = new Random();
    
    public GamePanel() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("insect.png")));
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
	this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT)); //orta ekranda çıkartmak için
	this.setBackground(Color.PINK);
	this.setFocusable(true);
	this.addKeyListener(new MyKeyAdapter());
	startGame();
    }

    public void startGame(){
        newApple();
	running = true;
	timer = new Timer(DELAY,this);
	timer.start();
        timer2 = new Timer(10000, this);
        timer2.start();
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayac1++;
                if(sayac1 % 30 == 0){ //2 saniyeye yakın göster
                    goster=false;
                }
            }
        });
        
        timer2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               insectX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SİZE))*UNIT_SİZE; //25*24
	       insectY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SİZE))*UNIT_SİZE; //25*24
               goster=true;
               sayac1=0;
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);   
    }
    
    public void draw(Graphics g){
        if(running) {
            
	/*for(int i=0;i<SCREEN_HEIGHT/UNIT_SİZE;i++) {
		g.drawLine(i*UNIT_SİZE, 0, i*UNIT_SİZE, SCREEN_HEIGHT);
		g.drawLine(0, i*UNIT_SİZE, SCREEN_WIDTH, i*UNIT_SİZE);
	}*/
	g.setColor(Color.red);
	g.fillOval(appleX, appleY, UNIT_SİZE, UNIT_SİZE);
        

        if(goster){
            g.drawImage(image, insectX, insectY, UNIT_SİZE, UNIT_SİZE, this);
            timer2.restart();
        }
        
        

             

       
        

	for(int i = 0; i< bodyParts;i++) {
		if(i == 0) {
			g.setColor(Color.green);
			g.fillRect(x[i], y[i], UNIT_SİZE, UNIT_SİZE);
		}
		else {
			//g.setColor(new Color(45,180,0));
			g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
			g.fillRect(x[i], y[i], UNIT_SİZE, UNIT_SİZE);
		}			
	}
        
        //Skor Ekranı
	g.setColor(Color.YELLOW);
	g.setFont( new Font("Ink Free",Font.BOLD, 40));
	FontMetrics metrics = getFontMetrics(g.getFont());
	g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		}
	else {
		gameOver(g);
             }
    }
    
    public void newApple(){
		int appleCX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SİZE))*UNIT_SİZE; //25*24
		int appleCY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SİZE))*UNIT_SİZE; //25*24            
                
                for(int i=0;i<bodyParts;i++){
                    while(appleCX == x[i] && appleCY == y[i]){
                         appleCX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SİZE))*UNIT_SİZE; //25*24
		         appleCY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SİZE))*UNIT_SİZE; //25*24
                    }
                }
                
                appleX = appleCX;
                appleY = appleCY;             
	}

        
    public void move(){ //hareket
        for(int i = bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case 'U':
			y[0] = y[0] - UNIT_SİZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SİZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SİZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SİZE;
			break;
		}
    }
    
    
    
    public void checkApple(){ //Elma yediğinde
        if((x[0] == appleX) && (y[0] == appleY)) { //elmayı sadece yılanın başı x[0]y[0] yiyeebilir
			bodyParts++;
			applesEaten++;
			newApple();
		}
        
        if((x[0] == insectX) && (y[0] == insectY)) { //elmayı sadece yılanın başı x[0]y[0] yiyeebilir
			bodyParts+=5;
			applesEaten+=5;
                        goster=false;
                        timer2.restart();
		}
    }
    
    public void checkCollisions(){ //çarpışma kontrol
        	//checks if head collides with body -> baş vücuda çarptı mı
		for(int i = bodyParts;i>0;i--) {
			if((x[0] == x[i])&& (y[0] == y[i])) {
				running = false;
			}
		}
		//check if head touches left border
		if(x[0] < 0) {
                        x[0]= SCREEN_WIDTH;
			//running = false;
		}
		//check if head touches right border
		if(x[0] > SCREEN_WIDTH) {
                        x[0]= 0;
			//running = false;
		}
		//check if head touches top border
		if(y[0] < 0) {
                        y[0]= SCREEN_HEIGHT;
			//running = false;
		}
		//check if head touches bottom border
		if(y[0] > SCREEN_HEIGHT) {
                        y[0]= 0;
			//running = false;
		}
                
                if(!running) {
			timer.stop();
                        timer2.stop();
		}
	
    }
    
    public void gameOver(Graphics g){
        //Score
		g.setColor(Color.red);
		g.setFont( new Font("Ink Free",Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		//Game Over text
		g.setColor(Color.red);
		g.setFont( new Font("Ink Free",Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        	
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
    }
    
    
    public class MyKeyAdapter extends KeyAdapter{ //key listener
       @Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') { //direction right ise left'e gidemez
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') { //direction left ise right'a gidemez
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') { //direction down ise up'a gidemez
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {//direction up ise down'a gidemez
					direction = 'D';
				}
				break;
			}
		}
	}
            
 }
    
    

