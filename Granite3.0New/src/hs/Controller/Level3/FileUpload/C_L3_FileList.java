package hs.Controller.Level3.FileUpload;

import hs.Model.Level3.FileUpload.M_L3_FileDownload;
import hs.Model.Level3.FileUpload.M_L3_FileList;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_FileDownload
 */

public class C_L3_FileList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_FileList() {
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
		// TODO Auto-generated method stub
		String Patient_Email=request.getParameter("Email");
		M_L3_FileDownload Object=new M_L3_FileDownload();
		
		M_L3_FileList Object_GetList=new M_L3_FileList();
		Object.setPatient_Email(Patient_Email);
		
		LinkedList<M_L3_FileDownload.Node> List=new LinkedList<M_L3_FileDownload.Node>();
		List=Object.GetFileList();
		
		Object_GetList.setList(List);
		
		request.setAttribute("Object", Object_GetList);
		RequestDispatcher rd=request.getRequestDispatcher("/Level3/Level3_FileDownload/V_L3_FileDownload.jsp");  
        rd.forward(request, response); 
		
		
	
	}

}
