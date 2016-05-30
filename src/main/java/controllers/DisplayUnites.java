package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.FormationDao;
import daos.FormationDaoImpl;
import entities.Formation;
import entities.UniteEnseignement;

@WebServlet("/DisplayUnites")
public class DisplayUnites extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayUnites() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Création des formations
		// Formation L1 = new Formation();
		// L1.setnom("Licence 1 ");
		//
		// Formation L2 = new Formation();
		// L2.setnom("Licence 2 ");
		//
		// Formation L3 = new Formation();
		// L3.setnom("Licence 3 ");

		// Formation M1 = new Formation();
		// M1.setnom("Master 1 ");
		////
		//// Formation M2 = new Formation();
		//// M2.setnom("Master 2 ");
		//
		// // Création des unités d'enseignements
		// UniteEnseignement UE1 = new UniteEnseignement();
		// UE1.setnom("UE1 Ingénierie des données et des connaissances 1 :
		// Fouille de données");
		// UE1.setcm(15);
		// UE1.settd(15);
		// UE1.setects(3);
		// UE1.setFormation(M1);
		//
		// UniteEnseignement UE2 = new UniteEnseignement();
		// UE2.setnom("UE2 : Ingénierie des données et des connaissances 2 :
		// Base de données avancées");
		// UE2.setcm(15);
		// UE2.settd(15);
		// UE2.setects(3);
		// UE2.setFormation(M1);
		//
		// UniteEnseignement UE3 = new UniteEnseignement();
		// UE3.setnom("UE3 Ingénierie de l'optimisation 1");
		// UE3.setcm(15);
		// UE3.settd(15);
		// UE3.setects(3);
		// UE3.setFormation(M1);
		//
		// UniteEnseignement UE4 = new UniteEnseignement();
		// UE4.setnom("UE4 Modèles et outils avancés de programmation");
		// UE4.setcm(20);
		// UE4.settd(15);
		// UE4.settp(15);
		// UE4.setects(5);
		// UE4.setFormation(M1);
		//
		// UniteEnseignement UE5 = new UniteEnseignement();
		// UE5.setnom("UE5 Maintenance et Gestion Approffondie des Systèmes
		// d'Exploitation");
		// UE5.setcm(15);
		// UE5.settd(15);
		// UE5.settp(20);
		// UE5.setects(5);
		// UE5.setFormation(M1);
		//
		// UniteEnseignement UE6 = new UniteEnseignement();
		// UE6.setnom("UE6 Ingénierie du Logiciel Libre");
		// UE6.setcm(24);
		// UE6.settd(24);
		// UE6.settp(32);
		// UE6.setects(7);
		// UE6.setFormation(M1);
		//
		// UniteEnseignement UE7 = new UniteEnseignement();
		// UE7.setnom("UE7 Sécurité des Systèmes d'Information");
		// UE7.setcm(20);
		// UE7.settd(15);
		// UE7.settp(15);
		// UE7.setects(4);
		// UE7.setFormation(M1);
		//
		// UniteEnseignement UE8 = new UniteEnseignement();
		// UE8.setnom("UE8 Culture d'entreprise");
		// UE8.setects(5);
		// UE8.setFormation(M1);
		//
		// // Création des matières
		// Matiere Communication = new Matiere();
		// Communication.setnom("Communication");
		// Communication.setcm(9);
		// Communication.settd(9);
		//
		// Matiere Anglais = new Matiere();
		// Anglais.setnom("Anglais");
		// Anglais.settd(20);
		//
		// Matiere di = new Matiere();
		// di.setnom("Droit de l'informatique");
		// di.setcm(6);
		// di.settd(6);
		//
		// Matiere cp = new Matiere();
		// cp.setnom("Conférences Professionnelles");
		// cp.setcm(6);
		//
		// Matiere ce = new Matiere();
		// ce.setnom("Création d'entreprise");
		// ce.setcm(3);
		// ce.settd(3);
		//
		// // On attriut chaque matière à une unité d'enseignement
		// Communication.setUniteEn(UE8);
		// Anglais.setUniteEn(UE8);
		// di.setUniteEn(UE8);
		// cp.setUniteEn(UE8);
		// ce.setUniteEn(UE8);
		//
		//
		// // on rempli la liste du formation M1 par les unités
		// ArrayList<UniteEnseignement> LUnitesM1 = new
		// ArrayList<UniteEnseignement>();
		// LUnitesM1.add(UE1);
		// LUnitesM1.add(UE2);
		// LUnitesM1.add(UE3);
		// LUnitesM1.add(UE4);
		// LUnitesM1.add(UE5);
		// LUnitesM1.add(UE6);
		// LUnitesM1.add(UE7);
		// LUnitesM1.add(UE8);
		// M1.setListUnites(LUnitesM1);
		//
		//
		//
		//
		// // UE8 : on rempli la liste de UE8 par les matières
		// ArrayList<Matiere> LMatieresUE8 = new ArrayList<Matiere>();
		// LMatieresUE8.add(Communication);
		// LMatieresUE8.add(Anglais);
		// LMatieresUE8.add(di);
		// LMatieresUE8.add(cp);
		// LMatieresUE8.add(ce);
		// UE8.setListMatieres(LMatieresUE8);
		//
		// FormationDao fd=new FormationDaoImpl();
		// fd.create(M1);
		//
		// UniteEnseignementDao ud = new UniteEnseignementDaoImpl();
		// ud.create(UE1);
		// ud.create(UE2);
		// ud.create(UE3);
		// ud.create(UE4);
		// ud.create(UE5);
		// ud.create(UE6);
		// ud.create(UE7);
		// ud.create(UE8);
		//
		// MatiereDao md = new MatiereDaoImpl();
		// md.create(Communication);
		// md.create(Anglais);
		// md.create(di);
		// md.create(cp);
		// md.create(ce);
		//
		// // création d'un admin
		// Admin a1 = new Admin();
		// a1.setName("admin");
		// a1.setPassword("1230");
		// AdminDao ad = new AdminDaoImpl();
		// ad.create(a1);

		if (request.getParameter("id") != null) {
			
			
			int formationId = Integer.parseInt(request.getParameter("id"));
			ArrayList<UniteEnseignement> arraym;
			// UniteEnseignementDao mdd = new UniteEnseignementDaoImpl();
			// arraym = mdd.getAllUnites();
			// request.setAttribute("list", arraym);

			FormationDao fd = new FormationDaoImpl();

			Formation formation = fd.getFormationById(formationId);

			request.setAttribute("formation", formation);
		}
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
		rd.forward(request, response);

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
