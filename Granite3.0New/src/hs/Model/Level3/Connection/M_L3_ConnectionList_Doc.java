package hs.Model.Level3.Connection;

import java.util.LinkedList;

public class M_L3_ConnectionList_Doc {
	
	LinkedList<M_L3_ViewConnections_Doc.Node> List=new LinkedList<M_L3_ViewConnections_Doc.Node>();

	public LinkedList<M_L3_ViewConnections_Doc.Node> getList() {
		return List;
	}

	public void setList(LinkedList<M_L3_ViewConnections_Doc.Node> list) {
		List = list;
	}

}
