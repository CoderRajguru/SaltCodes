package hs.Model.Level1.Register;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
public class Check_Duplicate_Login {

	boolean Valid=true;
	String Sql_Get_Email_id="select email_id from login_details where email_id=?";
	boolean Check_Duplicate(String Email)
	{
		System.out.println(Email);
		try
		{
			DBConnection Object=new DBConnection();
			PreparedStatement Query=Object.connection.prepareStatement(Sql_Get_Email_id);
			Query.setString(1,Email);
			ResultSet Sql_Response=Query.executeQuery();
			while(Sql_Response.next())
				{
					Valid=false;
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Valid;
	}
}
