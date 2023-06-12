package com.example.springrest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="Phnmodel")
public class Phnmodel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String phnmod;
	private int ram;
	private int rom;
	
	
	@Override
	public String toString() {
		return "Phnmodel [pid=" + pid + ", phnmod=" + phnmod + ", ram=" + ram + ", rom=" + rom + "]";
	}
	public Phnmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phnmodel(int pid, String phnmod, int ram, int rom) {
		super();
		this.pid = pid;
		this.phnmod = phnmod;
		this.ram = ram;
		this.rom = rom;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPhnmod() {
		return phnmod;
	}
	public void setPhnmod(String phnmod) {
		this.phnmod = phnmod;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}

}
