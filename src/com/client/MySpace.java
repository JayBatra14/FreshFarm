package com.client;

import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

import gwt.material.design.client.ui.MaterialContainer;


public class MySpace {
	String result;
	String username;
	String f_id;
	String c_id;
	String fad;
	String cost;
	static MySpace me = null;
	clist cl=null;
	Codet co=null;
	creg c = null;
	event ev= null;
	fadet fd =null;
	feed fe =null;
	flist fl =null;
	fport fp =null;
	freg f =null;
	gall g =null;
	ldet ld =null;
	login l =null;
	payment p =null;
	regis r =null;
	seve s =null;
	tan t =null;
	private MySpace()
	{
	}
	static MySpace getInstance()
	{
		if(me==null)
			me = new MySpace();
		return me;
	}
	public void koifunction()
	{
		 if(History.getToken().contentEquals("bb"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getcreg());
		}
		else if(History.getToken().contentEquals("cc"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getevent());
		}
		else if(History.getToken().contentEquals("dd"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getfadet());
		}
		else if(History.getToken().contentEquals("ee"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getfeed());
		}
		else if(History.getToken().contentEquals("rr"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("pp").clear();
			RootPanel.get("ff").add(getflist());
		}
		else if(History.getToken().contentEquals("gg"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("pp").clear();
			RootPanel.get("ff").add(getfport());
		}
		else if(History.getToken().contentEquals("hh"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getfreg());
		}
		else if(History.getToken().contentEquals("ii"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getgall());
		}
		else if(History.getToken().contentEquals("jj"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getldet());
		}
		else if(History.getToken().contentEquals("kk"))
		{ 
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getlogin());
		}
		else if(History.getToken().contentEquals("ll"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getpayment());
		}
		else if(History.getToken().contentEquals("mm"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getregis());
		}
		else if(History.getToken().contentEquals("nn"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getseve());
		}
		else if(History.getToken().contentEquals("oo"))
		{		//RootPanel.get("pp").clear();
		        //RootPanel.get("ff").clear();
			    RootPanel.get("ff").add(gettan());
		}
		else if(History.getToken().contentEquals("qq"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getclist());
		}
		else if(History.getToken().contentEquals("ss"))
		{
			RootPanel.get("ff").clear();
			RootPanel.get("ff").add(getCodet());
		}
	}
	
	creg getcreg() {
		if(c==null) {
			c=new creg();
		}
		return c;
	}
	event getevent() {
		if(ev==null) {
			ev=new event();
		}
		return ev;
	}
	fadet getfadet() {
		fd=null; 
			fd=new fadet(fad,c_id,username);
		
		return fd;
	}
	feed getfeed() {
		if(fe==null) {
			fe=new feed();
		}
		return fe;
	}
	flist getflist() {
		if(fl==null) {
			fl=new flist(result,username);
		}
		return fl;
	}
	fport getfport() {
		if(fp==null) {
			fp=new fport(result);
		}
		return fp;
	}
	freg getfreg() {
		if(f==null) {
			f=new freg();
		}
		return f;
	}
	gall getgall() {
		if(g==null) {
			g=new gall();
		}
		return g;
	}
	ldet getldet() {
		if(ld==null) {
			ld=new ldet(f_id);
		}
		return ld;
	}
	login getlogin() {
		if(l==null) {
			l=new login();
		}
		return l;
	}
	payment getpayment() {
		if(p==null) {
			p=new payment(f_id,c_id,cost);
		}
		return p;
	}
	regis getregis() {
		if(r==null) {
			r=new regis();
		}
		return r;
	}
	seve getseve() {
		if(s==null) {
			s=new seve();
		}
		return s;
	}
	tan gettan() {
		if(t==null) {
			t=new tan();
		}
		return t;
	}
	clist getclist() {
		if(cl==null) {
			cl=new clist(f_id);
		}
		return cl;
	}
	Codet getCodet() {
		co=null; 
			co=new Codet(f_id,c_id);
		
		return co;
	}
}
