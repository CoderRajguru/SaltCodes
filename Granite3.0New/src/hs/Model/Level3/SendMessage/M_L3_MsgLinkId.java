package hs.Model.Level3.SendMessage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.DBConnection;

public class M_L3_MsgLinkId {

int Msg_LinkId;
	
public int GetMSgLink_Id(int Patient_Id,int Doctor_Id)
{

	String Sql_CheckMsgLink="select msg_link_id from patient_doctor_message_link where patient_id=? and doctor_id=?";
	try {
		 	DBConnection Connection=new DBConnection();
		 	PreparedStatement Query=Connection.connection.prepareStatement(Sql_CheckMsgLink);
		 	Query.setInt(1, Patient_Id);
		 	Query.setInt(2, Doctor_Id);
		 	ResultSet sql_Response=Query.executeQuery();
		 	System.out.print("tRUE");
		 	if(sql_Response.next())
		 	{
		 		Msg_LinkId=Integer.parseInt(sql_Response.getString(1));
		 	}
		 	else
		 	{
		 		Msg_LinkId=0;
		 	}
		 	
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return Msg_LinkId;
}

}
