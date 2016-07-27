package hs.Model.Level3.FileUpload;

import hs.Model.Level3.Connection.M_L3_ViewConnections_Doc.Node;
import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L3_FileDownload {

private String Patient_Email;
int Record_id;
String Record_Name;
String Record_Type;



public String getPatient_Email() {
	return Patient_Email;
}

public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}

public LinkedList<Node> GetFileList()
{
	Get_Login_id Object_GetLoginId=new Get_Login_id();
	int Login_Id=Object_GetLoginId.Get_Login_id_Func(Patient_Email);
	
	Get_Patient_id Object_PatientId=new Get_Patient_id();
	int Patient_Id=Object_PatientId.Get_Patient_id_Func(Login_Id);
	
	LinkedList<Node> List = new LinkedList<Node>();
	
	
	String Sql_GetFiles="select * from patient_doctor_records where patient_doctor_id=?";
	try {
		DBConnection Connection=new DBConnection();
		PreparedStatement Query=Connection.connection.prepareStatement(Sql_GetFiles);
		Query.setInt(1,Patient_Id);
		ResultSet Sql_Response=Query.executeQuery();
		System.out.println("Hey");
		System.out.println(Patient_Id);
		
		while(Sql_Response.next())
		{
			Record_id=Integer.parseInt(Sql_Response.getString(1));
			Record_Name=Sql_Response.getString(4);
			Record_Type=Sql_Response.getString(3);
			
			System.out.println(Record_id);
			System.out.println(Record_Name);
			System.out.println(Record_Type);
			
			Node Element = new Node();
			Element.Record_Id=Record_id;
			Element.Record_Type=Record_Type;
			Element.Record_Name=Record_Name;
			
			List.add(Element);
			
		}
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return List;
}

public class Node
{
	public int Record_Id;
	public String Record_Type;
	public String Record_Name;
}

}
