package com.gledson.bookstoragemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gledson.bookstoragemanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
