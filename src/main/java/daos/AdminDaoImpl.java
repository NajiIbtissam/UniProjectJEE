package daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Admin;


public class AdminDaoImpl implements AdminDao {

	@Override
	public void create(Admin entity) {
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

	@Override
	public void update(Admin entity) {
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

	@Override
	public void delete(Admin entity) {
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

	@Override
	public Admin getAdminByName(String name,String password) {
		Session s = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		String hql = "FROM Admin A WHERE A.name =:name and A.password =:password";
		Query q = s.createQuery(hql);
		q.setString("name", name);	
		q.setString("password", password);
		List<Admin> admins=q.list();
		if(admins.size()==0)
		{
			return null;
		}
		return admins.get(0);
		

	}

	@SuppressWarnings("unchecked")
	public ArrayList<Admin> getAllAdmins() {
		ArrayList<Admin>admins=new ArrayList<Admin>();
		Session s = HibernateUtils.getSessionFactory().openSession();
		//Transaction tx = s.beginTransaction();
		admins=(ArrayList<Admin>) s.createCriteria(Admin.class).list();
		return admins;
	}

}
