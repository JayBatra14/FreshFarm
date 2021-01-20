package com.client;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.api.ApiRegistry;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.incubator.client.google.recaptcha.ReCaptcha;
import gwt.material.design.incubator.client.google.recaptcha.api.RecaptchaApi;

public class login extends Composite {

	private static loginUiBinder uiBinder = GWT.create(loginUiBinder.class);

	interface loginUiBinder extends UiBinder<Widget, login> {
	}

	public login() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	MaterialTextBox email; 
@UiField
MaterialContainer c;

	@UiField
	MaterialTextBox password ;
	
	@UiField
	MaterialButton button;
	@UiField
	MaterialButton button1;
	
	public login(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	
	@UiHandler("button")
	void onClick(ClickEvent e) {
		String username= email.getText();
		String pass=password.getText();
		a2.checkc(username, pass, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
			
					if(result.equals("YES"))
					{
					
					Window.alert("Login Success");
					a2.cid(username, pass, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							//Window.alert(result);
							/*c.clear();
							flist f=new flist(result,username);
							c.add(f);*/
							MySpace.getInstance().result=result;
							MySpace.getInstance().username=username;
							History.newItem("rr");
							MySpace.getInstance().koifunction();
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							Window.alert(caught.getMessage());
						}
					});
					email.setText("");
					password.setText("");
					}
					else
						Window.alert("No Access");
				
					
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert(caught.getMessage());
			}
		});
	}
	
	@UiHandler("button1")
	void onClick1(ClickEvent e) {
		String username = email.getText();
		String pass=password.getText();
		a2.checkf(username, pass, new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				if(result.equals("YES"))
				{
					Window.alert("Login Success");
					a2.fid(username, pass, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							//Window.alert(result);
							/*c.clear();
							fport f=new fport (result);
							c.add(f);*/
							MySpace.getInstance().result=result;
							History.newItem("gg");
							MySpace.getInstance().koifunction();
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							Window.alert(caught.getMessage());
						}
					});
					
					email.setText("");
					password.setText("");
				}
				else
					Window.alert("No Access");
				
					
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert(caught.getMessage());
			}
		});
	}
	
}
