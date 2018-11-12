package com.cg;

import java.util.List;

public class SBU {


	int sbuCode;
	String sbuName;
	String sbuHead;
	List<Employee> empList;

	
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
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
	public List<Employee> getEmpList() {

		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		String s = "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName
				+ ", sbuHead=" + sbuHead + "]\n";
		for(Employee em : getEmpList())
			s += em+"\n";
		return s;
	}
	
	
}
