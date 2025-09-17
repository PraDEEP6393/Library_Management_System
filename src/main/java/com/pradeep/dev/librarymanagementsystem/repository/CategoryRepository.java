package com.pradeep.dev.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.dev.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
