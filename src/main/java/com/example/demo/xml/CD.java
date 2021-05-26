package com.example.demo.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Object container for each individual Fish from the CD data.
 * NOTE this is not used in this application, I used it for the cd 
 * music data to get the xslt transformation logic working because 
 * there was a more variety of test data since the logic is exactly 
 * the same.  I didn't delete it so you could see my process to 
 * come up with the solution.  Test data and xslt files are included 
 * 
 * @author jeff
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CD implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "artist")
	private String artist;
	@XmlElement(name = "title")
	private String title;

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
