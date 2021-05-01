
package stoktakip;

import java.util.Date;

public class stoklistesi {
    private int stok_id;
    private String urun_adi;
    private float urun_fiyat;
    private String tarih;
    private int adet;

    public int getStok_id() {
        return stok_id;
    }

    public void setStok_id(int stok_id) {
        this.stok_id = stok_id;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public float getUrun_fiyat() {
        return urun_fiyat;
    }

    public void setUrun_fiyat(float urun_fiyat) {
        this.urun_fiyat = urun_fiyat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public stoklistesi(int stok_id, String urun_adi, float urun_fiyat, String tarih, int adet) {
        this.stok_id = stok_id;
        this.urun_adi = urun_adi;
        this.urun_fiyat = urun_fiyat;
        this.tarih = tarih;
        this.adet = adet;
    }
    
}
