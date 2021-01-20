package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.consumerslist;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLink;

public class fport extends Composite{

	private static fportUiBinder uiBinder = GWT.create(fportUiBinder.class);

	interface fportUiBinder extends UiBinder<Widget, fport> {
	}
    String f_id="";
	public fport() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public fport(String f_id) {
		initWidget(uiBinder.createAndBindUi(this));
		this.f_id=f_id;
	}
	
	int i,n;
	@UiField
	MaterialContainer d;
	
	@UiField
	MaterialButton add;
	
	@UiField
	MaterialButton req;
	

	@UiField
	MaterialButton out,event;
	
	
	private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	
	

@UiHandler("add")
void onClick0(ClickEvent e)
{
	/*d.clear();
	ldet l=new ldet(f_id);
	d.add(l);*/
	MySpace.getInstance().f_id=f_id;
	History.newItem("jj");
	MySpace.getInstance().koifunction();
	History.replaceItem("historyToken");

}
@UiHandler("req")
void onClick1(ClickEvent e)
{
	MySpace.getInstance().f_id=f_id;
	History.newItem("qq");
	MySpace.getInstance().koifunction();
	/*d.clear();
	clist c = new clist(f_id);
	d.add(c);*/
}




@UiHandler("out")
void onClick4(ClickEvent e)
{
	Window.alert("you are logged out");
	tan t = new tan();
	History.replaceItem("historyToken");
	History.newItem("kk");
	MySpace.getInstance().koifunction();
	History.replaceItem("historyToken");
	RootPanel.get("pp").add(t.header);
	/*d.clear();
	login l=new login();
	d.add(l);*/
}

@UiHandler("event")
void onClick6(ClickEvent e)
{
	History.newItem("cc");
	MySpace.getInstance().koifunction();
	/*d.clear();
	event l=new event();
	d.add(l);*/
}
}
 

