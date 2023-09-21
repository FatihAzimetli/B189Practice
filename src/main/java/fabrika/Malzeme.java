package fabrika;

public class Malzeme {

    private String ad;
    private int stokMiktar;
    private int minStok;
    private int maxStok;

    public Malzeme(String ad, int minStok, int maxStok) {
        this.ad = ad;
        this.stokMiktar = 0;
        this.minStok = minStok;
        this.maxStok = maxStok;
    }

    public String getAd() {
        return ad;
    }

    public int getStokMiktar() {
        return stokMiktar;
    }

    public void malzemeEkle(int miktar) {
        stokMiktar += miktar;
    }

    public void malzemeKullan(int miktar) {
        stokMiktar -= miktar;
    }

    public boolean ihtiyacVarMi() {
        return stokMiktar < minStok;
    }

    public void siparisVer(int miktar) {
        // Sipariş verme işlemi burada gerçekleştirilir
        System.out.println(miktar + " adet " + ad + " malzemesi sipariş verildi.");
    }

    public int getMinStok() {
        return minStok;
    }

    public int getMaxStok() {
        return maxStok;
    }

}


