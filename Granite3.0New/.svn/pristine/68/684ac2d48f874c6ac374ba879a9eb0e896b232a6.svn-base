package LocationIndex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

import hs.dbConnection.*;

public class M_getStates {
	public 	Map<String, String> StateList = new LinkedHashMap<String, String>();
	private String Country;

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void getStates()
	{
		String Sql_getStateNames="select distinct state from geo_details where country=?";
	
		int StateCounter=0;
		try
		{
			DBConnection Connection= new DBConnection();
			PreparedStatement Query=Connection.connection.prepareStatement(Sql_getStateNames);
			Query.setString(1,Country);

			ResultSet Sql_Response=Query.executeQuery();
			StateCounter=0;
			while(Sql_Response.next())
			{
				StateCounter++;
				StateList.put(""+StateCounter+"", Sql_Response.getString(1));
			}
			
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}
}
