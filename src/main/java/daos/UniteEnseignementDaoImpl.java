package daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.UniteEnseignement;

public class UniteEnseignementDaoImpl implements UniteEnseignementDao {

	public void create(UniteEnseignement entity) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		try {

			s.persist(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			s.close();
		}

		
	}

	public void update(UniteEnseignement entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UniteEnseignement entity) {
		// TODO Auto-generated method stub
		
	}

	public UniteEnseignement getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
