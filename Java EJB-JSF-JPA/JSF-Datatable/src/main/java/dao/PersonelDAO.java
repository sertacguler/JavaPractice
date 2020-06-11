package dao;

import entity.Personel;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import java.util.List;

public class PersonelDAO extends BaseDAO {

    public void kaydet(Personel personel) {
        Transaction transaction = null;

        try {
            transaction = getSession().beginTransaction();
            getSession().save(personel);
        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            transaction.commit();
        }

    }

    public List<Personel> findAll() {
        List<Personel> personelList = null;
        Transaction transaction = null;

        try {
            transaction = getSession().beginTransaction();
            personelList = getSession().createQuery("from Personel", Personel.class).list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
        } finally {
            transaction.commit();
        }

        return personelList;

    }

}