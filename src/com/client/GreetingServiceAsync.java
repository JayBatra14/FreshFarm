package com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.shared.Cdet;
import com.shared.Reg;
import com.shared.consumerslist;
import com.shared.eve;
import com.shared.farmerslist;
import com.shared.fdet;
import com.shared.nuti;
import com.shared.sevent;


/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
  void checkc(String s1,String s2, AsyncCallback<String> callback)
      throws IllegalArgumentException;
  void checkf(String s1,String s2, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void reg(Reg k, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void freg(Reg m, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void feed(String f, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void land(nuti n,String f_id, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void det(fdet f,String fad, AsyncCallback<fdet> callback)
	      throws IllegalArgumentException;
  void book(String f_id,String c_id,String username, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void fevnt(sevent l, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void evnt(String s, AsyncCallback<eve> callback)
	      throws IllegalArgumentException;
  void allfar(String l, AsyncCallback<farmerslist> callback)
	      throws IllegalArgumentException;
  void fid(String s1,String s2, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void cid(String s1,String s2, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void allcon(String f_id, AsyncCallback<consumerslist> callback)
	      throws IllegalArgumentException;
  void condet(Cdet c,String c_id, AsyncCallback<Cdet> callback)
	      throws IllegalArgumentException;
  void cost(String f_id, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
  void amount(String f_id,String c_id,String a, AsyncCallback<String> callback)
	      throws IllegalArgumentException;
}