package com.shared;

import java.io.Serializable;

public class eve implements Serializable {
int n;
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public String[] getNa() {
	return na;
}
public void setNa(String[] na) {
	this.na = na;
}
public String[] getD() {
	return d;
}
public void setD(String[] d) {
	this.d = d;
}
public String[] getL() {
	return l;
}
public void setL(String[] l) {
	this.l = l;
}
String[] na = new String[n];
String[] d = new String[n];
String[] l = new String[n];
}
