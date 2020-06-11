package com.bilisimegitim.girisjsf.mb;

import com.bilisimegitim.personelweb.dao.GirisDAO;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@Named(value = "giris")
@RequestScoped
public class Giris {

    private String kullanici;
    private String sifre;

    public Giris() {
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String girisKontrol() {
        boolean sonuc = GirisDAO.giriseYetkilimi(kullanici, sifre);

        if (sonuc) {
            return "menu.xhtml";
        } else {
            return "login.xhtml";
        }
    }
}
