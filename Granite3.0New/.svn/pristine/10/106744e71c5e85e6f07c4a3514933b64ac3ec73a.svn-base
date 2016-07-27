package hs.Controller.Level3.FileUpload;


import hs.Model.Level3.FileUpload.M_L3_FileUpload;

import java.io.*;
import java.util.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;





/**
 * Servlet implementation class C_L3_FileUpload
 */
public class C_L3_FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_FileUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

    private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 50 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file ;
    int Counter=0;
    String Patient;
    String FileName;

    public void init( ){
       // Get the file location where it would be stored.
       filePath = 
              getServletContext().getInitParameter("file-upload"); 
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

		  
		
		
		
		  isMultipart = ServletFileUpload.isMultipartContent(request);
		  
		

		  
		  
		 
	      if( !isMultipart )
	      {
	         System.out.println("No file uploaded"); 
	         return;
	      }
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	      
	      // maximum size that will be stored in memory
	      factory.setSizeThreshold(maxMemSize);
	      // Location to save data that is larger than maxMemSize.
	      factory.setRepository(new File("C://Great"));

	      // Create a new file upload handler
	      ServletFileUpload upload = new ServletFileUpload(factory);
	      // maximum file size to be uploaded.
	      upload.setSizeMax( maxFileSize );

	      try{ 
	      // Parse the request to get file items.
	      List fileItems = upload.parseRequest(request);
		
	      // Process the uploaded file items
	      
	      
	      
	      
	      
	      Iterator i = fileItems.iterator();
	      while ( i.hasNext () ) 
	      {
	         FileItem fi = (FileItem)i.next();
	         Patient=fi.getFieldName();
	         
	         
	         if ( !fi.isFormField () )	
	         {
	            // Get the uploaded file parameters 
	           
	            String fileName = fi.getName();
	            // Write the file
	            if( fileName.lastIndexOf("\\") >= 0 ){
	               file = new File( filePath + 
	               fileName.substring( fileName.lastIndexOf("\\"))) ;
	            }
	            else
	            {
	               file = new File( filePath + 
	               fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	            }
	            
	            fi.write( file ) ;
	            System.out.println("Uploaded Filename: " + fileName);
	            FileName=fileName;
	            
	    
	         }
	      }
	      M_L3_FileUpload Object=new M_L3_FileUpload();
          Object.setPatient_Email(Patient);
         int Response= Object.FileUpload(FileName);
         System.out.print("Response"+Response);
	      
	   }catch(Exception e) {
	       System.out.println(e);
	   }
		
		
	}

}
