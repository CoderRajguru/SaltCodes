package hs.Model.Level3.FileUpload;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hs.dbConnection.DBConnection;

public class M_L3_DownloadFile {

private int Record_Id;
private String FileName=null;

public int getRecord_Id() {
	return Record_Id;
}

public void setRecord_Id(int record_Id) {
	Record_Id = record_Id;
}	

public String Get_FileDetails()
{
	String Sql_GetFileDetails="select record_name from patient_doctor_records where record_id=?";
	try {
		DBConnection Connection=new DBConnection();
		PreparedStatement Query=Connection.connection.prepareStatement(Sql_GetFileDetails);
		Query.setInt(1,Record_Id);
		ResultSet Query_Response=Query.executeQuery();
		while(Query_Response.next())
		{
			FileName=Query_Response.getString(1);
		}
	} catch (Exception e)
	{
		e.printStackTrace();
	}
	return FileName;
}

}
