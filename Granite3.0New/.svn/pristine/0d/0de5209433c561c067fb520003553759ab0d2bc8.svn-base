package hs.Model.Level1.Login;

import java.sql.*;


import hs.dbConnection.*; 
public class M_L1_Login {

private String Email,Password;
boolean Status;
public String Customer_Type;
public String Name;
int Login_id;
public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}
public boolean Login_Validate()
{
	String Sql_LoginValidate="select * from login_details where email_id=? and password=?";
	try {
    	DBConnection Object=new DBConnection();
    	PreparedStatement Query=Object.connection.prepareStatement(Sql_LoginValidate);
    	Query.setString(1,Email);
    	Query.setString(2,Password);
    	ResultSet Sql_Response=Query.executeQuery();
    	Status=Sql_Response.next();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
    return Status;
}
public String getCustomerType()
{
	String Sql_getCustomerType="select customertype from login_details where email_id=?";
	try {
		DBConnection object=new DBConnection();
    	PreparedStatement Query=object.connection.prepareStatement(Sql_getCustomerType);
    	Query.setString(1,Email);
    	ResultSet Sql_Response=Query.executeQuery();
    	Sql_Response.next();
    	Customer_Type=Sql_Response.getString(1);
    	
	} catch (Exception e) {
		// TODO: handle exception
	}
	return Customer_Type;
}

public void getLoginId()
{
	String Sql_getLoginId="select login_id from login_details where email_id=?";
	try {
		DBConnection object=new DBConnection();
    	PreparedStatement Query=object.connection.prepareStatement(Sql_getLoginId);
    	Query.setString(1,Email);
    	ResultSet Sql_Response=Query.executeQuery();
    	Sql_Response.next();
    	Login_id=Integer.parseInt(Sql_Response.getString(1));
    	
	} catch (Exception e) {
	
	}
}



public String getLoggerName()
{
	String Name=null;
	String Sql_getPatientName="select first_name from patient_details where login_id=?";
	String Sql_getDoctorName="select first_name from doctor_details where login_id=?";
	String Sql_getCustomerName=null;

	
	try {
		if(Customer_Type.equals("P "))
		{
			Sql_getCustomerName=Sql_getPatientName;
		}
	else if(Customer_Type.equals("D "))
		{
			Sql_getCustomerName=Sql_getDoctorName;
		}

		DBConnection object=new DBConnection();
		PreparedStatement Query=object.connection.prepareStatement(Sql_getCustomerName);
		Query.setInt(1,Login_id);
    	ResultSet Sql_Response=Query.executeQuery();
    	Sql_Response.next();
    	Name=Sql_Response.getString(1);
    	
	} catch (Exception e) {
		// TODO: handle exception
	}
	return Name;
}
}
