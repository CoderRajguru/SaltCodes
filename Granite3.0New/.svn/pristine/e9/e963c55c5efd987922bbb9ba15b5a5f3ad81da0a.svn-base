package hs.Model.Level1.Map;

import hs.Model.Level1.Map.M_L1_GetCityCoordinate.Node;
import hs.dbConnection.DBConnection;
import hs.Model.Level1.Map.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.LinkedList;



public class M_L1_GMapData {

	int Row=0;
	String Doc_name,Doc_Department,Doc_Contact;
	public int Doctor_Count=0;
	String Doc_City;
	String Latitude,Longitude;
	
	public String[][] GetLoc(String Key)
	{
		
		
		String[ ][ ] Map = new String[100][3] ;
		
		
		
		
		String Sql_SearchDoctor="select * from doctors_temp";
		
//		LinkedList<M_L1_GetCityCoordinate.Node> List = new LinkedList<M_L1_GetCityCoordinate.Node>();
		
		try {
			
			
			DBConnection Object=new DBConnection();
			PreparedStatement Query=Object.connection.prepareStatement(Sql_SearchDoctor);
			ResultSet Sql_Response=Query.executeQuery();
			System.out.print("Hello");
			Row=0;
			
			
			while(Sql_Response.next())
			{
				Doctor_Count++;
				Doc_name=Sql_Response.getString(1);
		//		Doc_Department=Sql_Response.getString(27);
				Doc_Contact=Sql_Response.getString(4);
		/*		Doc_City=Sql_Response.getString(10);
				M_L1_GetCityCoordinate Object_GetCord=new M_L1_GetCityCoordinate();
				
				List=Object_GetCord.GetCoordinates(Doc_City);
				
				
				
				Iterator<M_L1_GetCityCoordinate.Node> Data=List.iterator();
				
				while (Data.hasNext()) 
				{
					M_L1_GetCityCoordinate.Node Ref=Data.next();
					
					Latitude=Ref.Latitude;
				    Longitude=Ref.Longitude;
					
					System.out.println(Latitude);
					System.out.print(Longitude);
				}
				*/
				
				
				Latitude=Sql_Response.getString(2);
				Longitude=Sql_Response.getString(3);
				
				System.out.println(Doc_name);
				System.out.println(Latitude);
				System.out.println(Longitude);
				
				Map[Row][0]=Doc_name;
				Map[Row][1]=Latitude;
				Map[Row][2]=Longitude;
				
				Row++;
				
				
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return Map;
}

}