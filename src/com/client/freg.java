package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Reg;
import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextBox;
import sun.security.jca.GetInstance;

public class freg extends Composite {

	private static fregUiBinder uiBinder = GWT.create(fregUiBinder.class);

	interface fregUiBinder extends UiBinder<Widget, freg> {
	}

	public freg() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public freg(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		//button.setText(firstName);
	}
	@UiField
	MaterialTextBox name,add,mob,aadhar,pass,email;
	

@UiField
MaterialContainer aa;
@UiField
MaterialButton submit;

@UiField
MaterialListBox city,dis,state,gen;

private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
@UiHandler("submit")

void onClick(ClickEvent e) {
	
	Reg m = new Reg();
	m.setName(name.getText());
	  m.setAddress(add.getText());
	   m.setMobile(mob.getText());
	   m.setAadhar(aadhar.getText());
	   m.setGender(gen.getSelectedValue());
	   m.setCity(city.getSelectedValue());
	   m.setDistrict(dis.getSelectedValue());
	   m.setState(state.getSelectedValue());
	   m.setEmail(email.getText());
	  m.setPassword(pass.getText());
	  a2.freg(m, new AsyncCallback<String>() {
		
		@Override
		public void onSuccess(String result) {
			// TODO Auto-generated method stub
			Window.alert(result);
			History.newItem("kk");
			History.replaceItem("historyToken");
			MySpace.getInstance().koifunction();
			/*aa.clear();
			tan t=new tan();
			aa.add(t.ss);*/
			
		}
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert(caught.getMessage());
		}
		
		
	}); 

	}
}

