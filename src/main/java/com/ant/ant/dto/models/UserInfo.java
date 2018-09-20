package com.ant.ant.dto.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class UserInfo {
	@Id
	private String id;
	private String name;
	private String city;
	private String email;
	private String phone;
	private String address;
	private String roomNumber;
	private String postcode;
	private List<String> washingItem;
	private List<String> specialInstruction;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public List<String> getWashingItem() {
		return washingItem;
	}
	public void setWashingItem(List<String> washingItem) {
		this.washingItem = washingItem;
	}
	public List<String> getSpecialInstruction() {
		return specialInstruction;
	}
	public void setSpecialInstruction(List<String> specialInstruction) {
		this.specialInstruction = specialInstruction;
	}
	
	
	
	
}
