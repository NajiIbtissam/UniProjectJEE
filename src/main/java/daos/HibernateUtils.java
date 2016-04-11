package daos;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
//	private static final Session session = sessionFactory.openSession();

	private static SessionFactory buildSessionFactory() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures
																									// settings
																									// from
																									// hibernate.cfg.xml
				.build();
		return new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}// end buildSessionFactory

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

//	public static Session getSession() {
//		return session;
//	}
	//i employed fetch lazy in getting user for example and when i wanted to get System.out.println(user.getProjects().get(0).getName_project());
	//i encountered a problem cauz the sessions created are different that's why i found 2 solutions.
	//either i will create 1 session for all the project which is not good in the case of big projects 
	//or to change fetch lazy to fetch = FetchType.EAGER in every entity which means every time u get a user for example 
	//u will get with it his projects,comments etc.......... :D

	public static void tearDown() throws Exception {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
