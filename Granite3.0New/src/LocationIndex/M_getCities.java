package LocationIndex;

import hs.dbConnection.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class M_getCities {
	public 	Map<String, String> CityList = new LinkedHashMap<String, String>();
	private String State;


	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	
	public void getCities()
	{
		String Sql_getStateNames="select distinct city from geo_details where state=?";
		int CityCounter=0;
		try
		{
			DBConnection Connection= new DBConnection();
			PreparedStatement Query=Connection.connection.prepareStatement(Sql_getStateNames);
			Query.setString(1,State);
			ResultSet Sql_Response=Query.executeQuery();
			CityCounter=0;
			while(Sql_Response.next())
			{
				CityCounter++;
				CityList.put(""+CityCounter+"", Sql_Response.getString(1));
			}
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}



}
