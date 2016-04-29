package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import daos.AdminDao;
import daos.AdminDaoImpl;
import daos.MatiereDao;
import daos.MatiereDaoImpl;
import daos.UniteEnseignementDao;
import daos.UniteEnseignementDaoImpl;
import entities.Admin;
import entities.Matiere;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//Création des unités d'enseignements
		UniteEnseignement UE1 = new UniteEnseignement();
		UE1.setNom_unite("UE1 Ingénierie des données et des connaissances 1 : Fouille de données");
		UE1.setCM_unite(15);
		UE1.setTD_unite(15);
		UE1.setECTS_unite(3);
		
		UniteEnseignement UE2 = new UniteEnseignement();
		UE2.setNom_unite("UE2 : Ingénierie des données et des connaissances 2 : Base de données avancées");
		UE2.setCM_unite(15);
		UE2.setTD_unite(15);
		UE2.setECTS_unite(3);
		
		UniteEnseignement UE3 = new UniteEnseignement();
		UE3.setNom_unite("UE3 Ingénierie de l'optimisation 1");
		UE3.setCM_unite(15);
		UE3.setTD_unite(15);
		UE3.setECTS_unite(3);
		
		UniteEnseignement UE4 = new UniteEnseignement();
		UE4.setNom_unite("UE4 Modèles et outils avancés de programmation");
		UE4.setCM_unite(20);
		UE4.setTD_unite(15);
		UE4.setTP_unite(15);
		UE4.setECTS_unite(5);
		
		UniteEnseignement UE5 = new UniteEnseignement();
		UE5.setNom_unite("UE5 Maintenance et Gestion Approffondie des Systèmes d'Exploitation");
		UE5.setCM_unite(15);
		UE5.setTD_unite(15);
		UE5.setTP_unite(20);
		UE5.setECTS_unite(5);
		
		UniteEnseignement UE6 = new UniteEnseignement();
		UE6.setNom_unite("UE6 Ingénierie du Logiciel Libre");
		UE6.setCM_unite(24);
		UE6.setTD_unite(24);
		UE6.setTP_unite(32);
		UE6.setECTS_unite(7);
		
		UniteEnseignement UE7 = new UniteEnseignement();
		UE7.setNom_unite("UE7 Sécurité des Systèmes d'Information");
		UE7.setCM_unite(20);
		UE7.setTD_unite(15);
		UE7.setTP_unite(15);
		UE7.setECTS_unite(4);
		
		UniteEnseignement UE8 = new UniteEnseignement();
		UE8.setNom_unite("UE8  Culture d'entreprise");
		UE8.setECTS_unite(5);
		
		//Création des matières
		Matiere Communication = new Matiere();
		Communication.setNom_matiere("Communication");
		Communication.setCM_matiere(9);
		Communication.setTD_matiere(9);
		
		Matiere Anglais = new Matiere();
		Anglais.setNom_matiere("Anglais");
		Anglais.setTD_matiere(20);
		
		Matiere di = new Matiere();
		di.setNom_matiere("Droit de l'informatique");
		di.setCM_matiere(6);
		di.setTD_matiere(6);
		
		Matiere cp = new Matiere();
		cp.setNom_matiere("Conférences Professionnelles");
		cp.setCM_matiere(6);
		
		Matiere ce = new Matiere();
		ce.setNom_matiere("Création d'entreprise");
		ce.setCM_matiere(3);
		ce.setTD_matiere(3);
		
		//On attriut chaque matière à une unité d'enseignement
		Communication.setUniteEn(UE8);
		Anglais.setUniteEn(UE8);
		di.setUniteEn(UE8);
		cp.setUniteEn(UE8);
		ce.setUniteEn(UE8);
		
		//UE8 : on rempli la liste de UE8 par les matières
		ArrayList<Matiere> LMatieresUE8 = new ArrayList<Matiere>();
		LMatieresUE8.add(Communication);
		LMatieresUE8.add(Anglais);
		LMatieresUE8.add(di);
		LMatieresUE8.add(cp);
		LMatieresUE8.add(ce);
		UE8.setListMatieres(LMatieresUE8);
		
		
		UniteEnseignementDao ud = new UniteEnseignementDaoImpl();
		ud.create(UE1);
		ud.create(UE2);
		ud.create(UE3);
		ud.create(UE4);
		ud.create(UE5);
		ud.create(UE6);
		ud.create(UE7);
		ud.create(UE8);

//		MatiereDao md = new MatiereDaoImpl();
//		md.create(Communication);
//		md.create(Anglais);
//		md.create(di);
//		md.create(cp);
//		md.create(ce);
		
		//création d'un admin
		Admin a1=new Admin();
		a1.setName("admin");
		a1.setPassword("1230");
		AdminDao ad=new AdminDaoImpl();
		ad.create(a1);
		
		
		if(request.getAttribute("username")!=null)
		{
		String username=(String) request.getAttribute("username");
		HttpSession session=request.getSession();
		session.setAttribute("username", username);
		
		}
		
		ArrayList<UniteEnseignement> arraym;
		UniteEnseignementDao mdd = new UniteEnseignementDaoImpl();
		arraym = mdd.getAllUnites();
		if (arraym.isEmpty())
			System.out.println("the array is empty");
		else {
			request.setAttribute("list", arraym);
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			rd.forward(request, response);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
