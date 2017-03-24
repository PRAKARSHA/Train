package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

import bean.Techtitans;

/**
 * Servlet implementation class Controll
 */
public class Controll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ArrayList<Techtitans> a=new ArrayList<Techtitans>();
		Techtitans t=new Techtitans();
		String g=request.getParameter("name");
		Service f=new Service();
		a=f.delete(g);
		request.setAttribute("deta",a);
		RequestDispatcher rd=request.getRequestDispatcher("deletee.jsp");
		rd.forward(request, response);
		System.out.println("control");
		
		
	
	}

}
