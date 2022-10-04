package com.Author.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Author.Entity.Author;
import com.Author.Service.AuthorService;






@RestController
@RequestMapping("/authorservice")
public class AuthorController {
		
		  @Autowired
		  private AuthorService authorservice;

		    @PostMapping("/createauthor")
		    public Author addAuthor(@RequestBody Author author) {
		        return authorservice.createauthor(author);
		    }
		    
		    @GetMapping("/authorById/{author_Id}/{getbooks}")
		    public Author findAuthorById(@PathVariable int author_Id) {
		        return authorservice.getBookById(author_Id);
		    }
		    @GetMapping("/getauthors")
		    public List<Author> findAllAuthors() {
		        return authorservice.getauthors();
		    }
}


