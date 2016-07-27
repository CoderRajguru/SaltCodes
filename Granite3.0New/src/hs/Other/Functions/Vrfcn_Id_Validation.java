package hs.Other.Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
public class Vrfcn_Id_Validation{
	boolean Status;
	public boolean Verify_Id(String Email,String Verification_Id)
	{
		String Sql_Validate="select * from login_verification_details where login_id=? and verification_code=?";
		try {
			DBConnection object=new DBConnection();
			
			Get_Login_id get_Login_Object=new Get_Login_id();
			int login_id=get_Login_Object.Get_Login_id_Func(Email);
			
			PreparedStatement Query=object.connection.prepareStatement(Sql_Validate);
			Query.setInt(1,login_id);
			Query.setString(2,Email);
			ResultSet Sql_Response=Query.executeQuery();
			Status=Sql_Response.next();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Status;
	}

}
