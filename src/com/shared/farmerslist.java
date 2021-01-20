package com.shared;

import java.io.Serializable;

public class farmerslist implements Serializable{

	int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String[] getF() {
		return f;
	}
	public void setF(String[] f) {
		this.f = f;
	}
	String f[]= new String[n];
}
