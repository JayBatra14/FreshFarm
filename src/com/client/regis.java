package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialContainer;

public class regis extends Composite{

	private static regisUiBinder uiBinder = GWT.create(regisUiBinder.class);

	interface regisUiBinder extends UiBinder<Widget, regis> {
	}

	public regis() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	RadioButton farmer;
	
	@UiField
	RadioButton consumer;
	@UiField
	MaterialContainer rr;

	public regis(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		//button.setText(firstName);
	}
	
	@UiHandler("farmer")
	void onClick0(ClickEvent e) {
		History.replaceItem("historyToken");
		History.newItem("hh");
		History.replaceItem("historyToken");
		MySpace.getInstance().koifunction();
	/*rr.clear();
	freg f=new freg();
	rr.add(f);*/
	
	}
	
	@UiHandler("consumer")
	void onClick1(ClickEvent e) {
		History.replaceItem("historyToken");
		History.newItem("bb");
		History.replaceItem("historyToken");
		MySpace.getInstance().koifunction();
		/*rr.clear();
	creg c=new creg();
	rr.add(c);*/
	}

	
}
