package com.example.microservices.limitsservice.bean;

public class LimitConfiguration {
 private int maximum;
 private int minimum;
 private String name;
 
 LimitConfiguration(){}
 
public LimitConfiguration(int maximum, int minimum,String name) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
	this.name=name;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

 
 
}
