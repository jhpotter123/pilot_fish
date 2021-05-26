package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity bean object for saving (and ultimately full CRUD operations) 
 * to be performed on the POLISEAHOLDERS table.  Note for the sake of this 
 * extercise it was asked to consume an xml file and then insert records 
 * in the database.  As we add to this application obviously we would add 
 * full CRUD operations.
 * 
 * @author jeff
 */
@Entity(name ="POLISEAHOLDERS")
public class Fish {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "FNAME", length = 50)
    private String fname;
    
    @Column(name = "LNAME", length = 50)
    private String lname;
    
    @Column(name = "AGE")
    private int age;
    
    @Column(name = "HOME_OCEAN", length = 50)
    private String ocean;

    @Column(name = "HOME_REEF", length = 50)
    private String reef;

    @Column(name = "HOME_METERS", length = 50)
    private String depth;

	public Long getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOcean() {
		return ocean;
	}

	public void setOcean(String ocean) {
		this.ocean = ocean;
	}

	public String getReef() {
		return reef;
	}

	public void setReef(String reef) {
		this.reef = reef;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}
}
