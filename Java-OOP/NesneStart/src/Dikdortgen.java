public class Dikdortgen {

//private ile sadece sınıf üzerinden erişebilirim.
//public ile tüm paketlerden erişim sağlayabilirim.
//protected ile sadece aynı paketten
// ve protected tanımlı methodu olan sınıfın alt sınıflarından
//erişebilirim
//default erişim belirletici ile sadece
// o paket içerisinden erişebilirim

    public double uzunlugu;
    public double en;
    public double cevre;
    public double alan;
    //public Double a=new Double(0);
    public static int sayi;

    public static final double PI = 3.14;

    public Dikdortgen() {
    }

    public Dikdortgen(int uzunlugu, int en) {
        this.uzunlugu = uzunlugu;
        this.en = en;
    }

    public void alanHesapla() {
        this.alan = this.en * this.uzunlugu;
        System.out.println("Dikdörtgenimin alanı: " + alan);

    }

    public void alanHesapla(double uzunlugu, double en) {
        double sonuc = uzunlugu * en;
        System.out.println("Parametre alak Dikdörtgenin alan hesabı: " + sonuc);
    }

    public double alanHesapla(double alan, double en, double cevre) {
        return alan;
    }

    public void cevreHesapla() {
        this.cevre = (2 * this.en) + (2 * this.uzunlugu);
        System.out.println("Dikdörtgenimin çevresi: " + this.cevre);

    }

}