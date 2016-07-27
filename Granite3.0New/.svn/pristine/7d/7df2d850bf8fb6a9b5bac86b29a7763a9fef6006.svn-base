package hs.Model.Level3.RequestResponse;

import hs.Model.Level3.Connection.M_L3_ViewRequests.Node;
import hs.Other.Functions.Get_Doctor_id;
import hs.Other.Functions.Get_Login_id;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class M_L3_RequestResponse {

public int Patient_Id;
public String Status;
public int Response_Status=0;
public boolean Result;

public int getPatient_Id() {
	return Patient_Id;
}

public void setPatient_Id(int patient_Id) {
	Patient_Id = patient_Id;
}
public int SetRequestResponse(String Response,String Doc_Email)
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_id=Object_GetId.Get_Login_id_Func(Doc_Email);
	
	Get_Doctor_id Object_Doc_Id=new Get_Doctor_id();
	int Doctor_id=Object_Doc_Id.Get_Doctor_id_Func(Login_id);
	
	System.out.println(Patient_Id);
	System.out.println(Doctor_id);
	System.out.println(Response);
	System.out.println(dateFormat.format(date));
	
	
	String Sql_UpdateResponse="update doctor_request_details set status='"+Response+"' where request_id=?";
	String Sql_GetRequest_Id="select request_id from doctor_request_details where doctor_id=? and patient_id=?";
	try 
	{
		DBConnection Connection=new DBConnection();
		PreparedStatement Query_RequestId=Connection.connection.prepareStatement(Sql_GetRequest_Id);
		//Query_Response.setString(1,Response);
		Query_RequestId.setInt(1,Doctor_id);
		Query_RequestId.setInt(2,Patient_Id);
		ResultSet Result=Query_RequestId.executeQuery();
		Result.next();
		int Request_id=Result.getInt(1);
		
		PreparedStatement Query_Response=Connection.connection.prepareStatement(Sql_UpdateResponse);
		Query_Response.setInt(1, Request_id);
		Query_Response.executeUpdate();
		Response_Status=1;
		
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	
	return Response_Status;
}

}
