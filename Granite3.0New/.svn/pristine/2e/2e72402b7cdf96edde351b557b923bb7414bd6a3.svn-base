package hs.Model.Level3.Connection;

import hs.Model.Level3.Connection.M_L3_ViewConnections.Node;
import hs.Other.Functions.Get_Doctor_id;
import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L3_ViewConnections_Doc {
	
public String Doc_Email;
public int Doctor_Id;
public String Patient_Name,Gender;
public int Patient_Id;
public int Pat_Contact;
public String Status;

public String getDoc_Email() {
	return Doc_Email;
}

public void setDoc_Email(String doc_Email) {
	Doc_Email = doc_Email;
}

public LinkedList<Node> GetPatientDetails()
{
	
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_Id=Object_GetId.Get_Login_id_Func(Doc_Email);
	
	Get_Doctor_id Object_GetDoc_id=new Get_Doctor_id();
	Doctor_Id=Object_GetDoc_id.Get_Doctor_id_Func(Login_Id);
	
	LinkedList<Node> List = new LinkedList<Node>();
	String Sql_SearchRequest="select * from doctor_request_details where doctor_id=? and status='A'";
	String Sql_PatientDetails="select * from patient_details where patient_id=?";
	try 
	{
		DBConnection Object=new DBConnection();
		PreparedStatement Query_Search=Object.connection.prepareStatement(Sql_SearchRequest);
		Query_Search.setInt(1,Doctor_Id);
		ResultSet Sql_Response=Query_Search.executeQuery();
		System.out.print("Hello");
		while(Sql_Response.next())
		{
			Patient_Id=Integer.parseInt(Sql_Response.getString(3));
			Status=Sql_Response.getString(6);
			
			System.out.println("Pid"+Patient_Id);
			
			PreparedStatement Query_GetPatientDetails=Object.connection.prepareStatement(Sql_PatientDetails);
			Query_GetPatientDetails.setInt(1,Patient_Id);
			ResultSet Sql_Response_Details=Query_GetPatientDetails.executeQuery();
		
			
			while(Sql_Response_Details.next())
				{
			
				Patient_Name=Sql_Response_Details.getString(5)+" "+ Sql_Response_Details.getString(6)+" "+Sql_Response_Details.getString(7);
				Gender=Sql_Response_Details.getString(8);
				Pat_Contact=Integer.parseInt(Sql_Response_Details.getString(13));
				
				System.out.println("N"+Patient_Name);
				System.out.println("D"+Gender);
				System.out.println("C"+Pat_Contact);
				
				Node Element = new Node();
				Element.Status=Status;
				Element.Name=Patient_Name;
				Element.Gender=Gender;
				Element.Contact=Pat_Contact;
				Element.Patient_Id=Patient_Id;
				List.add(Element);
				}
			
			}
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	
	
	return List;
}
public class Node
{
	public String Status;
	public String Name;
	public String Gender;
	public int Contact;
	public int Patient_Id;
}

}

