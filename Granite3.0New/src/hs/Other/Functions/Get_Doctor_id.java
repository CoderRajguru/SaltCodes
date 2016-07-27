package hs.Other.Functions;

import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Get_Doctor_id {
	
	int Doctor_id;
	
public int Get_Doctor_id_Func(int Login_Id) {
		
		String Sql_GetLoginId="select doctor_id from doctor_details where login_id=?";
		
		try {
			DBConnection object=new DBConnection();
			PreparedStatement Query=object.connection.prepareStatement(Sql_GetLoginId);
	    	Query.setInt(1,Login_Id);
	    	
	    	ResultSet Sql_Response=Query.executeQuery();
	    	Sql_Response.next();
	    	Doctor_id=Integer.parseInt(Sql_Response.getString(1));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Doctor_id;
	}


}
