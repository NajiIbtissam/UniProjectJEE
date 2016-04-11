package daos;


import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Matiere;
import entities.UniteEnseignement;

public class UniteEnseignementDaoImpl implements UniteEnseignementDao {
	
	public void create(UniteEnseignement entity) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
			s.persist(entity);
			System.out.println("rani persestittttt");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}

		
	}

	public void update(UniteEnseignement entity) {
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

	public void delete(UniteEnseignement entity) {
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

	public UniteEnseignement getUserById(int id) {
		UniteEnseignement ue=null;
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {
		ue=s.get(UniteEnseignement.class, id);
		//ue= iteEnseignements.byId( UniteEnseignement.class ).load( id );
		tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		return ue;
	}

}
