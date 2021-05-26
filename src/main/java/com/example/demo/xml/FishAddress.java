package com.example.demo.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Object container for the Header from the XML data.
 * 
 * @author jeff
 */
@XmlAccessorType(XmlAccessType.NONE)
public class FishAddress  implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Ocean")
	String ocean;

	@XmlElement(name = "Reef")
	String reef;

	@XmlElement(name = "Depth")
	String depth;

	@XmlAttribute(name = "home")
	boolean isHome;

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

	public boolean isHome() {
		return isHome;
	}

	public void setHome(boolean isHome) {
		this.isHome = isHome;
	}
}
