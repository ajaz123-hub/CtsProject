package com.Reader.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Reader.Dao.ReaderRepo;
import com.Reader.Entity.Reader;
import com.Reader.Exception.NoSuchReaderExistsException;





@Service
public class ReaderService {
	
	@Autowired
	ReaderRepo readerRepo;
	
	public Reader createreader(Reader reader)
	{
		return readerRepo.save(reader);
	}
	
	public List<Reader> getreaders() {
        return readerRepo.findAll();
    }

    public Reader getReaderById(int reader_Id) {
        //return bookRepo.findById(book_Id).orElse(null);
    	
    	return readerRepo.findById(reader_Id).orElseThrow(
                ()
                    -> new NoSuchReaderExistsException(
                        "NO AUTHOR PRESENT WITH ID = " + reader_Id));
    }

}
