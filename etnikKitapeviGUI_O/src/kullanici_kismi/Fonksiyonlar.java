
package kullanici_kismi;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fonksiyonlar {
    
     private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private java.sql.Statement statament;
    
    
    
    
    
    public Fonksiyonlar(){
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.veritabani_ismi+ "?useUnicode=true&characterEncoding=utf8";
        //veritabanı baglanma islemi
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Veritabani.kullanici_adi, Veritabani.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
    }
    
    
   
     public boolean girisYap(String kullanici_adi,String parola){
            String sorgu = "Select * From kullanicilar where kullaniciadi = ? and sifre = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            //değer varsa Resultset'e dönecek yoksa hiçbir değer dönmeyecek            
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next() == false){ //rs.next herhangi bir yeri göstermiyorsa yani k.adi ve parolamız yok ise false dönsün
                return false;
            }
            else{
                return true;
            }
                    } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return false; //herhangi bir exception olmazsa giriş yapılamaz
        }
     }
     
     
     public ArrayList<Kitaplar2> kitaplariGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar";
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     public ArrayList<Liderler> liderlikTablosunuGetir(){
        ArrayList<Liderler> cikti = new ArrayList<Liderler>();
        
        try {
            statament = con.createStatement();
            String sorgu = "Select * from bilgiyarismasi order by skor desc, skor LIMIT 0,10";
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                String ad = rs.getString("kullaniciadi");
                String skor = rs.getString("skor");
                cikti.add(new Liderler(ad,Integer.valueOf(skor)));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     
      public ArrayList<String> kendiSiralamamiGetir(){
        ArrayList<String> liderler = new ArrayList<String>();
        
        try {
            statament = con.createStatement();
            String sorgu = "Select * from bilgiyarismasi order by skor desc, kullaniciadi ";//LIMIT 0,10
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                String skor = rs.getString("skor");
                liderler.add(skor);
            }
            return liderler;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
   
     
     public ArrayList<Kitaplar2> masalGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar where kitapturu='Masal'"; // where kitapturu=Masal
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
      public ArrayList<Kitaplar2> romanGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar where kitapturu='Roman'"; // where kitapturu=Masal
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
      
      public ArrayList<Kitaplar2> bilimGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar where kitapturu='Bilim'"; // where kitapturu=Masal
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
      
    
      
      
         public ArrayList<Kitaplar2> kisiselGelisimGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar where kitapturu='Kişisel Gelişim'"; // where kitapturu=Masal
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
         
           public ArrayList<Kitaplar2> destanGetir(){
        ArrayList<Kitaplar2> cikti = new ArrayList<Kitaplar2>();
        try {
            statament = con.createStatement();
            String sorgu = "Select * from kitaplar where kitapturu='Destan'"; // where kitapturu=Masal
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("kitapadi");
                String soyad = rs.getString("kitapyazari");
                String dept = rs.getString("kitapturu");
                String maas = rs.getString("kitapmevcut");
                cikti.add(new Kitaplar2(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
           
           
           
     
     public String telgetir(){
         String telefon = new String();
         try {
             statament = con.createStatement();
             String sorgu = "Select * from kullanicilar";
             ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                telefon = rs.getString("telefon");
            }
             return telefon;
         } catch (SQLException ex) {
             Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }    
     }
     
     
       public void istekgonder(String ad,String telefon,String mesaj){
               String sorgu = "Insert Into isteklistesi (ad,telefon,mesaj) VALUES(?,?,?)";
               try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, telefon);
            preparedStatement.setString(3, mesaj);
            preparedStatement.executeUpdate();//update edilir
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }
       
          public void skorkaydet(String ad,int skor){
               String sorgu = "Insert Into bilgiyarismasi (kullaniciadi,skor) VALUES(?,?)";
               try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setInt(2, skor);
            preparedStatement.executeUpdate();//update edilir
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }
         
     
     
     public void kayitOl(String kullaniciadi,String sifre,String eposta,String telefon){
        //Veritabanına yeni kitap ekleme sorgusu
        String sorgu = "Insert Into kullanicilar (kullaniciadi,sifre,eposta,telefon) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciadi);
            preparedStatement.setString(2, sifre);
            preparedStatement.setString(3, eposta);
            preparedStatement.setString(4, telefon);
            preparedStatement.executeUpdate();//update edilir
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
        
       
        
        
        
    }
}
        

       
        
        
        
        
        
        
  
     
     
