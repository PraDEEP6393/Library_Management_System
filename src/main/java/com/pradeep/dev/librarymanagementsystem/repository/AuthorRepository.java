package com.pradeep.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.dev.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
