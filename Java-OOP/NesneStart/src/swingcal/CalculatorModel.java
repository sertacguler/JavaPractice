package swingcal;

public class CalculatorModel {

    private double result;


    public String islem(double sayi1, char islem, double sayi2) {

        switch (islem) {
            case '+' :
                result = sayi1 + sayi2;
                break;
            case '-' :
                result = sayi1 - sayi2;
                break;
            case '*' :
                result = sayi1 * sayi2;
                break;
            case '/' :
                result = sayi1 / sayi2;
                break;
        }

        return String.valueOf(result);
    }

}
