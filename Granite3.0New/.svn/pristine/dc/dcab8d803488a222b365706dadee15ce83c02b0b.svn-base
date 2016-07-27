package hs.Controller.Level1.Map;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hs.Model.Level1.Map.*;

import java.util.*;
/**
 * Servlet implementation class C_L1_Map
 */
public class C_L1_Map extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L1_Map() {
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
		
		String SearchKey=request.getParameter("Key");
		M_L1_Map Object=new M_L1_Map();
		M_L1_GetList Get_Object=new M_L1_GetList();
		Object.setKey(SearchKey);
		
		
		
		LinkedList<M_L1_Map.Node> List=new LinkedList<M_L1_Map.Node>();
		
		List=Object.GetKeyData();
		Get_Object.setList(List);
		
	//	System.out.println(Object.GetKeyData());
	
		Iterator<M_L1_Map.Node> Data=List.iterator();
		
		while (Data.hasNext()) 
		{
			M_L1_Map.Node Ref=Data.next();
			System.out.println(Ref.Name);
			System.out.print(Ref.Department);
			System.out.print(Ref.Contact);
		}
		

	//	if(Doctor_Count>0)
		{
			 request.setAttribute("Object", Get_Object);
			 RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_mapNsearch/SearchData.jsp");  
	         rd.forward(request, response); 
		}
		
	}

}
