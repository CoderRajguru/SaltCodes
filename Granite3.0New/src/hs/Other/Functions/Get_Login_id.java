package hs.Other.Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;

public class Get_Login_id {
	
	int login_id;
	
	public int Get_Login_id_Func(String Email) {
		
		String Sql_GetLoginId="select login_id from login_details where email_id=?";
		
		try {
			DBConnection object=new DBConnection();
			PreparedStatement Query=object.connection.prepareStatement(Sql_GetLoginId);
	    	Query.setString(1,Email);
	    	
	    	ResultSet Sql_Response=Query.executeQuery();
	    	Sql_Response.next();
	    	login_id=Integer.parseInt(Sql_Response.getString(1));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return login_id;
	}

}
