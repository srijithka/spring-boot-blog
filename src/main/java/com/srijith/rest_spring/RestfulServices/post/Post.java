package com.srijith.rest_spring.RestfulServices.post;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.srijith.rest_spring.RestfulServices.user.User;




@Entity
public class Post {
	@Id
	private Integer pid;
	private String message;
	private Date dateCreated;
	
	@ManyToOne
	private User user;
	
	
	
	public Post()
	{
		super();
	}
	public Post(int id, String name, Date date) {
		super();
		this.pid = id;
		this.message = name;
		this.dateCreated = date;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(int id) {
		this.pid = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String name) {
		this.message = name;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date date) {
		this.dateCreated = date;
	}
	
	public void setUser(User user)
	{
		this.user=user;
	}
	

}
