package com.ducat;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int empno;
	//@Column(name="emp_name",length=20,nullable=false)
	private String name;
	private double sal;
	@Lob
	private String empDescription;
	
	
	
	@Temporal(TemporalType.TIME)
	private Date dob;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name="address_emp",joinColumns=@JoinColumn(name="emp_id"))
	private Set<Address> address = new HashSet<Address>();
	
	
	
	
	
	
	//@Embedded
	//@EmbeddedId
	//private Address address;
	
	//private Address offAddress;
/*	
	@AttributeOverrides( {
        @AttributeOverride(name="city", column = @Column(name="office_city") ),
        @AttributeOverride(name="state", column = @Column(name="office_state") ),
        @AttributeOverride(name="zipCode", column = @Column(name="office_zipCode") )
} )	
	private Address officeAddress;*/
	
	//@ElementCollection
	//@JoinTable(name="address_mst" , joinColumns=@JoinColumn(referencedColumnName="emp_id"))
	//private Set<Address> addressSet = new HashSet<Address>();
	
	
public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	/*	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public String getEmpDescription() {
		return empDescription;
	}
	public void setEmpDescription(String empDescription) {
		this.empDescription = empDescription;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal
				+ ", empDescription=" + empDescription + ", dob=" + dob
				 + "]";
	}
	
	
	
	
	
	

}
