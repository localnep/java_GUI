

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
            String sorgu = "Select * From yoneticiler where kullaniciadi = ? and sifre = ?";
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
     
     
     //kitapları getir jtable de göstermek için
    public ArrayList<Kitaplar> kitaplariGetir(){
        ArrayList<Kitaplar> cikti = new ArrayList<Kitaplar>();
        
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
                cikti.add(new Kitaplar(id, ad, soyad, dept, maas));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
   
          
    
     
    //yeni kitap ekleme
    public void kitapEkle(String kitapad,String kitapyazar,String kitaptur,String kitapmevcut){
        //Veritabanına yeni kitap ekleme sorgusu
        String sorgu = "Insert Into kitaplar (kitapadi,kitapyazari,kitapturu,kitapmevcut) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kitapad);
            preparedStatement.setString(2, kitapyazar);
            preparedStatement.setString(3, kitaptur);
            preparedStatement.setString(4, kitapmevcut);
            preparedStatement.executeUpdate();//update edilir
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void gelecekKitapEkle(String kitapad,String kitapyazar){
        //Veritabanına yeni kitap ekleme sorgusu
        String sorgu = "Insert Into gelecekitaplar (kitapadi,kitapyazari) VALUES(?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kitapad);
            preparedStatement.setString(2, kitapyazar);
            preparedStatement.executeUpdate();//update edilir
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     //kullanıcı güncelleme
    public void kitapGuncelle(int id,String yeni_kitapad,String yeni_kitapyazar,String yeni_kitaptur,String yeni_kitapmevcut){
        String sorgu = "Update kitaplar set kitapadi = ? , kitapyazari = ? , kitapturu = ? , kitapmevcut = ? where id = ?";//buraya gönderdiğim id ye göre değiştir
        try {
            preparedStatement = con.prepareStatement(sorgu);
            //güncelleme işlemleri
            preparedStatement.setString(1, yeni_kitapad);
            preparedStatement.setString(2, yeni_kitapyazar);
            preparedStatement.setString(3, yeni_kitaptur);
            preparedStatement.setString(4, yeni_kitapmevcut);
            
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void kitapSil(int id){
        String sorgu = "Delete from kitaplar where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void gelecekKitapSil(int id){
        String sorgu = "Delete from gelecekitaplar where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public ArrayList<gelecek_kitaplar> kitaplariGetir2(){
        ArrayList<gelecek_kitaplar> cikti2 = new ArrayList<gelecek_kitaplar>();
        
        try {
            statament = con.createStatement();
            String sorgu = "Select * from gelecekitaplar";
            ResultSet rs = statament.executeQuery(sorgu);
             while(rs.next()){
                int id = rs.getInt("id");
                String kitapadi = rs.getString("kitapadi");
                String kitapyazari = rs.getString("kitapyazari");
                cikti2.add(new gelecek_kitaplar(id,kitapadi, kitapyazari));
            }
            return cikti2;
        } catch (SQLException ex) {
            Logger.getLogger(Fonksiyonlar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     
    
}


        