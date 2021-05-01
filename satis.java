package stoktakip;

public class satis {
    private int satis_id;
    private String urun_adi;
    private float ucret;
     private String tarih;
    private int adet;
    private String musteri_adi;

    public int getSatis_id() {
        return satis_id;
    }

    public void setSatis_id(int satis_id) {
        this.satis_id = satis_id;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public float getUcret() {
        return ucret;
    }

    public void setUcret(float ucret) {
        this.ucret = ucret;
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

    public String getMusteri_adi() {
        return musteri_adi;
    }

    public void setMusteri_adi(String musteri_adi) {
        this.musteri_adi = musteri_adi;
    }

    public satis(int satis_id, String urun_adi, float ucret, String tarih, int adet, String musteri_adi) {
        this.satis_id = satis_id;
        this.urun_adi = urun_adi;
        this.ucret = ucret;
        this.tarih = tarih;
        this.adet = adet;
        this.musteri_adi = musteri_adi;
    }
    
 
  

   
}
