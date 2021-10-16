package org.sm.entity;

import java.io.Serializable;
import java.util.List;

public class Card implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String code;
	private List<Student> students;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", code=" + code + ", students=" + students + "]";
	}
	
	
	
	
	
}
