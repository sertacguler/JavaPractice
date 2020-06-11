package view;

import entity.Personel;
import org.primefaces.event.SelectEvent;
import service.PersonelService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean
public class PersonelView {

    private Personel personel;
    private PersonelService personelService;
    private List<Personel> personelList;
    private List<String> departmanList;
    private Map<Integer, String> unvanMap;
    private Integer unvanKey;

    @PostConstruct
    public void init() {
        personel = new Personel();
        personelService = PersonelService.getInstance();
        personelList = new ArrayList<>();
        departmanList = new ArrayList<>();

        departmanList.add("Arge");
        departmanList.add("İnsan Kaynakları");
        departmanList.add("Yönetim");
        departmanList.add("Mali İşler");
        departmanList.add("Hizmetli");

        unvanMap = new HashMap<>();

        unvanMap.put(1, "Uzman");
        unvanMap.put(2, "Yönetici");
        unvanMap.put(3, "Kıdemli");
        unvanMap.put(4, "Asistan");
        unvanMap.put(5, "Stajyer");
        unvanMap.put(6, "Proje Yöneticisi");

        for (Map.Entry<Integer, String> entry : unvanMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

    }

    /**
     * Kaydet butonuna tıklandığında çağrılacak method
     * ActionListener ile asyn olarak çağırılıyor.
     */
    public void onKaydet() {

        if (personel.getAd() != null) {
            personelService.kaydet(personel);
            personelList = personelService.personelListesiGetir();
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage("Kayıt İşlemi Başarılı!"));
        } else {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR
                            , "Kayıt İşlemi Başarısız!", null));
        }
    }

    public void onUnvanSelected(SelectEvent selectEvent) {
        unvanKey = (Integer) selectEvent.getObject();
        System.out.println(unvanKey);
        String tempUnvan = unvanMap.get(unvanKey);

        switch (tempUnvan) {
            case "Stajyer":
                personel.setMaas(1000.0);
                personel.setUnvan(tempUnvan);
                break;
            case "Uzman":
                personel.setMaas(5000.0);
                personel.setUnvan(tempUnvan);
                break;
            default:
                personel.setMaas(2200.0);
                personel.setUnvan(tempUnvan);
                break;
        }

        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage("Unvan Seçildi"));

    }

    public void onDepartmanSelected(SelectEvent selectEvent) {
        String tempDepartman = (String) selectEvent.getObject();
        switch (tempDepartman) {
            case "Arge":
                unvanMap.clear();
                unvanMap.put(3, "Kıdemli");
                unvanMap.put(6, "Proje Yöneticisi");
                break;
        }

    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<Personel> personelList) {
        this.personelList = personelList;
    }

    public List<String> getDepartmanList() {
        return departmanList;
    }

    public void setDepartmanList(List<String> departmanList) {
        this.departmanList = departmanList;
    }

    public Map<Integer, String> getUnvanMap() {
        return unvanMap;
    }

    public void setUnvanMap(Map<Integer, String> unvanMap) {
        this.unvanMap = unvanMap;
    }

    public Integer getUnvanKey() {
        return unvanKey;
    }

    public void setUnvanKey(Integer unvanKey) {
        this.unvanKey = unvanKey;
    }

}