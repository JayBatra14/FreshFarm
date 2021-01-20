package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
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
import com.shared.farmerslist;
import com.shared.fdet;
import com.sun.java.swing.plaf.windows.resources.windows;

import gwt.material.design.addins.client.overlay.MaterialOverlay;
import gwt.material.design.addins.client.window.MaterialWindow;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;

public class flist extends Composite{

	private static flistUiBinder uiBinder = GWT.create(flistUiBinder.class);

	interface flistUiBinder extends UiBinder<Widget, flist> {
	}
    String c_id="";
    String username="";
	public flist() {
		initWidget(uiBinder.createAndBindUi(this));
		setup();
	}
	public flist(String cid,String username) {
		initWidget(uiBinder.createAndBindUi(this));
		this.c_id=cid;
		this.username=username;
		setup();
	}
	int i,n;
	@UiField
	MaterialButton out,event,show;
	@UiField
	MaterialContainer cc;
	@UiField
	MaterialCollection mc;

	void setup() {
		event.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub	
				History.newItem("nn");
				MySpace.getInstance().koifunction();
				/*cc.clear();
				seve s=new seve();
				cc.add(s);*/
			}
		});
	
		out.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				tan t = new tan();
				History.replaceItem("historyToken");
				History.newItem("kk");
				MySpace.getInstance().koifunction();
				History.replaceItem("historyToken");
				RootPanel.get("pp").add(t.header);
				Window.alert("You are logged out");
			}
		});
		/*cc.clear();
		login l=new login();
		cc.add(l);*/

	
		
		/*cc.clear();
		payment p=new payment();
		cc.add(p);*/
	 final GreetingServiceAsync a2 = GWT.create(GreetingService.class);
	show.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			String l="";
			a2.allfar(l, new AsyncCallback<farmerslist>() {
				
				@Override
				public void onSuccess(farmerslist result) {
					// TODO Auto-generated method stub
					n=result.getN();
					String x[]=new String[n];
					x=result.getF();
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
							public void onClick(ClickEvent event) {
								// TODO Auto-generated method stub
								
								String f_id=m1.getText();
								MySpace.getInstance().fad=f_id;
								MySpace.getInstance().c_id=c_id;
								MySpace.getInstance().username=username;
								History.newItem("dd");
								MySpace.getInstance().koifunction();
								/*fadet fd = new fadet(f_id,c_id,username);
								cc.clear();
								cc.add(fd);*/
							}
						});
					}
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert(caught.getMessage());
				}
			});

		}
	});

}
}

