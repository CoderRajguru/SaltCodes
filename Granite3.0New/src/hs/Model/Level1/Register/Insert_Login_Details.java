package hs.Model.Level1.Register;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
public class Insert_Login_Details {
boolean Status=false;
String Sql_LoginDetails="insert into login_details (email_id,password,CustomerType) values (?,?,?);";
	boolean Insert_Login(String Email,String Password,String Customer_Type)
	{
		try
		{
			DBConnection Object=new DBConnection();
			PreparedStatement Query=Object.connection.prepareStatement(Sql_LoginDetails);
			Query.setString(1,Email);
			Query.setString(2,Password);
			Query.setString(3,Customer_Type);
			Query.executeUpdate();
			Status=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Status;
	}
}
