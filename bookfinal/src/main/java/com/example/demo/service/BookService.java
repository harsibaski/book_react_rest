package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookdetail;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookModelRepository;

    @Autowired
    public BookService(BookRepository bookModelRepository) {
        this.bookModelRepository = bookModelRepository;
    }

    public Page<Bookdetail> getAllBookModels(Pageable pageable) {
        return bookModelRepository.findAllByOrderByBookNameAsc(pageable);
    }

  
    public Bookdetail saveBookModel(Bookdetail bookModel) {
        return bookModelRepository.save(bookModel);
        
    }
    public List<Bookdetail> getAllBookModels() {
        return bookModelRepository.findAll();
    }

    public List<Bookdetail> searchBookModels(String query) {
        return bookModelRepository.findByBookNameContainingIgnoreCase(query);
    }

    

    public Optional<Bookdetail> getBookModelById(Long id) {
        return bookModelRepository.findById(id);
    }

  

    public void deleteModel(Long id) {
        bookModelRepository.deleteById(id);
    }

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookModelRepository.deleteById(id);
		
	}

	public Optional<Bookdetail> findById(Long id) {
		// TODO Auto-generated method stub
		return bookModelRepository.findById(id);
	}

	public Bookdetail save(Bookdetail existingBookModel) {
		// TODO Auto-generated method stub
		return bookModelRepository.save(existingBookModel);
	}
	 public Bookdetail editBookModel(Long id, Bookdetail updatedModel) {
	        // Find the existing model by ID
	        Optional<Bookdetail> optionalModel = bookModelRepository.findById(id);
	        if (optionalModel.isPresent()) {
	        	Bookdetail existingModel = optionalModel.get();
	            
	            // Update the properties of the existing model
	            existingModel.setBookName(updatedModel.getBookName());
	            existingModel.setPrice(updatedModel.getPrice());
	            existingModel.setYear(updatedModel.getYear());
	            existingModel.setColor(updatedModel.getColor());
	            
	            // Save the updated model
	            return bookModelRepository.save(existingModel);
	        } else {
	            return null;
	        }
	    }
	 
	 

    // Add any additional methods for CRUD operations or custom business logic
    
}

