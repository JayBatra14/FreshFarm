package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialSlider;

public class tan extends Composite{

	private static tanUiBinder uiBinder = GWT.create(tanUiBinder.class);

	interface tanUiBinder extends UiBinder<Widget, tan> {
	}

	public tan() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	public tan(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		//button.setText(firstName);
	}	
	@UiField
	MaterialHeader header;
	@UiField
	MaterialLink login;
	
	@UiField
	MaterialLink home;
		
	@UiField
	MaterialLink registration;
	
	@UiField
	MaterialLink gall;
	
	@UiField
	MaterialLink feed;
	
	@UiField
	MaterialContainer aa;
	
@UiField
MaterialSlider ss;
	
	@UiHandler("home")
	
	void onClick(ClickEvent e) {

		History.newItem("oo");
		MySpace.getInstance().koifunction();
		RootPanel.get("pp").add(header);
		RootPanel.get("ff").clear();
		RootPanel.get("ff").add(ss);
	}
	

	@UiHandler("registration")
	void onClick2(ClickEvent e) {
		//RootPanel.get().clear();
		aa.clear();
        RootPanel.get("pp").add(header);
        History.replaceItem("historyToken");
		History.newItem("mm");
		MySpace.getInstance().koifunction();
		/*aa.clear();
		regis rr=new regis();
		aa.add(rr);*/
	}

	@UiHandler("login")
	void onClick0(ClickEvent e) {
		       //RootPanel.get().clear();
		       aa.clear();
		       RootPanel.get("pp").add(header);
				History.newItem("kk");
				History.replaceItem("historyToken");
				MySpace.getInstance().koifunction();
			}
	/*aa.clear();
	login rr=new login();
	aa.add(rr);*/
	
	@UiHandler("gall")
	void onClick3(ClickEvent e) {
		//RootPanel.get().clear();
		aa.clear();
        RootPanel.get("pp").add(header);
		History.newItem("ii");
		MySpace.getInstance().koifunction();
		/*aa.clear();
	gall g=new gall();
	aa.add(g);*/
	}

	@UiHandler("feed")
	void onClick4(ClickEvent e) {
		        //RootPanel.get().clear();
		        aa.clear();
		        RootPanel.get("pp").add(header);
				History.newItem("ee");
				MySpace.getInstance().koifunction();
			}
		/*aa.clear();
	feed f=new feed();
	aa.add(f);*/
}
		 
