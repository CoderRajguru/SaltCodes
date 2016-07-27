package hs.Model.Level3.SendMessage;

import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class M_L3_InsertMsgLinkId 
{
boolean Status=false;
public boolean InsertMsgLink(int Doctor_Id,int Patient_Id)
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	String Sql_InsertMsgLink_Id="insert into patient_doctor_message_link (doctor_id,patient_id,intiator,initiated_time) values(?,?,'P','"+dateFormat.format(date)+"')";
	try {
		 DBConnection Connection=new DBConnection();
		 PreparedStatement Query=Connection.connection.prepareStatement(Sql_InsertMsgLink_Id);
		 Query.setInt(1, Doctor_Id);
		 Query.setInt(2, Patient_Id);
		 Query.executeUpdate();
		 Status=true;
		 
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return Status;
}
}
