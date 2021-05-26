package com.example.demo.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Object container for the root object called SchoolOfApplicants from the XML data.
 * 
 * @author jeff
 */
@XmlRootElement(name = "SchoolOfApplicants")
@XmlAccessorType(XmlAccessType.NONE)
public class SchoolOfApplicants implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name="Header")
	private Header header;

	@XmlElement(name="Fish")
	private List<Fish> fishList;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public List<Fish> getFishList() {
		return fishList;
	}

	public void setFishList(List<Fish> fishList) {
		this.fishList = fishList;
	}
}
