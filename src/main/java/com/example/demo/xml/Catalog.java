package com.example.demo.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Object container for each individual Fish from the Catalog data.
 * NOTE this is not used in this application, I used it for the cd 
 * music data to get the xslt transformation logic working because 
 * there was a more variety of test data since the logic is exactly 
 * the same.  I didn't delete it so you could see my process to 
 * come up with the solution.  Test data and xslt files are included 
 * 
 * @author jeff
 */
@XmlRootElement(name = "catalog")
@XmlAccessorType(XmlAccessType.NONE)
public class Catalog implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name="cd")
	private List<CD> cdList;

	public List<CD> getCdList() {
		return cdList;
	}

	public void setCdList(List<CD> cdList) {
		this.cdList = cdList;
	}
}
