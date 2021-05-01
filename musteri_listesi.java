
package stoktakip;
public class musteri_listesi {
    private int musteri_no;
    private String adi_soyadi;
    private String telefon;
    private String eklenis_tarihi;
    private String e_posta;

    public int getMusteri_no() {
        return musteri_no;
    }

    public void setMusteri_no(int musteri_no) {
        this.musteri_no = musteri_no;
    }

    public String getAdi_soyadi() {
        return adi_soyadi;
    }

    public void setAdi_soyadi(String adi_soyadi) {
        this.adi_soyadi = adi_soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEklenis_tarihi() {
        return eklenis_tarihi;
    }

    public void setEklenis_tarihi(String eklenis_tarihi) {
        this.eklenis_tarihi = eklenis_tarihi;
    }

    public String getE_posta() {
        return e_posta;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public musteri_listesi(int musteri_no, String adi_soyadi, String telefon, String eklenis_tarihi, String e_posta) {
        this.musteri_no = musteri_no;
        this.adi_soyadi = adi_soyadi;
        this.telefon = telefon;
        this.eklenis_tarihi = eklenis_tarihi;
        this.e_posta = e_posta;
    }
}
