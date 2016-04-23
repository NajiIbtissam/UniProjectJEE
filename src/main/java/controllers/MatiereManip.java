package controllers;

import java.io.IOException;
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
			String name = request.getParameter("name");
			String value = request.getParameter("value");
			Long id = Long.parseLong(request.getParameter("pk"));
			MatiereDao ued = new MatiereDaoImpl();
			Matiere u = ued.getMatiereById(id);
			switch (action) {
			case "edit":
				switch (name) {
				case "cm":
					u.setCM_matiere(Long.parseLong(value));
					ued.update(u);
					break;
				case "td":
					u.setTD_matiere(Long.parseLong(value));
					ued.update(u);
					break;
				case "tp":
					u.setTP_matiere(Long.parseLong(value));
					ued.update(u);
					break;
				case "ects":
					u.setECTS_matiere(Long.parseLong(value));
					ued.update(u);
					break;

				default:
					break;
				}
				break;

			default:
				break;
			}

			response.getWriter().print(u.getTotal_matiere());
			}catch(Exception e){
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().print("Please enter a valid value");
			}
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
