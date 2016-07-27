package hs.Controller.Level3.FileUpload;

import hs.Model.Level3.FileUpload.M_L3_DownloadFile;
import hs.Model.Level3.FileUpload.M_L3_ShareFile;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_DownloadFile
 */
@WebServlet ("/C_L3_DownloadFile")
public class C_L3_DownloadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_DownloadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int Record_Id=Integer.parseInt(request.getParameter("Record_Id"));
		String Button=request.getParameter("Button");
		
		if(Button.equals("Download"))
		{
		M_L3_DownloadFile Object=new M_L3_DownloadFile();
		Object.setRecord_Id(Record_Id);
		
		String FileName=Object.Get_FileDetails();
		String GetFile="C:/eclipse/null"+FileName;
		
		response.setContentType("APPLICATION/OCTET-STREAM");   
		response.setHeader("Content-Disposition","attachment; Filename=\"" + GetFile + "\"");   

		java.io.FileInputStream fileInputStream=new java.io.FileInputStream(GetFile);  
		          
		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		  System.out.write(i);   
		}   
		fileInputStream.close(); 

		
	}
	/*
	else if(Button.equals("Share"))
	{
		M_L3_ShareFile Object_Share=new M_L3_ShareFile();
		
	}
*/
}
}
