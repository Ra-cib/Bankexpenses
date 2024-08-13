package com.personalbank.personalbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Entry {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer id;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

private String description;

private String  type;

private Double amount;

@ManyToOne
@JoinColumn(name="user_id")
private User user;
}
