package com.example.springrest;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CusInterface  extends JpaRepository<Customers,Integer>{

}