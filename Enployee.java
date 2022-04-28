package com.Demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
	@Column(name="id")
int id;
	@Column(name="name")
String name;
	@Column(name="branch")
String branch;
public Employee(int id, String name, String branch) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
}
}
