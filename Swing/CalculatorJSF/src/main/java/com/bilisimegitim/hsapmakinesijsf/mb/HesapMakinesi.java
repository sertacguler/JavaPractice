package com.bilisimegitim.hsapmakinesijsf.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "hesapMakinesi")
@RequestScoped
public class HesapMakinesi {

    public HesapMakinesi() {
    }
    
    private double sayi1;
    private double sayi2;
    private double sonuc;

    public double getSayi1() {
        return sayi1;
    }

    public void setSayi1(double sayi1) {
        this.sayi1 = sayi1;
    }

    public double getSayi2() {
        return sayi2;
    }

    public void setSayi2(double sayi2) {
        this.sayi2 = sayi2;
    }

    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }
    
    public String topla(){
    sonuc = sayi1 + sayi2;
    return "";
    }
    
    public String cikar(){
    sonuc = sayi1 - sayi2;
    return "";
    }
    
    public String carp(){
    sonuc = sayi1 * sayi2;
    return "";
    }
    
    public String bol(){
    sonuc = sayi1 / sayi2;
    return "";
    }
            
}
