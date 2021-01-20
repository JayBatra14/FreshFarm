package com.client;

import javax.servlet.AsyncEvent;

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
import com.shared.eve;
import com.shared.sevent;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextBox;

public class seve extends Composite {

	private static seveUiBinder uiBinder = GWT.create(seveUiBinder.class);

	interface seveUiBinder extends UiBinder<Widget, seve> {
	}

	public seve() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	int i,n;

	@UiField
	MaterialContainer cc;
	@UiField
	MaterialCollection mc;

	public seve(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		//button.setText(firstName);
	}
	
	
	private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	@UiHandler("show")
	void onClick1(ClickEvent e)
	{
		String s="";
		a2.evnt(s, new AsyncCallback<eve>() {
			
			@Override
			public void onSuccess(eve result) {
				// TODO Auto-generated method stub
				n=result.getN();
				String a[]=new String[n];
				String b[]=new String[n];
				String c[]=new String[n];
				a=result.getNa();
				b=result.getD();
				c=result.getL();
				mc.clear();
				for(i=0;i<n;i++)
				{
					MaterialCollectionItem mci = new MaterialCollectionItem();
					MaterialLink m1=new MaterialLink("Name:"+a[i]+", Date:"+b[i]+", Location:"+c[i]+"");
					m1.setTextColor(Color.BLACK);
					mci.add(m1);
					mc.add(mci);
			}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert(caught.getMessage());
			}
		});
		
}
	}


