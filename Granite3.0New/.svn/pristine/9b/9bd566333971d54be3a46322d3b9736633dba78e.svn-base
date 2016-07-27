package hs.Model.Level1.Register;

import java.sql.*;

import hs.dbConnection.*;
import hs.Model.Level1.Register.*;

public class M_L1_Register {

private String Name,Email,Password,Customer_Type;
int Register_Response;
Check_Duplicate_Login Check_Class_Variable;
Insert_Login_Details Login_Class_Variable;
Insert_Customer_Details Customer_Class_Variable;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

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

public String getCustomer_Type() {
	return Customer_Type;
}

public void setCustomer_Type(String customer_Type) {
	Customer_Type = customer_Type;
}	
public int Confirm_Register()
{
	try {
		
		Check_Duplicate_Login Object_Duplicate_Check=new Check_Duplicate_Login();
		boolean Duplicate_Status=Object_Duplicate_Check.Check_Duplicate(Email);
		if(Duplicate_Status==true)
		{
			Insert_Login_Details Object_Insert_Login=new Insert_Login_Details();
			boolean Insert_Login_Status=Object_Insert_Login.Insert_Login(Email,Password,Customer_Type);
			if(Insert_Login_Status==true)
			{
				Insert_Customer_Details Object_Insert_Customer=new Insert_Customer_Details();
				boolean Insert_Customer_Status=Object_Insert_Customer.Insert_Customer(Email, Name, Customer_Type);
				if(Insert_Customer_Status==true)
				{
					Register_Response=100;
				}
				else
				{
					Register_Response=2;
				}
			}
			else
			{
				Register_Response=1;	
			}
		}
		else
		{
			Register_Response=0;
		}
			
	
	} catch (Exception e) {
		// TODO: handle exception
	}
	return Register_Response;
}
}
