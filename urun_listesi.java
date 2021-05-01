
package stoktakip;

public class urun_listesi {
    private int urun_kodu;
    private String urun_adi;
    private String urun_acıklama;
    private Float urun_fiyat;
    public urun_listesi(int urun_kodu, String urun_adi, String urun_acıklama, Float urun_fiyat) {
        this.urun_kodu = urun_kodu;
        this.urun_adi = urun_adi;
        this.urun_acıklama = urun_acıklama;
        this.urun_fiyat = urun_fiyat;
    }

    urun_listesi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUrun_kodu() {
        return urun_kodu;
    }

    public void setUrun_kodu(int urun_kodu) {
        this.urun_kodu = urun_kodu;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public String getUrun_acıklama() {
        return urun_acıklama;
    }

    public void setUrun_acıklama(String urun_acıklama) {
        this.urun_acıklama = urun_acıklama;
    }

    public Float getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyati(Float urun_fiyati) {
        this.urun_fiyat = urun_fiyati;
    }
 
   
}
