package com.Reader.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Reader.Entity.Reader;
import com.Reader.Service.ReaderService;






@RestController
@RequestMapping("/readerservice")
public class ReaderController {
		
		  @Autowired
		  private ReaderService readerservice;

		    @PostMapping("/createreader")
		    public Reader addAuthor(@RequestBody Reader reader) {
		        return readerservice.createreader(reader);
		    }
		    
		    @GetMapping("/readerById/{reader_Id}")
		    public Reader findReaderById(@PathVariable int reader_Id) {
		        return readerservice.getReaderById(reader_Id);
		    }
		    @GetMapping("/getreaders")
		    public List<Reader> findAllreaders() {
		        return readerservice.getreaders();
		    }
}


