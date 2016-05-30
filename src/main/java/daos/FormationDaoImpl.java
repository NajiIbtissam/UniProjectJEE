package daos;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Formation;


public class FormationDaoImpl implements FormationDao{

	
	public void create(Formation entity) {
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

	
	public void update(Formation entity) {
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

	
	public void delete(Formation entity) {
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

	
	public Formation getFormationById(long id) {
		Formation formation=null;
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
			formation=s.get(Formation.class, id);
		tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		return formation;
	}

	@SuppressWarnings("unchecked")
	
	public ArrayList<Formation> getAllFormations() {
		ArrayList<Formation>formations=new ArrayList<Formation>();
		Session s = HibernateUtils.getSessionFactory().openSession();
		//Transaction tx = s.beginTransaction();
		formations=(ArrayList<Formation>) s.createCriteria(Formation.class).list();
		return formations;
	}
	

}
