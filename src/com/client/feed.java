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
import gwt.material.design.client.ui.MaterialTextBox;

public class feed extends Composite {
	
	private static feedUiBinder uiBinder = GWT.create(feedUiBinder.class);

	interface feedUiBinder extends UiBinder<Widget, feed> {
	}

	public feed() {
		initWidget(uiBinder.createAndBindUi(this));
	}


@UiField
MaterialContainer c;
@UiField
MaterialTextBox feed;
@UiField
MaterialButton submit;

public feed(String firstName) {
	initWidget(uiBinder.createAndBindUi(this));
	submit.setText(firstName);
}

private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);

@UiHandler("submit")
void onClick(ClickEvent e)
{
	String fee=feed.getText();
	a2.feed(fee,new AsyncCallback<String>(){
		
		@Override
		public void onSuccess(String result) {
			// TODO Auto-generated method stub
			if(result.equals("YES"))
				{
				Window.alert("Thankyou for feeding me ");
				History.newItem("ee");
				MySpace.getInstance().koifunction();
				/*c.clear();
				feed f=new feed();
				c.add(f);*/
				}
			else
				Window.alert("ERROR Please Try again");
		}
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert(caught.getMessage());
		} 
});
}
}