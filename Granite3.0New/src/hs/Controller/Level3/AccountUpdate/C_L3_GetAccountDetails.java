package hs.Controller.Level3.AccountUpdate;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import hs.Model.Level3.AccountUpdate.*;
/**
 * Servlet implementation class C_L3_GetAccountDetails
 */
public class C_L3_GetAccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_GetAccountDetails() {
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
	String Email=request.getParameter("Email");
/*	M_L3_GetAccountDetails Object=new M_L3_GetAccountDetails();
	Object.setEmail(Email);

	

	boolean Response=Object.CheckId();
	System.out.print(Response);
	if(Response)
	{
		Object.GetDetails(Email);
		request.setAttribute("Object_GetDetails", Object);
		System.out.print(Object);
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_AccountUpdate/V_L3_ShowAccount.jsp");  
        rd.forward(request, response);  
	}
	else
	{*/
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_AccountUpdate_Patient/V_L3_EditAccount.jsp");  
	    rd.forward(request, response);  
	
	
	
	}

}
