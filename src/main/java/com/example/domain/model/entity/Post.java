package com.example.domain.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private int id;
	
	String userId;
	String name;
	
	@NotNull
	@Size(min=1, max=255)
	@Column(nullable = false)
	private String title;
	
	@Size(max=255)
	private String subtitle;
	
	@NotNull
	@Size(min=1, max=100000000)
	@Column(length = 100000000, nullable=false)
	private String content;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime regDate;
	
	private String _csrf;

}
