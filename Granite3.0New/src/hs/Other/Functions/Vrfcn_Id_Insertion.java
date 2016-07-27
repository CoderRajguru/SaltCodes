package hs.Other.Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
import hs.Other.Functions.*;

public class Vrfcn_Id_Insertion {
	
	public void Vrfcn_Id_Insert(String Email,String Verification_id)
	{

		System.out.println("Inser function");	
String Sql_Insert="select login_verification_func(?,?,?)";
		try {
			DBConnection object=new DBConnection();
			System.out.println("Inn Connect");
			Get_Login_id get_Login_Object=new Get_Login_id();
			int login_id=get_Login_Object.Get_Login_id_Func(Email);
			
			PreparedStatement Query=object.connection.prepareStatement(Sql_Insert);
			Query.setInt(1,login_id);
			Query.setString(2,Verification_id);
			Query.setString(3,"N");
			ResultSet Sql_response=Query.executeQuery();
			boolean status=Sql_response.next();
			System.out.println(status);
			
			
		} catch (Exception e) {
			
		}
		
		
	}

}
