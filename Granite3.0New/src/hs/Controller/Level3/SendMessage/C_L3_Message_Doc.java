package hs.Controller.Level3.SendMessage;

import hs.Model.Level3.SendMessage.M_L3_ConversationList;
import hs.Model.Level3.SendMessage.M_L3_ConversationList_Doc;
import hs.Model.Level3.SendMessage.M_L3_SendMessage;
import hs.Model.Level3.SendMessage.M_L3_SendMessage_Doc;
import hs.Model.Level3.SendMessage.M_L3_ViewConversation;
import hs.Model.Level3.SendMessage.M_L3_ViewConversation_Doc;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class C_L3_Message_Doc
 */
public class C_L3_Message_Doc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_L3_Message_Doc() {
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
	
		String Message=request.getParameter("Message");
		int Pat_Id=Integer.parseInt(request.getParameter("Patient_Id"));
		String Doc_Email=request.getParameter("Doc_Email");
		String Action=request.getParameter("Button");
		System.out.println("Action"+Action);	
		
		if(Action.equals("Send Message")||Action.equals("Reply"))
		{
		M_L3_SendMessage_Doc Object=new M_L3_SendMessage_Doc();
		Object.setDoctor_Email(Doc_Email);
		int Status=Object.SendMessage(Pat_Id, Message);
		
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
			M_L3_ViewConversation_Doc Object_Conversation=new M_L3_ViewConversation_Doc();
			M_L3_ConversationList_Doc Object_ConversationList=new M_L3_ConversationList_Doc();
			
			Object_Conversation.setDoctor_Email(Doc_Email);
			
			LinkedList<M_L3_ViewConversation_Doc.Node> List=new LinkedList<M_L3_ViewConversation_Doc.Node>();
			List=Object_Conversation.GetConversation(Pat_Id);
			
			Object_ConversationList.setList(List);
			
			request.setAttribute("Object", Object_ConversationList);
			RequestDispatcher rd=request.getRequestDispatcher("Level3/Level3_Conversations/V_L3_ViewConversation_Doctor.jsp"); 
			rd.forward(request, response); 
			
		}
		
	}

}
