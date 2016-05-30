package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
			UniteEnseignementDao ued = new UniteEnseignementDaoImpl();
			String action = request.getParameter("action");
			System.out.println(action);
	
			
			
		switch (action) {
		case "edit":
			Long id = Long.parseLong(request.getParameter("pk"));
			UniteEnseignement u = ued.getUniteById(id);
			String name = request.getParameter("name");
			String value = request.getParameter("value");
			switch (name) {
			case "nom" :
				u.setnom(value);
				ued.update(u);
				break;
			case "cm":
				u.setcm(Long.parseLong(value));
				ued.update(u);
				break;
			case "td":
				u.settd(Long.parseLong(value));
				ued.update(u);
				break;
			case "tp":
				u.settp(Long.parseLong(value));
				ued.update(u);
				break;
			case "ects":
				u.setects(Long.parseLong(value));
				ued.update(u);
				break;

			default:
				break;
			}
			response.getWriter().print(u.gettotal());
			break;
			
		case "delete":
			Long idD = Long.parseLong(request.getParameter("pk"));
			UniteEnseignement uD = ued.getUniteById(idD);
			ued.delete(uD);
			break;
			
		case "create":
			String nom = request.getParameter("nom");
			long cm=Long.valueOf(request.getParameter("cm")).longValue();
			long td=Long.valueOf(request.getParameter("td")).longValue();
			long tp=Long.valueOf(request.getParameter("tp")).longValue();
			long ects=Long.valueOf(request.getParameter("ects")).longValue();
			UniteEnseignement u1=new UniteEnseignement();
			u1.setnom(nom);
			u1.setcm(cm);
			u1.settd(td);
			u1.settp(tp);
			u1.setects(ects);
			System.out.println(u1.getnom());
			ued.create(u1);
			break;
			

		default:
			break;
		}//end switch

		
		
		
		if(action.equals("create"))
		{
		 RequestDispatcher rd = request.getRequestDispatcher("/DisplayUnites");
			rd.forward(request, response);
		}

		
		}catch(Exception e){
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().print("Please enter a valid value");
			e.printStackTrace();
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
