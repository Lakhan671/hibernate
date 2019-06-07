package com.ducat.relationships.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Dept3 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int deptno;
	String deptName;
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private Emp3 emp3;
	
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
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptName=" + deptName + "]";
	}
	public Collection<Emp3> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Emp3> emp) {
		this.emp = emp;
	}
	
	

}
