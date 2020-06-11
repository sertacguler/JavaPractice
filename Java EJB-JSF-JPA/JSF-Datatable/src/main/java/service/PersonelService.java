package service;

import dao.PersonelDAO;
import entity.Personel;

import java.util.ArrayList;
import java.util.List;

public class PersonelService implements IPersonelService {

    private List<Personel> personelList = new ArrayList<Personel>();
    private Long idGenerator = 1L;
    private static PersonelService instance;
    private PersonelDAO personelDAO = new PersonelDAO();

    private PersonelService() {
    }

    /**
     * PersonelService nesnesinin birkere new anahtar sözcüğü ile oluşturulması için
     * Singleton Design patter uygulanıyor.
     * Nesnenin Birkere oluşmasından sorumlu tasarım desenidir.
     *
     * @return
     */
    public static PersonelService getInstance() {
        if (instance == null) {
            instance = new PersonelService();
        }
        return instance;

    }

    public void kaydet(Personel personel) {
        if (personel != null) {
            personelDAO.kaydet(personel);

            /*Personel yeniPersonel=new Personel();
            yeniPersonel.setId(idGenerator);
            yeniPersonel.setDepartman(personel.getDepartman());
            yeniPersonel.setIseGirisTarih(personel.getIseGirisTarih());
            yeniPersonel.setMaas(personel.getMaas());
            yeniPersonel.setOlusturanKisi("Developer");
            yeniPersonel.setOlusturulmaTarihi(new Date());
            yeniPersonel.setGuncellemeTarihi(null);
            yeniPersonel.setAd(personel.getAd());
            yeniPersonel.setSoyad(personel.getSoyad());
            yeniPersonel.setDogumTarihi(personel.getDogumTarihi());
            yeniPersonel.setTcNo(personel.getTcNo());
            yeniPersonel.setTelNo(personel.getTelNo());
            yeniPersonel.setSicilNo(personel.getSicilNo());
            yeniPersonel.setUnvan(personel.getUnvan());
            idGenerator++;
            personelList.add(yeniPersonel);*/

        }

    }

    public List<Personel> personelListesiGetir() {
        return personelDAO.findAll();

    }

}