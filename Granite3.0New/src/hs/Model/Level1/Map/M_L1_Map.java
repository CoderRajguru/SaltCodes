package hs.Model.Level1.Map;

import java.sql.*;

import java.util.Iterator;
import java.util.LinkedList;



import hs.dbConnection.*;
public class M_L1_Map {
	
private String Key;
String Doc_name,Doc_Department,Doc_Contact;
public int Doctor_Count=0;


public String getKey() {
	return Key;
}

public void setKey(String key) {
	Key = key;
}

public LinkedList<Node> GetKeyData()
{

	LinkedList<Node> List = new LinkedList<Node>();
	String Sql_SearchDoctor="select * from doctor_data where first_name=? ";
	try
	{
		DBConnection Object=new DBConnection();
		PreparedStatement Query=Object.connection.prepareStatement(Sql_SearchDoctor);
		Query.setString(1,Key);
		ResultSet Sql_Response=Query.executeQuery();
		System.out.print("Hello");
		while(Sql_Response.next())
		{
		Doctor_Count++;
		Doc_name=Sql_Response.getString(2);
		Doc_Department=Sql_Response.getString(27);
		Doc_Contact=Sql_Response.getString(13);
		
		Node Element = new Node();
		Element.Name=Doc_name;
		Element.Department=Doc_Department;
		Element.Contact=Doc_Contact;
		List.add(Element);
		}
	/*
	  	Iterator<Node> Data=List.iterator();
	
		while (Data.hasNext()) 
		{
			Node Ref=Data.next();
			System.out.println(Ref.Name);
			System.out.print(Ref.Department);
			System.out.print(Ref.Contact);
		}
	
		*/
	}
	catch(Exception e)
	{
		
	}
	return List;
	
	
}
public class Node
{
	public String Name;
	public String Department;
	public String Contact;
}
}

