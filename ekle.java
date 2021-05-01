
package stoktakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ekle {
    
    Connection getConnection(){
       Connection cn=null;
        try {
          cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stoktakip?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
          return cn;
        } catch (SQLException ex) {
            System.out.println("Veritabanı bağlantısı başarısız. ");
          Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }     
}
    public void kaydet(String urun_adi,String urun_acıklama,float urun_fiyat){
        
        
    Connection cn=getConnection();
    try{     
     PreparedStatement  uygula =cn.prepareStatement("insert into urun(urun_adi,urun_acıklama,urun_fiyat) values(?,?,?)");
     uygula.setString(1,urun_adi);
     uygula.setString(2,urun_acıklama);
     uygula.setFloat(3,urun_fiyat);
     uygula.executeUpdate();
     
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
      }}
    
    
}
