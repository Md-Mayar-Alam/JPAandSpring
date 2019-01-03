package com.model;
// Generated Jan 1, 2019 3:35:28 PM by Hibernate Tools 5.2.10.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "jpa_spring")
public class Student implements java.io.Serializable {

	private Long studentId;
	private String name;
	private Byte age;

	public Student() {
	}

	public Student(String name, Byte age) {
		this.name = name;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	public Long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Column(name = "NAME", length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "AGE")
	public Byte getAge() {
		return this.age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

}