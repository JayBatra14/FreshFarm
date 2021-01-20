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
import com.google.gwt.user.client.ui.Widget;
import com.shared.Reg;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class creg extends Composite {

	private static cregUiBinder uiBinder = GWT.create(cregUiBinder.class);

	interface cregUiBinder extends UiBinder<Widget, creg> {
	}

	public creg() {
		initWidget(uiBinder.createAndBindUi(this));
	}
public creg(String firstName) {
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
MaterialListBox city,dis,state;
@UiField
MaterialListBox gen;

private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
@UiHandler("submit")

void onClick(ClickEvent e) {
   Reg r = new Reg();
   r.setName(name.getText());
   r.setAddress(add.getText());
   r.setMobile(mob.getText());
   r.setAadhar(aadhar.getText());
   r.setGender(gen.getSelectedValue());
   r.setCity(city.getSelectedValue());
   r.setDistrict(dis.getSelectedValue());
   r.setState(state.getSelectedValue());
   r.setEmail(email.getText());
   r.setPassword(pass.getText());
   a2.reg(r, new AsyncCallback<String>() {
	
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
	
	
	


	


