package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;

import bean.Techtitans;

/**
 * Servlet implementation class Control
 */
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
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
		Techtitans f=new Techtitans();
		Service s=new Service();
		f.setEmail(request.getParameter("email"));
		f.setFirstname(request.getParameter("name"));
		f.setLastname(request.getParameter("nam"));
		f.setQualifications(request.getParameter("qua"));
		f.setTechnology(request.getParameter("tec"));
		f.setContact_number(request.getParameter("contact"));
		f.setProfile(request.getParameter("profile"));
		f.setGender(request.getParameter("gender"));
		int h=0;
		h=s.adddetails(f);
		RequestDispatcher rs=request.getRequestDispatcher("Confirmation.html");
		rs.forward(request, response);
		System.out.println("Delete");
	}
}
