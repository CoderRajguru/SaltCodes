package hs.Controller.Level3.Connection;

import java.io.IOException;

import javax.ejb.SessionBean;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hs.Model.Level3.Connection.*;
/**
 * Servlet implementation class C_L3_ConnectionRequest
 */
@WebServlet ("/C_L3_ConnectionRequest")
public class C_L3_ConnectionRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_ConnectionRequest() {
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
		int Doc_LoginId=Integer.parseInt(request.getParameter("Doc_Login_id"));
		String Patient_Email=request.getParameter("Patient_Email");
		M_L3_ConnectionRequest Object=new M_L3_ConnectionRequest();
		Object.setDoc_Login_id(Doc_LoginId);
		Object.setPatient_Email(Patient_Email);
		boolean Response=Object.SendRequest();
		System.out.print(Patient_Email);
		System.out.print(Doc_LoginId);
		System.out.print(Response);
		
		if(Response)
		{
			System.out.print("Success");
		}
		else
		{
			System.out.print("Not Success");
		}
	}

}
