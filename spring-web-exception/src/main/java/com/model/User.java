package com.model;

public class User {
private int uid;
private String uname;
private String email;
private String city;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public User(int uid, String uname, String email, String city) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.email = email;
	this.city = city;
}


}
