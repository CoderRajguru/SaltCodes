package hs.Model.Level3.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import hs.dbConnection.*;
import hs.Other.Functions.*;
public class M_L3_ConnectionRequest {

boolean Response=false;
int Patient_Login_id;
int Patient_id;
private String Patient_Email;
private int Doc_Login_id;
public String getPatient_Email() {
	return Patient_Email;
}
public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}
public int getDoc_Login_id() {
	return Doc_Login_id;
}
public void setDoc_Login_id(int doc_Login_id) {
	Doc_Login_id = doc_Login_id;
}

public boolean SendRequest()
{
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();	
	
Get_Login_id Object_GetId=new Get_Login_id();
Patient_Login_id=Object_GetId.Get_Login_id_Func(Patient_Email);
Get_Patient_id Object_GetPat_id=new Get_Patient_id();
Patient_id=Object_GetPat_id.Get_Patient_id_Func(Patient_Login_id);
System.out.print(Patient_Login_id);
System.out.print(dateFormat.format(date));
String Sql_SendRequestData="insert into doctor_request_details (doctor_id,patient_id,request_date,status) values (?,?,'"+dateFormat.format(date)+"','R');";
try {
	DBConnection Connection=new DBConnection();
	PreparedStatement Query=Connection.connection.prepareStatement(Sql_SendRequestData);
	Query.setInt(1,Doc_Login_id);
	Query.setInt(2,Patient_id);
	System.out.print("Hello");
	Query.executeUpdate();
	
	Response=true;
	
	
} catch (Exception e) {
	// TODO: handle exception
}
return Response;	
}

}
