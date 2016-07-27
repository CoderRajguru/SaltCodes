package hs.Controller.Level3.SendMessage;

import hs.Model.Level3.Connection.M_L3_ViewConnections;
import hs.Model.Level3.SendMessage.M_L3_ConversationList;
import hs.Model.Level3.SendMessage.M_L3_SendMessage;
import hs.Model.Level3.SendMessage.M_L3_ViewConversation;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_SendMessage
 */
public class C_L3_Message extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_Message() {
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
	String Message=request.getParameter("Message");
	int Doc_Id=Integer.parseInt(request.getParameter("Doctor_Id"));
	String Pat_Email=request.getParameter("Pat_Email");
	String Action=request.getParameter("Button");
	System.out.println("Action"+Action);
	
	if(Action.equals("Send Message")||Action.equals("Reply"))
	{
	M_L3_SendMessage Object=new M_L3_SendMessage();
	Object.setPatient_Email(Pat_Email);
	int Status=Object.SendMessage(Doc_Id, Message);
	
	if(Status==1)
	{
		System.out.print("Done");
	}
	else
	{
		
		
	}
	
	}

	else if(Action.equals("View Conversation"))
	{
		M_L3_ViewConversation Object_Conversation=new M_L3_ViewConversation();
		M_L3_ConversationList Object_ConversationList=new M_L3_ConversationList();
		
		Object_Conversation.setPatient_Email(Pat_Email);
		
		LinkedList<M_L3_ViewConversation.Node> List=new LinkedList<M_L3_ViewConversation.Node>();
		List=Object_Conversation.GetConversation(Doc_Id);
		
		Object_ConversationList.setList(List);
		
		request.setAttribute("Object", Object_ConversationList);
		RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_Conversations/V_L3_ViewConversation_Patient.jsp"); 
		rd.forward(request, response); 
		
	}
	}
	

}
