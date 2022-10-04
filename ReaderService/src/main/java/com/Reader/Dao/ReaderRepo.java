package com.Reader.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Reader.Entity.Reader;


@Repository
public interface ReaderRepo extends JpaRepository<Reader, Integer>{

}
