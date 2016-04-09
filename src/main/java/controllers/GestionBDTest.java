package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UniteEnseignementDaoImpl;
import entities.UniteEnseignement;

/**
 * Servlet implementation class GestionBDTest
 */
@WebServlet("/GestionBDTest")
public class GestionBDTest extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UniteEnseignement u1=new UniteEnseignement("Ingenierie logiciel", 50, 20, 20, 10, 5);
		UniteEnseignementDaoImpl ud=new UniteEnseignementDaoImpl();
		ud.create(u1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
