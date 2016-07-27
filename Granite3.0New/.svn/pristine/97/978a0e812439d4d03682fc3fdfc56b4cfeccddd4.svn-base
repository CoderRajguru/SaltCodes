package hs.Model.Level1.Map;

import hs.Model.Level1.Map.M_L1_Map.Node;
import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class M_L1_GetCityCoordinate {
	
	String Long;
	String Lat;
	
	public LinkedList<Node> GetCoordinates(String City)
	{
		
		LinkedList<Node> List = new LinkedList<Node>();
		String Sql_GetCoordinates="select * from city_details where city=?";
		try {
			DBConnection Connection=new DBConnection();
			PreparedStatement Query=Connection.connection.prepareStatement(Sql_GetCoordinates);
			Query.setString(1,City);
			ResultSet Response=Query.executeQuery();
			Response.next();
			
			Node Element = new Node();
			Element.Latitude=Response.getString(4);
			Element.Longitude=Response.getString(5);
			
			
			List.add(Element);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return List;
	}
	
	
	public class Node
	{
		public String Latitude;;
		public String Longitude;
	}

}
