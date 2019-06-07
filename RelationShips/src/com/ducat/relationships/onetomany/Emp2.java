package com.ducat.relationships.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Emp2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private double sal;
	@OneToMany
	@JoinTable(name="emp_dept",joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="DPT_ID"))
	Collection<Dept2> dept = new ArrayList<Dept2>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", dept="
				+ dept + "]";
	}
	public Collection<Dept2> getDept() {
		return dept;
	}
	public void setDept(Collection<Dept2> dept) {
		this.dept = dept;
	}
	
	
	
}
