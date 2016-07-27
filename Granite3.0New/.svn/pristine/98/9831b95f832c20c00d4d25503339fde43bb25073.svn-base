package hs.Model.Level3.SendMessage;

import hs.Model.Level3.Connection.M_L3_ViewConnections.Node;
import hs.Other.Functions.Get_Login_id;
import hs.Other.Functions.Get_Patient_id;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L3_ViewConversation {
	
public String Patient_Email;
String Sender;
String MessageDate;
String Message;
int Doctor_Id;

public String getPatient_Email() {
	return Patient_Email;
}

public void setPatient_Email(String patient_Email) {
	Patient_Email = patient_Email;
}

public LinkedList<Node> GetConversation(int Doctor_Id)
{
	Get_Login_id Object_GetId=new Get_Login_id();
	int Login_Id=Object_GetId.Get_Login_id_Func(Patient_Email);
	
	Get_Patient_id Object_GetPatient_Id=new Get_Patient_id();
	int Patient_Id=Object_GetPatient_Id.Get_Patient_id_Func(Login_Id);
	
	M_L3_MsgLinkId Object_GetLink_Id=new M_L3_MsgLinkId();
	int Msg_Link_Id=Object_GetLink_Id.GetMSgLink_Id(Patient_Id,Doctor_Id);
	
	String Sql_GetConversation="select * from patient_doctor_messages where msg_link_id=?";
	LinkedList<Node> List = new LinkedList<Node>();
	
	try {
		DBConnection Connection=new DBConnection();
		PreparedStatement Query=Connection.connection.prepareStatement(Sql_GetConversation);
		Query.setInt(1, Msg_Link_Id);
		ResultSet Sql_Response=Query.executeQuery();
		
		while(Sql_Response.next())
		{
			Sender=Sql_Response.getString(3);
			if(Sender.equals("P"))
			{
				Sender="You";
			}
			else
			{
				Sender="Doctor";
			}
			MessageDate=Sql_Response.getString(5);
			Message=Sql_Response.getString(6);
			
			Node Element = new Node();
			Element.Sender=Sender;
			Element.Send_Date=MessageDate;
			Element.Message=Message;
			Element.Doctor_id=Doctor_Id;
			List.add(Element);
		}
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return List;
}

public class Node
{
	public String Sender;
	public String Send_Date;
	public String Message;
	public int Doctor_id;
}
}
