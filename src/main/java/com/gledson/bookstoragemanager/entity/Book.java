package com.gledson.bookstoragemanager.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer pages;
	
	@Column(nullable = false)
	private Integer chapters;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false, name = "publisher_name", unique = true)
	private String publishName;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name = "author_id")
	private Author author;
	
}
