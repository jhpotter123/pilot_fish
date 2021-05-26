package com.example.demo.xml;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Object container for each individual Fish from the XML data.
 * 
 * @author jeff
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Fish implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Name")
	String name;

	@XmlElement(name = "DOB")
	Date dateOfBirth;

	@XmlElement(name = "Type")
	FishType classificiation;
	
	@XmlElement(name = "Address")
	List<FishAddress> addresses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public FishType getClassificiation() {
		return classificiation;
	}

	public void setClassificiation(FishType classificiation) {
		this.classificiation = classificiation;
	}

	public List<FishAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<FishAddress> addresses) {
		this.addresses = addresses;
	}
}
