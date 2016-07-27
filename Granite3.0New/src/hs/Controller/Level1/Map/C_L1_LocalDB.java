package hs.Controller.Level1.Map;

import hs.Model.Level1.Map.M_L1_GetList;
import hs.Model.Level1.Map.M_L1_GetLocalList;
import hs.Model.Level1.Map.M_L1_LocalDB;
import hs.Model.Level1.Map.M_L1_Map;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L1_LocalDB
 */
public class C_L1_LocalDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L1_LocalDB() {
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
		M_L1_LocalDB Object=new M_L1_LocalDB();
		M_L1_GetLocalList Get_Object=new M_L1_GetLocalList();
		Object.setKey(SearchKey);
		
		System.out.println(SearchKey);
		
		LinkedList<M_L1_LocalDB.Node> List=new LinkedList<M_L1_LocalDB.Node>();
		
		List=Object.GetKeyData();
		Get_Object.setList(List);
		
	//	System.out.println(Object.GetKeyData());
	
		Iterator<M_L1_LocalDB.Node> Data=List.iterator();
		
		while (Data.hasNext()) 
		{
			M_L1_LocalDB.Node Ref=Data.next();
			System.out.println(Ref.Login_id);
			System.out.println(Ref.Name);
			System.out.print(Ref.Department);
			System.out.print(Ref.Contact);
		}
		

	//	if(Doctor_Count>0)
		{
			 request.setAttribute("Object", Get_Object);
			 RequestDispatcher rd=request.getRequestDispatcher("Level1/L1_mapNsearch/LocalDocResults.jsp");  
	         rd.forward(request, response); 
		}
		
	}
	

	}


