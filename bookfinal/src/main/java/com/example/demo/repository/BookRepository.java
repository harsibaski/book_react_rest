package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bookdetail;

@Repository
public interface BookRepository extends JpaRepository<Bookdetail, Long> {
    
    Page<Bookdetail> findAllByOrderByBookNameAsc(Pageable pageable);
    List<Bookdetail> findByBookNameContainingIgnoreCase(String query);

    
    // Add any additional methods for custom queries if needed
    
}

