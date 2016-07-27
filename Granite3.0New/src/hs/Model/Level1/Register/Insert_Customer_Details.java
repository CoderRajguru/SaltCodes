package hs.Model.Level1.Register;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.*;
public class Insert_Customer_Details {
	boolean Status=false;
	String Sql_PatientDetails="select patient_func (?,null,null,?,null,null,null,null,null,null,null,null,null,null)";
	String Sql_DoctorDetails="select doctor_func (?,?,null,null,null,null,null,null,null,null,null,null,null,null,null,null)";
	String Sql_RegisterCustomerDetails=null;
	boolean Insert_Customer(String Email,String Name,String Customer_Type)
	{
		try {
			if(Customer_Type.equals("P"))
				{
					Sql_RegisterCustomerDetails=Sql_PatientDetails;
				}
			else if(Customer_Type.equals("D"))
				{
					Sql_RegisterCustomerDetails=Sql_DoctorDetails;
				}
			DBConnection Object=new DBConnection();
			PreparedStatement Query=Object.connection.prepareStatement(Sql_RegisterCustomerDetails);
			Query.setString(1,Email);
			Query.setString(2,Name);
			ResultSet Sql_Response=Query.executeQuery();
			Boolean Status=Sql_Response.next();
			if(Status)
			{
				Status=true;
			}
			
			return Status;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return Status;
	}

}
