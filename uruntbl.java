
package stoktakip;

public class uruntbl {
    private int urun_kodu;
    private String urun_adi;
    private Float urun_fiyat;

    public uruntbl(int urun_kodu, String urun_adi, Float urun_fiyat) {
        this.urun_kodu = urun_kodu;
        this.urun_adi = urun_adi;
        this.urun_fiyat = urun_fiyat;
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

    public Float getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyat(Float urun_fiyat) {
        this.urun_fiyat = urun_fiyat;
    }
    
}
