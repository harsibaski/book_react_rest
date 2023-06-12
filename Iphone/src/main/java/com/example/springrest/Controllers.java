package com.example.springrest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	
	@Autowired
	CusInterface s1;
	@Autowired
	PhnInterface s2;
	@PostMapping("/postcus")
	public String postcus(@RequestBody Customers c1)
	{
		s1.save(c1);
		return "Your record is saved in customer";
		
	}
	
	 @GetMapping("/gtcus")
	 public List<Customers> getcus()
	 {
		 return s1.findAll();

	    }
	 @PutMapping("/putcus")
		public String putcus(@RequestBody Customers c1)
		{
			s1.save(c1);
			return "Updated in customer";
		}
	 
	 @DeleteMapping("/delcus/{id}")
	 public String deletecus(@PathVariable ("id") int id ) {
		 
		 s1.deleteById(id);
		return "Data is deleted from customer";
	 }
	 
	 @PostMapping("/postmod")
		public String postmod(@RequestBody Phnmodel p1 )
		{
			s2.save(p1);
			return "Your record is saved in phnmodel";
			
		}
	 
	
	 
	 
	 
	 
	 @PutMapping("/putmod")
		public String putmod(@RequestBody Phnmodel p1)
		{
			s2.save(p1);
			return "Updated in phnmodel";
		}
		
		 @GetMapping("/gtmod")
		 public List<Phnmodel> getmod()
		 {
			 return s2.findAll();

		    }
		 
		 @DeleteMapping("/delmod")
		 public String deletemod() {
			 
			 s1.deleteAll();
			return "Data is deleted from phnmodel";
		 }
}