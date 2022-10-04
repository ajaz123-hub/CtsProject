package com.Author.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Author.Entity.Author;


@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
