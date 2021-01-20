package com.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.shared.Cdet;
import com.shared.FieldVerifier;
import com.shared.Reg;
import com.shared.consumerslist;
import com.shared.eve;
import com.shared.farmerslist;
import com.shared.fdet;
import com.shared.nuti;
import com.shared.sevent;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

	
	private static  String amount = null;
	private static  String cost = null;
	private static  String card_no = null;
	private static  String cvv = null;
	private static  String exp = null;
	private static  String latitude = null;
	private static  String longitude = null;
	private static  String land_area = null;
	private static  String crops = null;
	private static  String nutrients = null;
	private static  String date = null;
	private static  String location = null;
	private static  String gender = null;
	private static  String city = null;
	private static  String district = null;
	private static  String state = null;
	private static  String name = null;
	private static  String address = null;
	private static  String mobile = null;
	private static  String aadhar = null;
	private static  String email = null;
	private static  String password = null;

	
	Connection con= null;
	Statement st = null;
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/freshfarm","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	String row()
	{
		init();
		ResultSet r= null;
		String rowCount="";
		try {
			r=st.executeQuery("select count(*) from farmer");
			r.next();
			 rowCount = r.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
	}
	String row1()
	{
		init();
		ResultSet r= null;
		String rowCount="";
		try {
			r=st.executeQuery("select count(*) from event");
			r.next();
			 rowCount = r.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
	}
	@Override
	public String checkc(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String s="NO";
		try {
			rs=st.executeQuery("select * from consumer where email='"+s1+"'and password='"+s2+"'");
			if(rs.next())
				s="YES";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	@Override
	public String checkf(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String s="NO";
		try {
			rs=st.executeQuery("select * from farmer where email='"+s1+"'and password='"+s2+"'");
			if(rs.next())
				s="YES";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	@Override
	public String reg(Reg k) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		name=k.getName();
		address=k.getAddress();
		mobile=k.getMobile();
		aadhar=k.getAadhar();
		gender=k.getGender();
		city=k.getCity();
		district=k.getDistrict();
		state=k.getState();
		email=k.getEmail();
		password=k.getPassword();
		String sql="insert into consumer(name,address,mob_no,aadhar,gender,city,district,state,email,password)values('"+name+"','"+address+"','"+mobile+"','"+aadhar+"','"+gender+"','"+city+"','"+district+"','"+state+"','"+email+"','"+password+"')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x="registration success";
		return x;
	}
	@Override
	public String freg(Reg m) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		name=m.getName();
		address=m.getAddress();
		mobile=m.getMobile();
		aadhar=m.getAadhar();
		gender=m.getGender();
		city=m.getCity();
		district=m.getDistrict();
		state=m.getState();
		email=m.getEmail();
		password=m.getPassword();
		String sql="insert into farmer(name,address,mob_no,aadhar,gender,city,district,state,email,password)values('"+name+"','"+address+"','"+mobile+"','"+aadhar+"','"+gender+"','"+city+"','"+district+"','"+state+"','"+email+"','"+password+"')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x="registration success";
		return x;
	
	}
	@Override
	public String feed(String f) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		
		String y="NO";
		String sql="insert into feedback(feed)values('"+f+"')";
		try {
			st.executeUpdate(sql);
			y="YES";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return y;
	}
	@Override
	public String land(nuti n,String f_id) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		latitude =n.getLatitude();
		longitude=n.getLongitude();
		land_area=n.getLand_area();
		cost=n.getCost();
		crops=n.getCrops();
		nutrients=n.getNutrients();
		String sql="insert into land(latitude,longitude,land_area,crops,nutrients,f_id,cost)values('"+latitude+"','"+longitude+"','"+land_area+"','"+crops+"','"+nutrients+"','"+f_id+"','"+cost+"')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x="details entered";
		return x;
	}
	@Override
	public fdet det(fdet f,String fad) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs= null;
		try {
			rs=st.executeQuery("select f_id,name,address,mob_no,aadhar,email from farmer where f_id='"+fad+"'");
		if(rs.next()) {
			f.setF_id(rs.getString(1));
			f.setName(rs.getString(2));
			f.setAddress(rs.getString(3));
			f.setMobile(rs.getString(4));
			f.setAadhar(rs.getString(5));
			f.setEmail(rs.getString(6));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}
	@Override
	public String book(String f_id,String c_id,String username) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String sql="insert into book(f_id,c_id,name)values('"+f_id+"','"+c_id+"','"+username+"')";
		
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String y="Booking Successful";
		return y;
	}
	@Override
	public eve evnt(String s) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet re = null;
		String n="";
		eve ev = new eve();
		n=row1();
		int n1=Integer.parseInt(n);
		String a[]= new String[n1];
		String b[]= new String[n1];
		String c[]= new String[n1];
		int i=0;
		try {
			re=st.executeQuery("select name,date,location from event");
			while(re.next())
			{
				a[i]=re.getString(1);
				b[i]=re.getString(2);
				c[i]=re.getString(3);
				i++;
			}
		ev.setN(n1);
		ev.setNa(a);
		ev.setD(b);
		ev.setL(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return ev;
	
	}
	@Override
	public String fevnt(sevent l) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		name=l.getName();
		date=l.getDate();
		location=l.getLocation();
		String sql="insert into event(name,date,location)values('"+name+"','"+date+"','"+location+"')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x="submitted";
		return x;
	}
	@Override
	public farmerslist allfar(String l) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet r=null;
		String n="";
		farmerslist l1 = new farmerslist();
		n=row();
		int n1=Integer.parseInt(n);
		String a[]= new String[n1];
		int i=0;
		try {
			r=st.executeQuery("select f_id from farmer");
			while(r.next())
			{
				a[i]=r.getString(1);
				i++;
			}
			l1.setN(n1);
			l1.setF(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l1;
	}
	@Override
	public String fid(String s1,String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String f="";
		try {
			rs=st.executeQuery("select f_id from farmer where email='"+s1+"'and password='"+s2+"'");
			if(rs.next())
				f=rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	@Override
	public String cid(String s1,String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String c="";
		try {
			rs=st.executeQuery("select c_id from consumer where email='"+s1+"'and password='"+s2+"'");
			if(rs.next())
				c=rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	@Override
	public consumerslist allcon(String f_id) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		int n;
		consumerslist cl = new consumerslist();
		int i=0;
		try {
			rs=st.executeQuery("select c_id from book where f_id='"+f_id+"'");
			rs.last();
			n=rs.getRow();
			rs.beforeFirst();
			String a[]= new String[n];
			while(rs.next())
			{
				a[i]=rs.getString(1);
				i++;
			}
			cl.setN(n);
			cl.setC(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cl;
		
	}
	
	@Override
	public Cdet condet(Cdet c, String c_id) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs= null;
		try {
			rs=st.executeQuery("select c_id,name,address,mob_no,aadhar,email from consumer where c_id='"+c_id+"'");
		if(rs.next()) {
			c.setC_id(rs.getString(1));
			c.setName(rs.getString(2));
			c.setAddress(rs.getString(3));
			c.setMobile(rs.getString(4));
			c.setAadhar(rs.getString(5));
			c.setEmail(rs.getString(6));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	@Override
	public String cost(String f_id) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String c="";
		try {
			rs=st.executeQuery("select cost from land where f_id='"+f_id+"'");
			if(rs.next())
				c=rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	@Override
	public String amount(String f_id, String c_id, String a) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String amount=a;
		String sql="insert into payment(f_id,c_id,amount)values('"+f_id+"','"+c_id+"','"+amount+"')";
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
		}
