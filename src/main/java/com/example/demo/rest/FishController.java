package com.example.demo.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBResult;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FishService;
import com.example.demo.xml.Fish;
import com.example.demo.xml.SchoolOfApplicants;
import com.google.gson.Gson;

/**
 * Created REST API endpoint to inport data from the xml file and pass it on to
 * the the FishService to be written to the database.
 * 
 * @author jeff
 */
@RestController
public class FishController {
	@Autowired
	private FishService fishService;

	// To test this end point you can use the URL
	// http://localhost:8080/load_fish_data?inputFile=./fish-data.xml
	@GetMapping(path = "/load_fish_data")
	public String loadFishData(@RequestParam("inputFile") String inputFile) {
		Gson gson = new Gson();
		boolean res = false;
		try {
			// the xslt template is a fixed template that will not only changes as
			// we change the format of the input file so it can be in the resource
			// directory.
			File xsltPath = new ClassPathResource("transform-fish.xslt").getFile();
			Source xslt = new StreamSource(xsltPath);

			
			File f = new File(inputFile);
			if(!f.exists()) { 
				throw new Exception("File not found");
			}
			Source xml = new StreamSource(new File(inputFile));

			TransformerFactory factory = TransformerFactory.newInstance();
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
			factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

			Transformer transformer;
			transformer = factory.newTransformer(xslt);

			JAXBResult result = new JAXBResult(JAXBContext.newInstance(SchoolOfApplicants.class));

			transformer.transform(xml, result);

			SchoolOfApplicants allData = (SchoolOfApplicants) result.getResult();

			// For each fish in the data file create a new DAO fish and save it.
			for (Fish fish : allData.getFishList()) {
				fishService.insert(fish);
			}
			res = true;
		} catch (IOException e) {
			//e2.printStackTrace();
			System.err.println(e.getMessage());
			res = false;
		} catch (TransformerConfigurationException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
			res = false;
		} catch (TransformerException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
			res = false;
		} catch (JAXBException e) {
			//e1.printStackTrace();
			System.err.println(e.getMessage());
			res = false;
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
			res = false;
		}

		return gson.toJson(res);
	}
}
