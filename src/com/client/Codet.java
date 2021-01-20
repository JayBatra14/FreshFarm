package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Cdet;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialTextBox;

public class Codet extends Composite{

	private static CodetUiBinder uiBinder = GWT.create(CodetUiBinder.class);

	interface CodetUiBinder extends UiBinder<Widget, Codet> {
	}
String f_id="";
String c_id="";
	public Codet() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public Codet(String f_id,String c_id) {
		initWidget(uiBinder.createAndBindUi(this));
		this.f_id=f_id;
		this.c_id=c_id;
	}
@UiField
MaterialButton show;

@UiField
MaterialTextBox name,add, email, aadhar, cid, mob;

@UiField
MaterialContainer x;

private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);

@UiHandler("show")
void onClick(ClickEvent e)
{
	Cdet c = new Cdet();
	a2.condet(c, c_id, new AsyncCallback<Cdet>() {
		
		@Override
		public void onSuccess(Cdet result) {
			// TODO Auto-generated method stub

			String s1 = result.getC_id();
			String s2 = result.getName();
			String s3 = result.getMobile();
			String s4 = result.getAddress();
			String s5 = result.getAadhar();
			String s6 = result.getEmail();

			cid.setText(s1);
			name.setText(s2);
			mob.setText(s3);
			add.setText(s4);
			aadhar.setText(s5);
			email.setText(s6);
		}
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert(caught.getMessage());
		}
	});
}

}
