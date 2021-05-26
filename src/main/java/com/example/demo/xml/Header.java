package com.example.demo.xml;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Object con
 * @author jeff
 *
 */
//@XmlElement(name = "Header")
@XmlAccessorType(XmlAccessType.NONE)
public class Header implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "CurrentDate")
	Date currentDate;

	@XmlElement(name = "Records")
	String records;

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getRecords() {
		return records;
	}

	public void setRecords(String records) {
		this.records = records;
	}	
}
