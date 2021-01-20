package com.shared;

import java.io.Serializable;

public class sevent implements Serializable{
public String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String date;
public String location;
}
