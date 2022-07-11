
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;



public class Minesweeper implements MouseListener{
    
    JFrame frame;
    Button[][] board; 
    int openButton; //oyunu bitirmek için
    private int count;
    
    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Game");
    JMenu menu2 = new JMenu("My First Git Project");
    JMenuItem item1 = new JMenuItem("New Game");
    JMenuItem item2 = new JMenuItem("Options");
    JMenuItem item3 = new JMenuItem("Exit");
    
    
    public Minesweeper() { //default play game
        count=10;
        board= new Button[9][9]; //GridLayout boyutu ile aynı olacak
        openButton=0;
        frame = new JFrame("Minesweeper");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(9,9));
        firstExecuteMethod();
    }
    
    public Minesweeper(int row,int col, int count){ //selected play game
        this.count=count;
        board= new Button[row][col];
        openButton=0;
        frame = new JFrame("Minesweeper");
        frame.setSize(1400,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(row,col));
        firstExecuteMethod();
    }
    
    
    //create button, add in board, add mouse hover
    public void firstExecuteMethod(){
        for(int row=0;row<board.length;row++){ //board.length row sayisini doner = 10
            for(int col=0;col<board[0].length;col++){ //board[0].length: ilk satırın length'i, aslında hepsi 10'a eşit
                Button btn = new Button(row,col);
                frame.add(btn);
                btn.addMouseListener(this);
                board[row][col]=btn;
            }
        }
        
        generateMine();
        updateCount();
        //printMine();
        //print();
        
        
        //add Menubar, add additional method
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        mb.add(menu);
        mb.add(menu2);
        frame.setJMenuBar(mb);
        frame.setVisible(true);
        
         item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               item2.doClick(); //burası yenilensin
               //frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
               
            }
        });
         
         
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JPanel panel = new JPanel();
                 JRadioButton b1 = new JRadioButton("<html>Beginner <br>10 Mine <br>9x9 floor</html>",true);
                 JRadioButton b2 = new JRadioButton("<html>Medium <br>40 Mine <br>16x16 floor</html>");
                 JRadioButton b3 = new JRadioButton("<html>Hard <br>99 Mine <br>16x30 floor</html>");
                 JRadioButton b4 = new JRadioButton("private");
                 ButtonGroup bg = new ButtonGroup();
                 JPanel panel2 = new JPanel();
                 panel2.setLayout(new GridLayout(3,2));
                 TextField tf = new TextField("9");
                 TextField tf2 = new TextField("9");
                 TextField tf3 = new TextField("10");
                 JLabel label = new JLabel("Yükseklik (9-24)");
                 JLabel label2 = new JLabel("Genişlik (9-30)");
                 JLabel label3 = new JLabel("Mayın (10-668)");
                 tf.setEditable(false);
                 tf2.setEditable(false);
                 tf3.setEditable(false);
                 label.setForeground(Color.GRAY);
                 label2.setForeground(Color.GRAY);
                 label3.setForeground(Color.GRAY);
                 bg.add(b1);
                 bg.add(b2);
                 bg.add(b3);
                 bg.add(b4);
                 panel.add(b1);
                 panel.add(b2);
                 panel.add(b3);
                 panel.add(b4);
                 panel2.add(label);
                 panel2.add(tf);
                 panel2.add(label2);
                 panel2.add(tf2);
                 panel2.add(label3);
                 panel2.add(tf3);
                 panel.add(panel2);
                 UIManager.put("OptionPane.minimumSize",new Dimension(400,200)); 
                 
                 
                 b4.addItemListener(new ItemListener() {
                     @Override
                     public void itemStateChanged(ItemEvent e) {
                       if(e.getStateChange()==1){
                            tf.setEditable(true);
                            tf2.setEditable(true);
                            tf3.setEditable(true);
                            label.setForeground(Color.BLACK);
                            label2.setForeground(Color.BLACK);
                            label3.setForeground(Color.BLACK);
                       }
                       else{
                            tf.setEditable(false);
                            tf2.setEditable(false);
                            tf3.setEditable(false);
                            label.setForeground(Color.GRAY);
                            label2.setForeground(Color.GRAY);
                            label3.setForeground(Color.GRAY);
                       }
                     }
                 });
                 
    
                 
                 
                 int n = JOptionPane.showConfirmDialog(frame, panel, "Difficulty Level", JOptionPane.OK_CANCEL_OPTION);
                 if (n == JOptionPane.OK_OPTION){
                     if(b1.isSelected()){
                        frame.setVisible(false);
                        frame.dispose();
                        new Minesweeper();
                     }
                     else if(b2.isSelected()){
                         frame.setVisible(false);
                         frame.dispose();
                         new Minesweeper(16, 16, 40);
                     }
                     else if(b3.isSelected()){
                         frame.setVisible(false);
                         frame.dispose();
                         new Minesweeper(16, 30, 99);
                     }
                     else if(b4.isSelected()){
                         boolean control = true;
                         int row = Integer.parseInt(tf.getText());
                         int col = Integer.parseInt(tf2.getText());
                         int count = Integer.parseInt(tf3.getText());
                         if(row<9 || row>24 || col<9 || col>30 || count<10 || count>668){
                             control = false;
                             JOptionPane.showMessageDialog(panel2, "Lütfen istenen aralıkta bir değer girin.");
                             item2.doClick();
                         }
                         else if(row*col-count < 14){
                             control = false;
                             String text = "Mine değer " + (row*col-14)+ " sayısından büyük olamaz";
                             JOptionPane.showMessageDialog(panel2,text);
                             item2.doClick();
                         }
                         else if(control){
                             frame.setVisible(false);
                             frame.dispose();
                             new Minesweeper(row,col,count);
                         }  
                     }

                 }
                 else if(n == JOptionPane.CANCEL_OPTION){
                         
                 }
                    }     
        });
        
        
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?", "QUIT", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(n==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
    }
    
    
    
    //just to show the bombs/mine
    public void printMine(){
        for(int row=0;row<board.length;row++){ 
            for(int col=0;col<board[0].length;col++){
                if(board[row][col].isMine()){
                    board[row][col].setIcon(new ImageIcon("bomb.png"));
                }
            }
        }
    }
    
    
    
    public void generateMine(){
        int i=0; // mine count
        while(i<count){
            int result[] = generateRandom();    
            // Aynı yerde mayın oluşmaması için
            while(board[result[0]][result[1]].isMine()){
                result = generateRandom();
            }
            board[result[0]][result[1]].setMine(true);
            i++;
        }
    }
    
    
    //row ve col'u aynı anda return edemediğimiz için bir dizi return ediyoruz
    public int[] generateRandom(){
         int randRow = (int)(Math.random() * board.length);
         int randCol = (int)(Math.random() * board[0].length);
         return new int[] {randRow,randCol};
    }
    
    
    //printMine ile gösterdikten sonra biraz gereksiz kaldı, erasable/unnecessary
    public void print(){
        for(int row=0;row<board.length;row++){ 
            for(int col=0;col<board[0].length;col++){
                if(board[row][col].isMine()){
                    board[row][col].setIcon(new ImageIcon("bomb.png"));
                }
                else{
                    board[row][col].setText(board[row][col].getCount()+"");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }

    
    
    public void updateCount(){
        for(int row=0;row<board.length;row++){ 
            for(int col=0;col<board[0].length;col++){
               if(board[row][col].isMine()){
                   counting(row,col);
               }
            }
        }
    }
    
    
    //** travelling algorithm **
    public void counting(int row,int col){
        for(int i=row-1;i<=row+1;i++){
            for(int k=col-1;k<=col+1;k++){
                try{ //gezinme sırasında Sınırın dışına çıkıldığında hata vermemesi için
                int value = board[i][k].getCount();
                board[i][k].setCount(++value); //buton açıldıktan sonra etrafında ki bomba sayısını gösterir
                }
                catch(Exception e){
                    
                }
                
            }
        }
    }
    
    
    //** open algorithm **
    public void open(int row,int col){
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col].getText().length()>0 || board[row][col].isEnabled()==false){
            return; //method exit
        }
        else if(board[row][col].getCount()!=0){
            board[row][col].setText(board[row][col].getCount()+"");
            board[row][col].setEnabled(false);
            openButton++;
        }
        else{
            openButton++;
            board[row][col].setEnabled(false);
            //recursive methods
            open(row-1, col);
            open(row+1, col);
            open(row, col-1);
            open(row, col+1);
        }
    }
    

    
    //@Override MouseListener methods
    
    @Override
    public void mouseClicked(MouseEvent e){
        /*
        e.getButton() == 1 --> left click
        e.getButton() == 2 --> scroll
        e.getButton() == 3 --> right click
        */
        
        Button btn = (Button) e.getComponent(); //tıklanan butonunu getirir
        
        if(e.getButton()==1){ 
            System.out.println("sol tıklandı");
            if(btn.isMine()){
                JOptionPane.showMessageDialog(frame, "Game Over");
                print();
            }
            else{
                open(btn.getRow(),btn.getCol());
                if(openButton>=(board.length * board[0].length)-count){ //burası değişecek
                    JOptionPane.showMessageDialog(frame, "You WIN");
                    print();
                }
            }
        }
        else if(e.getButton()==3){
            System.out.println("sağ tıklandı");
            if(!btn.isFlag()){
                btn.setIcon(new ImageIcon("flagged.png"));
                btn.setFlag(true);
            }
            else{
                btn.setIcon(null);
                btn.setFlag(false);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
   


    
}
