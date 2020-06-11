/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rehberweb.MB;

import com.mycompany.rehberweb.session.GirisFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mycroft
 */
@Named(value = "girisMB")
@RequestScoped
public class GirisMB {

    @EJB
    private GirisFacade girisFacade;

    private String kullanici;
    private String sifre;

    public GirisMB() {
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

    public String giris() {
        boolean sonuc = girisFacade.girisKontrol(kullanici, sifre);
        if (sonuc) {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            session.setAttribute("username", kullanici);
            return "menu.xhtml?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "hata", "Kullanıcı adı yada sifre hatalı girilmiş!"));
            return "";
        }
    }

    public String guvenliCikis() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Session Sonlandırıldı.", session.getId() + " nolu session sonlandırıldı!"));

        return "giris.xhtml?faces-redirect=true";//BU kısım da bıraktık
    }

}
