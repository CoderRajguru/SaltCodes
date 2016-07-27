package hs.Controller.Level3.Connection;

import hs.Model.Level1.Map.M_L1_Map;
import hs.Model.Level3.Connection.M_L3_GetPatientList;
import hs.Model.Level3.Connection.M_L3_ViewRequests;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_ViewRequests
 */
public class C_L3_ViewRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_ViewRequests() {
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
		
		String Doc_Email=request.getParameter("Email");
		M_L3_ViewRequests Object=new M_L3_ViewRequests();
		M_L3_GetPatientList Object_GetList=new M_L3_GetPatientList();
		Object.setEmail(Doc_Email);
		
		LinkedList<M_L3_ViewRequests.Node> List=new LinkedList<M_L3_ViewRequests.Node>();
		
		List=Object.GetRequestDetails();
		Object_GetList.setList(List);
		
		Iterator<M_L3_ViewRequests.Node> Data=List.iterator();
		
		while (Data.hasNext()) 
		{
			M_L3_ViewRequests.Node Ref=Data.next();
			System.out.println(Ref.Status);
			System.out.println(Ref.Name);
			System.out.print(Ref.Gender);
			System.out.print(Ref.Contact);
		}
		
		request.setAttribute("Object", Object_GetList);
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_DoctorConnections/V_L3_ViewConnectRequest.jsp");  
        rd.forward(request, response); 
		
	}

}
