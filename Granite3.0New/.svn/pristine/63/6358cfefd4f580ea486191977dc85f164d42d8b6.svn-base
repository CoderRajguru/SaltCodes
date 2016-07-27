package hs.Model.Level3.AccountUpdate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.Other.Functions.*;
import hs.dbConnection.DBConnection;
public class M_L3_AccountUpdate {
	private String first_name,middle_name,last_name,gender_id,address_1,address_2,zipcode;
	private int phonenumber;
	boolean Response;
	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender_id() {
		return gender_id;
	}

	public void setGender_id(String gender_id) {
		this.gender_id = gender_id;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public boolean InsertData(String Email)
	{
		Get_Login_id Object_GetId=new Get_Login_id();
		int Login_id=Object_GetId.Get_Login_id_Func(Email);
		System.out.print(Login_id);
	//	String Sql_InsertUpdate="insert into patient_details(first_name,middle_name,last_name,gender_id,address_1,address_2,zipcode,phone_number) values(?,?,?,?,?,?,?,?) where login_id=?";
		String Sql_InsertUpdate="update patient_details set first_name=?,middle_name=?,last_name=?,gender_id=?,address_1=?,address_2=?,zipcode=?,phone_number=? where login_id=?";
		try {
			DBConnection Object_dbConnection=new DBConnection();
			PreparedStatement Query=Object_dbConnection.connection.prepareStatement(Sql_InsertUpdate);
			Query.setString(1,first_name);
			Query.setString(2,middle_name);
			Query.setString(3,last_name);
			Query.setString(4,gender_id);
			Query.setString(5,address_1); 
			Query.setString(6,address_2);
			Query.setString(7,zipcode);
			Query.setInt(8,phonenumber);
			Query.setInt(9,Login_id);
			System.out.print("Progress");
			
			Query.executeUpdate();
			Response=true;
			System.out.print("No Problemn");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response;
	}

	

}
