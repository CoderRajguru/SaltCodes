package hs.Model.Level3.Connection;

import hs.Model.Level3.Connection.M_L3_ViewRequests.Node;
import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L3_ViewConnections {

public int Patient_Id;
public String Doctor_Name,Department;
public int Doctor_Id;
public int Doc_Contact;
public String Status;
public String Pat_Email;

public String getPat_Email() {
	return Pat_Email;
}
public void setPat_Email(String pat_Email) {
	Pat_Email = pat_Email;
}

public LinkedList<Node> GetDocDetails()
{
	
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_Id=Object_GetId.Get_Login_id_Func(Pat_Email);
	
	Get_Patient_id Object_GetPat_id=new Get_Patient_id();
	Patient_Id=Object_GetPat_id.Get_Patient_id_Func(Login_Id);
	
	LinkedList<Node> List = new LinkedList<Node>();
	String Sql_SearchRequest="select * from doctor_request_details where patient_id=? and status='A'";
	String Sql_DoctorDetails="select * from doctor_details where doctor_id=?";
	try 
	{
		DBConnection Object=new DBConnection();
		PreparedStatement Query_Search=Object.connection.prepareStatement(Sql_SearchRequest);
		Query_Search.setInt(1,Patient_Id);
		ResultSet Sql_Response=Query_Search.executeQuery();
		System.out.print("Hello");
		while(Sql_Response.next())
		{
		Doctor_Id=Integer.parseInt(Sql_Response.getString(2));
		Status=Sql_Response.getString(6);
		
		System.out.println("Did"+Doctor_Id);
		
		PreparedStatement Query_GetDoctorDetails=Object.connection.prepareStatement(Sql_DoctorDetails);
		Query_GetDoctorDetails.setInt(1,Doctor_Id);
		ResultSet Sql_Response_Details=Query_GetDoctorDetails.executeQuery();
		
		while(Sql_Response_Details.next())
			{
		
			Doctor_Name=Sql_Response_Details.getString(3)+" "+ Sql_Response_Details.getString(4)+" "+Sql_Response_Details.getString(5);
			Department=Sql_Response_Details.getString(13);
			Doc_Contact=Integer.parseInt(Sql_Response_Details.getString(12));
			
			System.out.println("N"+Doctor_Name);
			System.out.println("D"+Department);
			System.out.println("C"+Doc_Contact);
			
			Node Element = new Node();
			Element.Status=Status;
			Element.Name=Doctor_Name;
			Element.Department=Department;
			Element.Contact=Doc_Contact;
			Element.Doc_id=Doctor_Id;
			List.add(Element);
			}
		
		}
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
	}
	
	
	return List;
}
public class Node
{
	public String Status;
	public String Name;
	public String Department;
	public int Contact;
	public int Doc_id;
}

}
