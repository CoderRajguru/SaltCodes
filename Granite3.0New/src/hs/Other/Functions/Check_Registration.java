package hs.Other.Functions;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
public class Check_Registration {
boolean Status;
	public boolean check_email(String Email)
	{
		String Sql_Valid="select email_id from login_details where email_id=? ";
		try {
			
			DBConnection object=new DBConnection();
			PreparedStatement Query=object.connection.prepareStatement(Sql_Valid);
	    	Query.setString(1,Email);
	    	
	    	ResultSet Sql_Response=Query.executeQuery();
	    	Status=Sql_Response.next();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		return Status;
	}
}
