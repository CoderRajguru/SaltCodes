package hs.Controller.Level1.Map;

import hs.Model.Level1.Map.M_L1_GMapData;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.gson.Gson;

/**
 * Servlet implementation class C_L1_GMapData
 */
@WebServlet("/C_L1_GMapData")
public class C_L1_GMapData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L1_GMapData() {
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
		System.out.println(SearchKey);
		
		
		M_L1_GMapData Object=new M_L1_GMapData();
		//LinkedList<Map_Model.Node> List=new LinkedList<Map_Model.Node>();
		String[][] List=Object.GetLoc(SearchKey);
		
		String json = null ;
	    json= new Gson().toJson(List);   
	   
	    System.out.println(List);
	    System.out.println("Hello");
	    response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
