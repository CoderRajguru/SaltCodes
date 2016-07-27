package hs.Controller.Level3.Connection;

import hs.Model.Level3.Connection.M_L3_ConnectionList;
import hs.Model.Level3.Connection.M_L3_ViewConnections;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_ViewConnections
 */
@WebServlet ("/C_L3_ViewConnections")
public class C_L3_ViewConnections extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_ViewConnections() {
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
		
		String Patient_Email=request.getParameter("Email");
		M_L3_ViewConnections Object=new M_L3_ViewConnections();
		M_L3_ConnectionList Object_GetList=new M_L3_ConnectionList();
		
		Object.setPat_Email(Patient_Email);
		
		LinkedList<M_L3_ViewConnections.Node> List=new LinkedList<M_L3_ViewConnections.Node>();
		List=Object.GetDocDetails();
		
		Object_GetList.setList(List);
		
		request.setAttribute("Object", Object_GetList);
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_PatientConnection/V_L3_ViewConnections.jsp");  
        rd.forward(request, response); 
		
		
	}

}
