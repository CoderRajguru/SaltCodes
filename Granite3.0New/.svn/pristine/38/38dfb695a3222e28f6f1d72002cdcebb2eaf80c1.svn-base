package hs.Model.Level3.SendMessage;

import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

public class M_L3_SendMessage {

public int Response=0;
public String Patient_Email;

public String getPatient_Email() {
	return Patient_Email;
}

public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}

public int SendMessage(int Doc_Id,String Message)
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_Id=Object_GetId.Get_Login_id_Func(Patient_Email);
	
	Get_Patient_id Object_PatId=new Get_Patient_id();
	int Patient_Id=Object_PatId.Get_Patient_id_Func(Login_Id);
	
	
	
	M_L3_MsgLinkId Object_CheckMsgLink=new M_L3_MsgLinkId();
	int Msg_Link_Id=Object_CheckMsgLink.GetMSgLink_Id(Patient_Id, Doc_Id);
	
	System.out.print("MSLD "+Msg_Link_Id);
	
	if(Msg_Link_Id==0)
	{
		M_L3_InsertMsgLinkId Object_Link_Id=new M_L3_InsertMsgLinkId();
		Object_Link_Id.InsertMsgLink(Doc_Id,Patient_Id);
		
		Msg_Link_Id=Object_CheckMsgLink.GetMSgLink_Id(Patient_Id, Doc_Id);	
	}
	
	
	
	String Sql_InsertMessage="insert into patient_doctor_messages (msg_link_id,p_d_ind,msg_time,message) values(?,'P','"+dateFormat.format(date)+"',?)";
	
	
	try {
		 DBConnection Connection= new DBConnection();
		 PreparedStatement Query=Connection.connection.prepareStatement(Sql_InsertMessage);
		 Query.setInt(1,Msg_Link_Id);
		 Query.setString(2,Message);
		 Query.executeUpdate();
		 Response=1;
		 
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
return Response;	
}
}
