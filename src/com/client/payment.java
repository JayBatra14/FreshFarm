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

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialTextBox;

public class payment extends Composite{

	private static paymentUiBinder uiBinder = GWT.create(paymentUiBinder.class);

	interface paymentUiBinder extends UiBinder<Widget, payment> {
	}
String f_id="";
String c_id="";
String cost="";
	public payment() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public payment(String f_id,String c_id,String cost) {
		initWidget(uiBinder.createAndBindUi(this));
		this.f_id=f_id;
		this.c_id=c_id;
		this.cost=cost;
	}


@UiField
MaterialContainer aa;

@UiField
MaterialListBox land,months;

@UiField 
MaterialButton bill;

private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);

@UiHandler("bill")
void onClick(ClickEvent e)
{
	String la= land.getSelectedValue();
	String mo=months.getSelectedValue();
	int l=Integer.parseInt(la);
	int m = Integer.parseInt(mo);
	int c=Integer.parseInt(cost);
	int a=l*m*c;
	String amount=Integer.toString(a);
	a2.amount(f_id, c_id, amount, new AsyncCallback<String>() {
		
		@Override
		public void onSuccess(String result) {
			// TODO Auto-generated method stub
			Window.alert("your bill is " +result);
			Window.alert("Payment Success");
			History.newItem("rr");
			History.replaceItem("historyToken");
			MySpace.getInstance().koifunction();
		}
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert(caught.getMessage());
		}
	});
	
}


}
