package com.cg;

public class Sbu {
 private int sbuId;
 private String sbuName;
 private String sbuHead;
public int getSbuId() {
	return sbuId;
}
public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
public Sbu() {
	super();
	// TODO Auto-generated constructor stub
}
public Sbu(int sbuId, String sbuName, String sbuHead) {
	super();
	this.sbuId = sbuId;
	this.sbuName = sbuName;
	this.sbuHead = sbuHead;
}
@Override
public String toString() {
	return "Sbu [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead="
			+ sbuHead + "]";
}
 
}