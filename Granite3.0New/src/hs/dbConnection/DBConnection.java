package hs.dbConnection;
import java.sql.*;
public class DBConnection {
public Connection connection;
	public DBConnection()
	{
		try {
	    	Class.forName("org.postgresql.Driver");
	    	connection=DriverManager.getConnection("jdbc:postgresql://122.166.212.69:5432/MedicalRecords","postgres","amar1982");
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
