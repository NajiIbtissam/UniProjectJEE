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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//***********************Test Creation*******************************************

			UniteEnseignement UE1=new UniteEnseignement();
			UE1.setNom_unite("UE1 : Culture d'entreprise");	
			
			
			Matiere Communication=new Matiere();
			Communication.setNom_matiere("Communication");
			Communication.setCM_matiere(9);
			Communication.setTD_matiere(9);
			Communication.setTotal_matiere(Communication.getCM_matiere()+Communication.getTD_matiere());
			Matiere Anglais=new Matiere();
			Anglais.setNom_matiere("Anglais");
			Anglais.setTD_matiere(20);
			Anglais.setTotal_matiere(Anglais.getTD_matiere());
			
			Communication.setId_UniteEn(UE1);
			Anglais.setId_UniteEn(UE1);
				
			ArrayList<Matiere>LMatieres=new ArrayList<Matiere>();
			LMatieres.add(Communication);
			LMatieres.add(Anglais);
			UE1.setListMatieres(LMatieres);
			UE1.setTotal_unite(Communication.getTotal_matiere()+Anglais.getTD_matiere());
			
			UniteEnseignementDao ud=new UniteEnseignementDaoImpl();
			ud.create(UE1);
	
			MatiereDao md=new MatiereDaoImpl() ;
			md.create(Communication);
			md.create(Anglais);
		
		ArrayList<Matiere>arraym;
		MatiereDao mdd=new MatiereDaoImpl();
		arraym=mdd.getAllMatieres();
		if(arraym.isEmpty())
			System.out.println("the array is empty");
		else
		{
//			System.out.println("rani 3amraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		System.out.println(arraym.get(0).getNom_matiere());
			request.setAttribute("maListeMatieres", "arraym");

		    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		    rd.forward(request,response);
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
