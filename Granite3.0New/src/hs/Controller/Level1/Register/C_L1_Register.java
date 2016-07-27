package hs.Controller.Level1.Register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.OBJ_ADAPTER;

import hs.Model.Level1.Register.*;
/**
 * Servlet implementation class C_L1_Register
 */
public class C_L1_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L1_Register() {
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
		String Name=request.getParameter("Name");
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		String Customer_Type=request.getParameter("Customer_Type");
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(Customer_Type);
		
		M_L1_Register Object=new M_L1_Register();
		Object.setEmail(Email);
		Object.setName(Name);
		Object.setPassword(Password);
		Object.setCustomer_Type(Customer_Type);
		request.setAttribute("Object", Object);
		int Response=Object.Confirm_Register();
		
		if(Response==0)
		{
			 RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Register/V_L1_RegFailDuplicate.jsp");  
	         rd.forward(request, response);
		}
		else if(Response==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Register/V_L1_RegFailInsert.jsp");  
	         rd.forward(request, response);
		}
		
		else if(Response==2)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Register/V_L1_RegFailInsert.jsp");  
	         rd.forward(request, response);
		}
		else if(Response==100)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Register/V_L1_RegistrationSuccess.jsp");  
		//	RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Verification/V_L1_Vrfcn_Regn.jsp");  
			
	         rd.forward(request, response);
		}
		
		
	}

}
