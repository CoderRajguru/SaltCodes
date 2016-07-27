package hs.Controller.Level1.Login;

import java.io.IOException;
import java.io.PrintStream;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hs.Model.Level1.Login.*;

import org.json.simple.*;
/**
 * Servlet implementation class C_L1_LoginValidate
 */
@WebServlet ("/C_L1_Login")
public class C_L1_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L1_Login() {
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
		String Password=request.getParameter("Password");
		String App_Type=request.getParameter("App");
		
	
		
		M_L1_Login Object=new M_L1_Login();
		Object.setEmail(Email);
		Object.setPassword(Password);
		request.setAttribute("Object", Object);
		boolean Status=Object.Login_Validate();
		if(Status){ 
			Object.getLoginId();
			String Customer_Type=Object.getCustomerType();
			String Name=Object.getLoggerName();
		
			System.out.print(Name);
			System.out.print(Customer_Type);
			
			
			M_L1_LoginGetName Object_Name=new M_L1_LoginGetName();
			Object_Name.setName(Name);
			Object_Name.setEmail(Email);
			M_L1_GetCustomerType Object_CustomerType=new M_L1_GetCustomerType();
			Object_CustomerType.setCustomerType(Customer_Type);
			
		
			
			request.setAttribute("Object_CustomerType", Object_CustomerType);
			request.setAttribute("Object_Name", Object_Name);
           
            RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Login/V_L1_LoginSuccess.jsp");  
           rd.forward(request, response); 
           
        }  
        else{  
           RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_Login/V_L1_LoginFail.jsp");  
            rd.forward(request, response);  
        	
        }  
		
	}
	}


