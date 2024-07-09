// to demonstrate static var
package com.wiect.hiadt;

public class Employee {
private int empid;
private String name;
// SV shared by all the inst of the class
private static String CompanyName="BTS";
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static String getCompanyName() {
	return CompanyName;
}
public static void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public Employee(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ",CompanyName=" + CompanyName +"]";
}

}
