package Logika;

import Main.HibernateUtil;
import Main.Zaposleni;
import java.awt.event.WindowEvent;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Kristina
 */
public class Aplikacija {
    
    public static void PrikazZaposlenih(){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        String hql = "from firma_zaposleni as zaposleni";
        Query query = session.createQuery(hql);
        List <Zaposleni> zaposleni = null;
 
        try {
            
        tx = session.beginTransaction();
        zaposleni = query.list();
        tx.commit();
        
        } catch (HibernateException e) {
            if (tx != null) {
            tx.rollback();
            }
          System.out.println(e);
          } finally {
            HibernateUtil.createSessionFactory().close();
            }   
        for(Zaposleni radnik : zaposleni){
            System.out.println(radnik);
        }
    }
    public static void PrikazRadnika(){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        String hql = "select visinaDohotka from firma_zaposleni as zaposleni";
        Query query = session.createQuery(hql);
        List <Zaposleni> zaposleni = null;
 
        try {
            
        tx = session.beginTransaction();
        zaposleni = query.list();
        tx.commit();
        
        } catch (HibernateException e) {
            if (tx != null) {
            tx.rollback();
            }
          System.out.println(e);
          } finally {
            HibernateUtil.createSessionFactory().close();
            }  
        for(Zaposleni radnik : zaposleni){
            System.out.println(radnik);
        }
        
    }
    public static void IzmenaPodataka(){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        Zaposleni zaposleni = (Zaposleni)session.get(Zaposleni.class, 7);
        zaposleni.setIme(null);
        zaposleni.setBrGodina(1);
        zaposleni.setAdresa(null);
        zaposleni.setVisinaDohotka(100);
        try {
            
        tx = session.beginTransaction();
        session.update(zaposleni);
        tx.commit();
        
        } catch (HibernateException e) {
            if (tx != null) {
            tx.rollback();
            }
          System.out.println(e);
          } finally {
            HibernateUtil.createSessionFactory().close();
            }  
        
    }
    public static void BrisanjeZaposlenog(){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        Zaposleni zaposleni = (Zaposleni)session.get(Zaposleni.class, 7);
        
        try {
            
        tx = session.beginTransaction();
        session.delete(zaposleni);
        tx.commit();
        
        } catch (HibernateException e) {
            if (tx != null) {
            tx.rollback();
            }
          System.out.println(e);
          } finally {
            HibernateUtil.createSessionFactory().close();
            }
        
    }
    public static void UnosZaposlenog(){
        
        Session session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        
        Zaposleni zaposleni = new Zaposleni();
        Integer id = (Integer)session.save(zaposleni);
        zaposleni.setIme(null);
        zaposleni.setBrGodina(3);
        zaposleni.setAdresa(null);
        zaposleni.setVisinaDohotka(100);
        try {
            
        tx = session.beginTransaction();
        session.persist(zaposleni);
        tx.commit();
        
        } catch (HibernateException e) {
            if (tx != null) {
            tx.rollback();
            }
          System.out.println(e);
          } finally {
            HibernateUtil.createSessionFactory().close();
            }
        
    }
   
    public static void Zavrsetak(){
         System.exit(0);
    }
}
