
package stoktakip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class silmeislemi extends ekle{
    Connection cn = getConnection();
     public void sll(int urun_kodu){
      
      try{     
     PreparedStatement  uygula =cn.prepareStatement("Delete From urun where urun_kodu=?");
     uygula.setInt(1, urun_kodu);
     uygula.executeUpdate();
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
      }}
    
}
