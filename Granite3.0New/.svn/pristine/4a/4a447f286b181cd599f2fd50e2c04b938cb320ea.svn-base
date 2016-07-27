package hs.Controller.Level3.RequestResponse;

import hs.Model.Level3.RequestResponse.M_L3_RequestResponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_RequestResponse
 */
@WebServlet ("/C_L3_RequestResponse")
public class C_L3_RequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_RequestResponse() {
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
		String Response=request.getParameter("Response");
		int Patient_id=Integer.parseInt(request.getParameter("Patient_Id"));
		String Doc_Email=request.getParameter("Doc_Email");
				
		
		System.out.println(Response);
		System.out.println(Patient_id);
		System.out.println(Doc_Email);
		
		M_L3_RequestResponse Object=new M_L3_RequestResponse();
		Object.setPatient_Id(Patient_id);
		
		if(Response.equals("Confirm"))
		{
			Response="A";
		}
		else if(Response.equals("Reject"))
		{
			Response="X";
		}
		
		int Response_Status=Object.SetRequestResponse(Response, Doc_Email);
		if(Response_Status==1)
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("NotDone");
		}
		
		
		
	}

}
