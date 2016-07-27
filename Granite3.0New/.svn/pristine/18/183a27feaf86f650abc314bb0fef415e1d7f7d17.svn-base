package hs.Model.Level3.FileUpload;

import java.sql.PreparedStatement;

import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

public class M_L3_FileUpload {
	
private String Patient_Email;
int Response=0;

public String getPatient_Email() {
	return Patient_Email;
}

public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}

public int FileUpload(String FileName)
{
	 System.out.println("Filename: " + FileName);
	 System.out.println("Email"+Patient_Email);
	 
	 
	 
	 Get_Login_id Object_GetLogin=new Get_Login_id();
	 int Login_Id=Object_GetLogin.Get_Login_id_Func(Patient_Email);
	 
	 Get_Patient_id Object_GetPatient_Id=new Get_Patient_id();
	 int Patient_Id=Object_GetPatient_Id.Get_Patient_id_Func(Login_Id);
	
	String Sql_UploadFile="insert into patient_doctor_records (patient_doctor_id,record_type,record_name,p_d_ind) values(?,'Txt',?,'P');";
	try {
		DBConnection Connection=new DBConnection();
		PreparedStatement Query=Connection.connection.prepareStatement(Sql_UploadFile);
		Query.setInt(1,Patient_Id);
		Query.setString(2,FileName);
		Query.executeUpdate();
		Response=1;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return Response;
}
}
