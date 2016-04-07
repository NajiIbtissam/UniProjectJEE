package mytests;

import daos.UniteEnseignementDaoImpl;
import entities.UniteEnseignement;

public class Main {

	public static void main(String[] args) {
		UniteEnseignement u1=new UniteEnseignement("Ingenierie logiciel", 50, 20, 20, 10, 5);
		UniteEnseignementDaoImpl ud=new UniteEnseignementDaoImpl();
		ud.create(u1);
	}
}
