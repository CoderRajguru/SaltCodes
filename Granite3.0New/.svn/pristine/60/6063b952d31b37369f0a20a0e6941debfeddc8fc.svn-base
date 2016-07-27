package hs.Controller.Level3.SendMessage;

import hs.Model.Level3.SendMessage.M_L3_SendMessage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_SendMessage
 */
public class C_L3_SendMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_SendMessage() {
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
	String Message=request.getParameter("Message");
	int Doc_Id=Integer.parseInt(request.getParameter("Doctor_Id"));
	String Pat_Email=request.getParameter("Pat_Email");
	
	
	
	M_L3_SendMessage Object=new M_L3_SendMessage();
	Object.setPatient_Email(Pat_Email);
	int Status=Object.SendMessage(Doc_Id, Message);
	
	if(Status==1)
	{
		System.out.print("Done");
	}
	
	}
	

}
