package hs.Controller.Level3.Connection;


import hs.Model.Level3.Connection.M_L3_ConnectionList_Doc;
import hs.Model.Level3.Connection.M_L3_ViewConnections_Doc;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_ViewConnections_Doc
 */
@WebServlet ("/C_L3_ViewConnections_Doc")
public class C_L3_ViewConnections_Doc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public C_L3_ViewConnections_Doc() {
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

		String Doc_Email=request.getParameter("Email");
		M_L3_ViewConnections_Doc Object=new M_L3_ViewConnections_Doc();
		M_L3_ConnectionList_Doc Object_GetList=new M_L3_ConnectionList_Doc();

		Object.setDoc_Email(Doc_Email);

		LinkedList<M_L3_ViewConnections_Doc.Node> List=new LinkedList<M_L3_ViewConnections_Doc.Node>();
		List=Object.GetPatientDetails();

		Object_GetList.setList(List);

		request.setAttribute("Object", Object_GetList);
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_DoctorConnections/V_L3_ViewConnections.jsp");  
		rd.forward(request, response); 

	}

}
