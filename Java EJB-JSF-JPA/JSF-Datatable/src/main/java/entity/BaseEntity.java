package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Entityler hezaman için baseEntity sınıfını extend edeceğinden dolayı super sınıf olarak işaretlendi
 * Buradaki tablo oluşturulma stratejisi alt sınıflarına yansıtılacak.
 */
@MappedSuperclass
public abstract class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "olusturulma_tarihi")
    private Date olusturulmaTarihi;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "guncelleme_tarihi")
    private Date guncellemeTarihi;
    @Column(name = "okusturan_kisi")
    private String olusturanKisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Date getGuncellemeTarihi() {
        return guncellemeTarihi;
    }

    public void setGuncellemeTarihi(Date guncellemeTarihi) {
        this.guncellemeTarihi = guncellemeTarihi;
    }

    public String getOlusturanKisi() {
        return olusturanKisi;
    }

    public void setOlusturanKisi(String olusturanKisi) {
        this.olusturanKisi = olusturanKisi;
    }

}