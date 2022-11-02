package com.trungtamjava.model;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm {
	private int id;
	private String name;
	private String phone;
	private String username;
	private String password;
	private String about;
	private String role;
	private String favourites;
	private String avatar;
	
	public User() {
	}
	public User(int id, String name, String phone, String username, String password, String about, String role,
			String favourites, String avatar) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.about = about;
		this.role = role;
		this.favourites = favourites;
		this.avatar = avatar;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFavourites() {
		return favourites;
	}
	public void setFavourites(String favourites) {
		this.favourites = favourites;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	
	
}
