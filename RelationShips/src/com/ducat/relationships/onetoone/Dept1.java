package com.ducat.relationships.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dept1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int deptno;
	String deptName;
	/*@OneToOne
	Emp1 emp;*/
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	/*public Emp1 getEmp() {
		return emp;
	}
	public void setEmp(Emp1 emp) {
		this.emp = emp;
	}*/
	@Override
	public String toString() {
		return "Dept1 [deptno=" + deptno + ", deptName=" + deptName + ", emp="
				+ emp + "]";
	}
	
	

}
