package com.bit2015.springexample.vo;

public class BoardVo {
	String id;
	String name;
	int password;
	String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "BoardVo [id=" + id + ", name=" + name + ", password="
				+ password + ", address=" + address + "]";
	}
}
