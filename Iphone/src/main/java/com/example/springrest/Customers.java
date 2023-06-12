package com.example.springrest;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="Customer")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String model1;
	private int phone;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="new")
	private Phnmodel phnmodel;*/
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="new1",referencedColumnName="id")
	private List<Phnmodel> phnmodel;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel1() {
		return model1;
	}

	public void setModel1(String model1) {
		this.model1 = model1;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Phnmodel> getPhnmodel() {
		return phnmodel;
	}

	public void setPhnmodel(List<Phnmodel> phnmodel) {
		this.phnmodel = phnmodel;
	}

	public Customers(int id, String name, String model1, int phone, List<Phnmodel> phnmodel) {
		super();
		this.id = id;
		this.name = name;
		this.model1 = model1;
		this.phone = phone;
		this.phnmodel = phnmodel;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", model1=" + model1 + ", phone=" + phone + ", phnmodel="
				+ phnmodel + "]";
	}
	
	
	

}
