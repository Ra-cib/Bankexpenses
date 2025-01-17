package com.personalbank.personalbank.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer id;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Entry> getEntries() {
	return entries;
}

public void setEntries(List<Entry> entries) {
	this.entries = entries;
}

private String username;

private String email;

@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
private  List<Entry>entries;
}

