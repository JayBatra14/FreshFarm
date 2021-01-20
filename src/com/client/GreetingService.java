package com.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shared.Cdet;
import com.shared.Reg;
import com.shared.consumerslist;
import com.shared.eve;
import com.shared.farmerslist;
import com.shared.fdet;
import com.shared.nuti;
import com.shared.sevent;


/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
  String checkc(String s1,String s2) throws IllegalArgumentException;
  String checkf(String s1,String s2) throws IllegalArgumentException;
  String reg(Reg k) throws IllegalArgumentException;
  String freg(Reg m) throws IllegalArgumentException;
  String feed(String f)throws IllegalArgumentException;
  String land(nuti n,String f_id)throws IllegalArgumentException;
  fdet det(fdet f,String fad)throws IllegalArgumentException;
  String book(String f_id,String c_id,String username)throws IllegalArgumentException;
  String fevnt(sevent l)throws IllegalArgumentException;
  eve evnt(String s)throws IllegalArgumentException;
  farmerslist allfar(String l)throws IllegalArgumentException;
  String fid(String s1,String s2)throws IllegalArgumentException;
  String cid(String s1,String s2)throws IllegalArgumentException;
  consumerslist allcon(String f_id)throws IllegalArgumentException;
  Cdet condet(Cdet c,String c_id)throws IllegalArgumentException;
  String cost(String f_id)throws IllegalArgumentException;
  String amount(String f_id,String c_id,String a)throws IllegalArgumentException;
 
}
