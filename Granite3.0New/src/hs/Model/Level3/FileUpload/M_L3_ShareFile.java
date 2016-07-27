package hs.Model.Level3.FileUpload;

import java.sql.PreparedStatement;

import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;


public class M_L3_ShareFile {

private String Patient_Email;
private int Record_Id;
private int Doctor_Id;

int Response=0;

public int getRecord_Id() {
	return Record_Id;
}
public void setRecord_Id(int record_Id) {
	Record_Id = record_Id;
}
public int getDoctor_Id() {
	return Doctor_Id;
}
public void setDoctor_Id(int doctor_Id) {
	Doctor_Id = doctor_Id;
}

public String getPatient_Email() {
	return Patient_Email;
}
public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}

public int ShareFile()
{
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_Id=Object_GetId.Get_Login_id_Func(Patient_Email);
	
	Get_Patient_id Object_Patient_Id=new Get_Patient_id();
	int Patient_id=Object_Patient_Id.Get_Patient_id_Func(Login_Id);
	
	String Sql_ShareFile="insert into pd_record_shared_details (shared_by_ind,shared_by_id,shared_by_record_id,shared_to_ind) values('P',?,?,'D')";
	
	try 
	{
		DBConnection Connection=new DBConnection();
		PreparedStatement Query=Connection.connection.prepareStatement(Sql_ShareFile);
		Query.setInt(1,Patient_id);
		Query.setInt(2,Record_Id);
		Query.executeUpdate();
		Response=1;
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}

return Response;
}


}
