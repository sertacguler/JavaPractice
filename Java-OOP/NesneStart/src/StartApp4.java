public class StartApp4 {

    public static void main(String[] args) {

        // static değişken sayi new lemeden ulaşabildik.
        System.out.println(Dikdortgen.sayi);
        Dikdortgen.sayi = 5;
        System.out.println(Dikdortgen.sayi);

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println("sayinin son degeri: " + dikdortgen.sayi);

        dikdortgen.sayi = 10;
        System.out.println("sayinin deger atanmış hali: " + dikdortgen.sayi);

    }

}
