package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
import com.shared.consumerslist;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLink;

public class clist extends Composite{

	private static clistUiBinder uiBinder = GWT.create(clistUiBinder.class);

	interface clistUiBinder extends UiBinder<Widget, clist> {
	}
String f_id="";
	public clist() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	public clist(String f_id) {
		initWidget(uiBinder.createAndBindUi(this));
		this.f_id=f_id;
	}
int i,n;
	@UiField
	MaterialButton show;
	@UiField
	MaterialContainer cc;
	@UiField
	MaterialCollection mc;
	
	private final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	@UiHandler("show")
	void onClick(ClickEvent e)
	{
			a2.allcon(f_id, new AsyncCallback<consumerslist>() {
				
				@Override
				public void onSuccess(consumerslist result) {
					// TODO Auto-generated method stub
					n=result.getN();
					String x[]=new String[n];
					x=result.getC();
					mc.clear();
					for(i=0;i<n;i++)
					{
						MaterialCollectionItem mci = new MaterialCollectionItem();
						MaterialLink m1=new MaterialLink(x[i]);
						m1.setTextColor(Color.BLACK);
						mci.add(m1);
						mc.add(mci);
						mci.addClickHandler(new ClickHandler() {
							
							@Override
							public void onClick(ClickEvent arg0) {
								// TODO Auto-generated method stub
								String c_id=m1.getText();
								MySpace.getInstance().f_id=f_id;
								MySpace.getInstance().c_id=c_id;
								History.newItem("ss");
								MySpace.getInstance().koifunction();
								/*Codet cd = new Codet(f_id,c_id);
								cc.clear();
								cc.add(cd);*/
							}
						});
				}
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
		
		
	}
}

