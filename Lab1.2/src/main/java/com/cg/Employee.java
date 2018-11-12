package com.cg;

public class Employee {
  private String ename;
  private double esalary;
  private int eid;
  private Sbu businessUnit;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public Sbu getBusinessUnit() {
	return businessUnit;
}
public void setBusinessUnit(Sbu businessUnit) {
	this.businessUnit = businessUnit;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", esalary=" + esalary + ", eid=" + eid
			+ ", businessUnit=" + businessUnit + "]";
}

}
