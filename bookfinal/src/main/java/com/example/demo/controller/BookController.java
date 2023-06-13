package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Bookdetail;
import com.example.demo.service.BookService;


@RestController
@RequestMapping("/api/book")
@CrossOrigin("*")
public class BookController {

    private final BookService bookModelService;

    @Autowired
    public BookController(BookService bookModelService) {
        this.bookModelService = bookModelService;
    }
    
   // @GetMapping("/iphone-models")
  //public ResponseEntity<List<IphoneModel>> saveIphoneModel() {
   //     List<IphoneModel> iphoneModels = iphoneModelService.saveIphoneModel();
    //  return ResponseEntity.ok(iphoneModels);
   // }
    
    
    

    @PostMapping("/products")
    public ResponseEntity<Bookdetail> saveIphoneModel(@RequestBody Bookdetail bookModel) {
    	Bookdetail savedBookModel = bookModelService.saveBookModel(bookModel);
        return ResponseEntity.ok(savedBookModel);
    }
    @GetMapping("/display")
    public ResponseEntity<List<Bookdetail>> getAllBookModels() {
        List<Bookdetail> bookModels = bookModelService.getAllBookModels();

        // Sort the list of IphoneModel objects by some property (e.g., model name)
        bookModels.sort(Comparator.comparing(Bookdetail::getBookName));

        return ResponseEntity.ok(bookModels);}

    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteModel(@PathVariable Long id) {
        bookModelService.deleteById(id);
        return ResponseEntity.ok("BookModel with ID " + id + " has been deleted.");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Bookdetail> editBookModel(@PathVariable("id") Long id, @RequestBody Bookdetail updatedModel) {
    	Bookdetail editedModel = bookModelService.editBookModel(id, updatedModel);
        return ResponseEntity.ok(editedModel);
    }
    // Add additional endpoints for other operations
    
}

