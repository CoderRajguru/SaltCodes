package hs.Model.Level3.SendMessage;

import java.util.LinkedList;

public class M_L3_ConversationList {
	
LinkedList<M_L3_ViewConversation.Node> List=new LinkedList<M_L3_ViewConversation.Node>();

public LinkedList<M_L3_ViewConversation.Node> getList() {
	return List;
}

public void setList(LinkedList<M_L3_ViewConversation.Node> list) {
	List = list;
}


}
