package hs.Model.Level3.FileUpload;

import hs.Model.Level3.Connection.M_L3_ViewConnections_Doc;

import java.util.LinkedList;

public class M_L3_FileList {
	
	LinkedList<M_L3_FileDownload.Node> List=new LinkedList<M_L3_FileDownload.Node>();
	

	public LinkedList<M_L3_FileDownload.Node> getList() {
		return List;
	}

	public void setList(LinkedList<M_L3_FileDownload.Node> list) {
		List = list;
	}

}
