package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.MatiereDao;
import daos.MatiereDaoImpl;
import daos.UniteEnseignementDao;
import daos.UniteEnseignementDaoImpl;
import entities.Matiere;
import entities.UniteEnseignement;

@WebServlet("/GestionBDTest")
public class GestionBDTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ***********************Test
		// Creation*******************************************

		UniteEnseignement UE1 = new UniteEnseignement();
		UE1.setNom_unite("UE1 : Culture d'entreprise");
		
		UniteEnseignement UE2 = new UniteEnseignement();
		UE2.setNom_unite("UE2 : Ingénierie du logiciel");

		
		//Les matières de la première unité
		Matiere Communication = new Matiere();
		Communication.setNom_matiere("Communication");
		Communication.setCM_matiere(9);
		Communication.setTD_matiere(9);
		Communication.setTotal_matiere(Communication.getCM_matiere() + Communication.getTD_matiere());
		Matiere Anglais = new Matiere();
		Anglais.setNom_matiere("Anglais");
		Anglais.setTD_matiere(20);
		Anglais.setTotal_matiere(Anglais.getTD_matiere());
		Matiere di = new Matiere();
		di.setNom_matiere("Droit de l'informatique");
		di.setCM_matiere(6);
		di.setTD_matiere(6);
		di.setTotal_matiere(di.getTD_matiere());
		
		// Les matières de la deuxième unité
		Matiere gp = new Matiere();
		gp.setNom_matiere("Gestion du projet");
		gp.setCM_matiere(15);
		gp.setTD_matiere(13);
		gp.setTP_matiere(15);
		gp.setTotal_matiere(gp.getCM_matiere() + gp.getTD_matiere());
		Matiere tu = new Matiere();
		tu.setNom_matiere("Les tests unitaires");
		tu.setCM_matiere(7);
		tu.setTP_matiere(5);
		tu.setTotal_matiere(tu.getTD_matiere());
		
		
		
		//On attriut chaque matière à une unité d'enseignement
		Communication.setUniteEn(UE1);
		Anglais.setUniteEn(UE1);
		di.setUniteEn(UE1);
		
		gp.setUniteEn(UE2);
		tu.setUniteEn(UE2);
		
		
		//Calcul du total de l'unité 1
		ArrayList<Matiere> LMatieresu1 = new ArrayList<Matiere>();
		LMatieresu1.add(Communication);
		LMatieresu1.add(Anglais);
		UE1.setListMatieres(LMatieresu1);
		UE1.setTotal_unite(Communication.getTotal_matiere() + Anglais.getTD_matiere());
		
		//Calcul du total de l'unité 2
				ArrayList<Matiere> LMatieresu2 = new ArrayList<Matiere>();
				LMatieresu2.add(gp);
				LMatieresu2.add(tu);
				UE1.setListMatieres(LMatieresu2);
				UE1.setTotal_unite(gp.getTotal_matiere() + tu.getTD_matiere());

		UniteEnseignementDao ud = new UniteEnseignementDaoImpl();
		ud.create(UE1);
		ud.create(UE2);

		MatiereDao md = new MatiereDaoImpl();
		md.create(Communication);
		md.create(Anglais);
		md.create(di);
		md.create(gp);
		md.create(tu);

		ArrayList<Matiere> arraym;
		MatiereDao mdd = new MatiereDaoImpl();
		arraym = mdd.getAllMatieres();
		if (arraym.isEmpty())
			System.out.println("the array is empty");
		else {
			request.setAttribute("list", arraym);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
