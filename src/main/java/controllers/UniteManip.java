package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UniteEnseignementDao;
import daos.UniteEnseignementDaoImpl;
import entities.UniteEnseignement;

public class UniteManip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
		String action = request.getParameter("action");
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		Long id = Long.parseLong(request.getParameter("pk"));
		UniteEnseignementDao ued = new UniteEnseignementDaoImpl();
		UniteEnseignement u = ued.getUniteById(id);
		switch (action) {
		case "edit":
			switch (name) {
			case "cm":
				u.setCM_unite(Long.parseLong(value));
				ued.update(u);
				break;
			case "td":
				u.setTD_unite(Long.parseLong(value));
				ued.update(u);
				break;
			case "tp":
				u.setTP_unite(Long.parseLong(value));
				ued.update(u);
				break;
			case "ects":
				u.setECTS_unite(Long.parseLong(value));
				ued.update(u);
				break;

			default:
				break;
			}
			break;
			
		case "delete":
			ued.delete(u);
			break;

		default:
			break;
		}//end switch

		response.getWriter().print(u.getTotal_unite());
		}catch(Exception e){
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().print("Please enter a valid value");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
