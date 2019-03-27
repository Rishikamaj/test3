package com.newt;

public class Vehicle {
private static final int IncresedSpeed = 0;
int currentSpeed;
int maximumSpeed;

public Vehicle() {}
public Vehicle(int currentSpeed,int maximumSpeed)
{this.currentSpeed=currentSpeed;
this.maximumSpeed=maximumSpeed;
}
public int getCurrentSpeed() {
	return currentSpeed;
}
public void setCurrentSpeed(int currentSpeed) {
	this.currentSpeed = currentSpeed;
}
public int getMaximumSpeed() {
	return maximumSpeed;
}
public void setMaximumSpeed(int maximumSpeed) {
	this.maximumSpeed = maximumSpeed;
}
public void IncreaseSpeed(int i) {
	// TODO Auto-generated method stub
	i=0;
}
public int IncreasedSpeed(int a) throws SpeedMorethanMaxSpeedException {
	
	int IncreasedSpeed=currentSpeed+a;
	if (IncreasedSpeed>maximumSpeed ){
		return IncreasedSpeed;}
	
		
		
	 else 
		 
		throw new SpeedMorethanMaxSpeedException("currentSpeed reaches maximumSpeed");

}}



