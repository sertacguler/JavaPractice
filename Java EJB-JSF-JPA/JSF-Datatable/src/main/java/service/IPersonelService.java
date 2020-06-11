package service;

import entity.Personel;

import java.util.List;

public interface IPersonelService {

    void kaydet(Personel personel);

    List<Personel> personelListesiGetir();

}