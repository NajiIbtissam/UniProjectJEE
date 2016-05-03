package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.MatiereDao;
import daos.MatiereDaoImpl;
import daos.UniteEnseignementDao;
import daos.UniteEnseignementDaoImpl;
import entities.Matiere;
import entities.UniteEnseignement;

/**
 * Servlet implementation class MatiereManip
 */
public class MatiereManip extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String action = request.getParameter("action");
			
			MatiereDao md = new MatiereDaoImpl();
			
			switch (action) {
			case "edit":
				String name = request.getParameter("name");
				String value = request.getParameter("value");
				Long id = Long.parseLong(request.getParameter("pk"));
				Matiere u = md.getMatiereById(id);
				switch (name) {
				case "cm":
					u.setCM_matiere(Long.parseLong(value));
					md.update(u);
					break;
				case "td":
					u.setTD_matiere(Long.parseLong(value));
					md.update(u);
					break;
				case "tp":
					u.setTP_matiere(Long.parseLong(value));
					md.update(u);
					break;
				case "ects":
					u.setECTS_matiere(Long.parseLong(value));
					md.update(u);
					break;

				default:
					break;
				}
				break;

			default:
				break;
		
			case "delete":
				Long idd = Long.parseLong(request.getParameter("pk"));
				Matiere ud = md.getMatiereById(idd);
				md.delete(ud);
			
			case "create":
				Long idUnite = Long.parseLong(request.getParameter("id"));
				UniteEnseignementDao ued = new UniteEnseignementDaoImpl();
				UniteEnseignement ue = ued.getUniteById(idUnite);
				
				String nom = request.getParameter("nom");
				long cm=Long.valueOf(request.getParameter("cm")).longValue();
				long td=Long.valueOf(request.getParameter("td")).longValue();
				long tp=Long.valueOf(request.getParameter("tp")).longValue();
				long ects=Long.valueOf(request.getParameter("ects")).longValue();
				
				Matiere u1=new Matiere();
				u1.setNom_matiere(nom);
				u1.setCM_matiere(cm);
				u1.setTD_matiere(td);
				u1.setTP_matiere(tp);
				u1.setECTS_matiere(ects);
				u1.setUniteEn(ue);
				md.create(u1);
				break;
			}

			//response.getWriter().print(u.getTotal_matiere());
			}catch(Exception e){
				e.printStackTrace();
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().print("Please enter a valid value");
			}
		 RequestDispatcher rd = request.getRequestDispatcher("/DisplayUnites");
			rd.forward(request, response);
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
