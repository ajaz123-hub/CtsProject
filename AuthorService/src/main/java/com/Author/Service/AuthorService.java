package com.Author.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Author.Dao.AuthorRepo;
import com.Author.Entity.Author;
import com.Author.Exception.NoSuchAuthorExistsException;




@Service
public class AuthorService {
	
	@Autowired
	AuthorRepo authorRepo;
	
	public Author createauthor(Author author)
	{
		return authorRepo.save(author);
	}
	
	public List<Author> getauthors() {
        return authorRepo.findAll();
    }

    public Author getBookById(int author_Id) {
        //return bookRepo.findById(book_Id).orElse(null);
    	
    	return authorRepo.findById(author_Id).orElseThrow(
                ()
                    -> new NoSuchAuthorExistsException(
                        "NO AUTHOR PRESENT WITH ID = " + author_Id));
    }

}
