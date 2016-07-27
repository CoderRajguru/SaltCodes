package hs.Controller.Level3.AccountUpdate;

import java.io.IOException;


import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hs.Model.Level3.AccountUpdate.*;
/**
 * Servlet implementation class C_L3_AccountUpdate
 */
public class C_L3_AccountUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_AccountUpdate() {
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
		String first_name=request.getParameter("first_name");
		String middle_name=request.getParameter("middle_name");
		String last_name=request.getParameter("last_name");
		String gender_id=request.getParameter("gender");
		String address_1=request.getParameter("address1");
		String address_2=request.getParameter("address2");
		String zipcode=request.getParameter("zipcode");
		int Phone=Integer.parseInt(request.getParameter("phone_number"));
		String DOB=request.getParameter("DOB");
		String Country=request.getParameter("country");
		String State=request.getParameter("statec");
		String City=request.getParameter("city");
		System.out.println(Email);
		System.out.println(first_name);
		System.out.println(middle_name);
		System.out.println(last_name);
		System.out.println(gender_id);
		System.out.println(address_1);
		System.out.println(address_2);
		System.out.println(zipcode);
		System.out.println(Phone);
		System.out.println(DOB);
		System.out.println(Country);
		System.out.println(State);
		System.out.println(City);
	
		
		int phonenumber=Integer.parseInt(request.getParameter("phone_number"));
		
		System.out.print(Email);
		
		M_L3_AccountUpdate Object=new M_L3_AccountUpdate();
		Object.setFirst_name(first_name);
		Object.setMiddle_name(middle_name);
		Object.setLast_name(last_name);
		Object.setGender_id(gender_id);
		Object.setAddress_1(address_1);
		Object.setAddress_2(address_2);
		Object.setZipcode(zipcode);
		Object.setPhonenumber(phonenumber);
		
		boolean Response=Object.InsertData(Email);
		
		System.out.print(Response);
		
		if(Response)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_AccountUpdate_Patient/V_L3_UpdateSuccess.jsp");  
	        rd.forward(request, response);
			
		}
		else
		{
			
		}
		
		
		
		
		
	}

}
