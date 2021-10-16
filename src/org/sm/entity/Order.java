package org.sm.entity;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private Integer id;
	private String code;
	private Double total;
	private User user;
	private List<Article> articles;
	
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
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Article> getArticle() {
		return articles;
	}
	public void setArticle(List<Article> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", total=" + total + ", user=" + user + ", article=" + articles
				+ "]";
	}
	
	
	
	
}
