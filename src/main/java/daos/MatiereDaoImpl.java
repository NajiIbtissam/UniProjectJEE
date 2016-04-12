package daos;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Matiere;

public class MatiereDaoImpl implements MatiereDao {

	public void create(Matiere entity) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
			s.persist(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	public void update(Matiere entity) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
			s.update(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			s.close();
		}
		
	}

	public void delete(Matiere entity) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {

			s.delete(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			s.close();
		}
		
	}

	public Matiere getMatiereById(int id) {
		Matiere matiere=null;
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
		matiere=s.get(Matiere.class, id);
		//Matiere= s.byId( Matiere.class ).load( id );
		tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		return matiere;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Matiere> getAllMatieres() {
		ArrayList<Matiere>matieres=new ArrayList<Matiere>();
		Session s = HibernateUtils.getSessionFactory().openSession();
		//Transaction tx = s.beginTransaction();
		matieres=(ArrayList<Matiere>) s.createCriteria(Matiere.class).list();
		return matieres;
	}

}
