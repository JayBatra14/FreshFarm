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
import com.shared.sevent;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialTextBox;

public class event extends Composite{

	private static eventUiBinder uiBinder = GWT.create(eventUiBinder.class);

	interface eventUiBinder extends UiBinder<Widget, event> {
	}

	public event() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public event(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		//button.setText(firstName);
	}
	@UiField
	MaterialButton submit;
	@UiField
	MaterialContainer d;
	@UiField
	MaterialTextBox name,loc;
	@UiField
	MaterialTextBox date;
	
	private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	
	@UiHandler("submit")
	void onClick0(ClickEvent e)
	{
		sevent l = new sevent();
		l.setName(name.getText());
	      l.setDate(date.getText());
	      l.setLocation(loc.getText());
		a2.fevnt(l, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
		      Window.alert(result);
		      History.newItem("gg");
				MySpace.getInstance().koifunction();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert(caught.getMessage());
			}
		});
		
		/*d.clear();
		fport f=new fport();
		d.add(f);*/
	}
	

}
