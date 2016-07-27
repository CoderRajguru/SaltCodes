package hs.Model.Level3.Connection;

import hs.Model.Level1.Map.M_L1_Map.Node;

import hs.dbConnection.DBConnection;
import hs.Other.Functions.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L3_ViewRequests {
	
	private String Email;
	int Patient_id;
	String Status;
	String Patient_Name,Gender;
	int Patient_Contact;
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public LinkedList<Node> GetRequestDetails()
	{
		LinkedList<Node> List = new LinkedList<Node>();
		
		Get_Login_id Object_GetId=new Get_Login_id();
		int Login_id=Object_GetId.Get_Login_id_Func(Email);
		
		Get_Doctor_id Object_GetDoctorId=new Get_Doctor_id();
		int Doctor_id=Object_GetDoctorId.Get_Doctor_id_Func(Login_id);
		
		String Sql_SearchRequest="select * from doctor_request_details where doctor_id=? and status='R' ";
		String Sql_PatientDetails="select * from patient_details where patient_id=?";
		try
		{
			DBConnection Object=new DBConnection();
			PreparedStatement Query_Search=Object.connection.prepareStatement(Sql_SearchRequest);
			Query_Search.setInt(1,Doctor_id);
			ResultSet Sql_Response=Query_Search.executeQuery();
			System.out.print("Hello");
			while(Sql_Response.next())
			{
			Patient_id=Integer.parseInt(Sql_Response.getString(3));
			Status=Sql_Response.getString(6);
			
			System.out.println("Pid"+Patient_id);
			
			PreparedStatement Query_GetPatientDetails=Object.connection.prepareStatement(Sql_PatientDetails);
			Query_GetPatientDetails.setInt(1,Patient_id);
			ResultSet Sql_Response_Details=Query_GetPatientDetails.executeQuery();
			
			while(Sql_Response_Details.next())
				{
			
				Patient_Name=Sql_Response_Details.getString(5)+" "+ Sql_Response_Details.getString(6)+" "+Sql_Response_Details.getString(7);
				Gender=Sql_Response_Details.getString(8);
				Patient_Contact=Integer.parseInt(Sql_Response_Details.getString(2));
				
				System.out.println("N"+Patient_Name);
				System.out.println("G"+Gender);
				System.out.println("C"+Patient_Contact);
				
				Node Element = new Node();
				Element.Status=Status;
				Element.Name=Patient_Name;
				Element.Gender=Gender;
				Element.Contact=Patient_Contact;
				Element.Pat_id=Patient_id;
				List.add(Element);
				}
			}
		
			
			
}
	catch(Exception E)
	{
		E.printStackTrace();
	}
		/*
		  	Iterator<Node> Data=List.iterator();
		
			while (Data.hasNext()) 
			{
				Node Ref=Data.next();
				System.out.println(Ref.Name);
				System.out.print(Ref.Department);
				System.out.print(Ref.Contact);
			}
		
			*/
		return List;
		
	}
	
	public class Node
	{
		public String Status;
		public String Name;
		public String Gender;
		public int Contact;
		public int Pat_id;
	}
}
