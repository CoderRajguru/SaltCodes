package hs.Model.Level3.AccountUpdate;

import java.sql.PreparedStatement;


import java.sql.ResultSet;

import hs.dbConnection.*;
import hs.Other.Functions.*;
public class M_L3_GetAccountDetails {
	
	private String Email;
	public boolean Response=true;
	int login_id;
	public AccountDetails Acc_Details;
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean CheckId()
	{
		System.out.print(Email);
		
		Get_Login_id Object_getId=new Get_Login_id();
		login_id=Object_getId.Get_Login_id_Func(Email);
		String Sql_Check="select patient_bkey from patient_details where login_id=?";
		try
		{
			DBConnection Connection=new DBConnection();
				PreparedStatement Query=Connection.connection.prepareStatement(Sql_Check);
			Query.setInt(1, login_id);
			ResultSet Sql_Response=Query.executeQuery();
			Sql_Response.next();
			
			String Customer_id=Sql_Response.getString(1);
			
			if(Customer_id.length()<=1)
			{
				Response=false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Response;
	}
	public void GetDetails(String Email)
	{
		
		Get_Login_id Object_getId=new Get_Login_id();
		login_id=Object_getId.Get_Login_id_Func(Email);
		String Sql_GetDetails="select * from patient_details where login_id=?";
		
		try {
			DBConnection Connection=new DBConnection();
			PreparedStatement Query=Connection.connection.prepareStatement(Sql_GetDetails);
			Query.setInt(1,login_id);
			
			System.out.println(login_id);
			
			ResultSet Sql_Response=Query.executeQuery();
			if(Sql_Response.next())
			{
				Acc_Details.First_Name=Sql_Response.getString(5);
				Acc_Details.Middle_Name=Sql_Response.getString(6);
				Acc_Details.Last_Name=Sql_Response.getString(7);
				Acc_Details.Gender_id=Sql_Response.getString(8);
				Acc_Details.Address_1=Sql_Response.getString(9);
				Acc_Details.Address_2=Sql_Response.getString(10);
				Acc_Details.geo_id=Integer.parseInt(Sql_Response.getString(11));
				Acc_Details.ZipCode=Sql_Response.getString(12);
				Acc_Details.phone_number=Integer.parseInt(Sql_Response.getString(13));
				Acc_Details.dob=Sql_Response.getString(15);
				Acc_Details.Updation_Date=Sql_Response.getString(17);
				
				System.out.println(Acc_Details.First_Name);
				System.out.println(Acc_Details.Middle_Name);
				System.out.println(Acc_Details.Last_Name);
				System.out.println(Acc_Details.Gender_id);
				System.out.println(Acc_Details.Address_1);
				System.out.println(Acc_Details.Address_2);
				System.out.println(Acc_Details.geo_id);
				System.out.println(Acc_Details.ZipCode);
				System.out.println(Acc_Details.phone_number);
				System.out.println(Acc_Details.dob);
				System.out.println(Acc_Details.Updation_Date);
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public class AccountDetails
	{
		String First_Name;
		String Middle_Name;
		String Last_Name;
		String Gender_id;
		String Address_1;
		String Address_2;
		int geo_id;
		int identiication_integer;
		String identification_number;
		String ZipCode;
		int phone_number;
		String dob;
		String Updation_Date;
		
	}
}


