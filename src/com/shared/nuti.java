package com.shared;

import java.io.Serializable;

public class nuti implements Serializable{
public String longitude;

public String cost;
public String latitude;
public String land_area;
public String nutrients;
public String crops;
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
public String getLand_area() {
	return land_area;
}
public void setLand_area(String land_area) {
	this.land_area = land_area;
}
public String getNutrients() {
	return nutrients;
}
public void setNutrients(String nutrients) {
	this.nutrients = nutrients;
}
public String getCrops() {
	return crops;
}
public void setCrops(String crops) {
	this.crops = crops;
}
}
