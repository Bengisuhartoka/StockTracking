
package stoktakip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class guncelle extends ekle{
    Connection cn = getConnection();
    
    public void gnclle(int urun_kodu,String urun_adi,String urun_acıklama, float urun_fiyat){
      try{     
     PreparedStatement  uygula =cn.prepareStatement("update urun set urun_adi=?,urun_acıklama=?,urun_fiyat=? where urun_kodu=?");
     
     
     uygula.setString(1,urun_adi);
     uygula.setString(2,urun_acıklama);
     uygula.setFloat(3,urun_fiyat);
     uygula.setInt(4, urun_kodu);
     uygula.executeUpdate();
     
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
      }}
}
