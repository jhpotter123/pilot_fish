package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Fish;
import com.example.demo.utils.DateTimeUtils;
import com.example.demo.xml.FishAddress;

/**
 * This service class will take input from the caller and passes it 
 * onto the DAO objects.  Should full CRUD operations be needed later 
 * we would add extra methods here but for now and for the purpose of 
 * this assignment I have just inplemented the isert method.
 * 
 * @author jeff
 */
@Service
public class FishService {
    @Autowired
    private FishRepository fishRepository;

    public List<Fish> list() {
        return fishRepository.findAll();
    }
    
    public void insert(com.example.demo.xml.Fish fish) {
    	Fish outputFish = new Fish();
    	
    	String[] nameParts = fish.getName().split("\\s+");
    	if (nameParts.length == 2) {
    		outputFish.setFname(nameParts[0]);
    		outputFish.setLname(nameParts[1]);
    	}
    	
    	Date dob = fish.getDateOfBirth();
        Date currentDateTime = new Date();
        
        Map<String, Integer> diff = DateTimeUtils.getTimeLapse(dob, currentDateTime);
    	outputFish.setAge(diff.get("YEARS"));

    	List<FishAddress> addresses = fish.getAddresses();
    	// Find the home address and set it in the output record.
    	for (FishAddress currAddress : addresses) {
    		if (currAddress.isHome()) {
    			outputFish.setDepth(currAddress.getDepth());
    			outputFish.setOcean(currAddress.getOcean());
    			outputFish.setReef(currAddress.getReef());
    		}
    	}

    	// The specification doesn't appear to require the type for some reason, just adding  
    	// this comment to indicate where it would be added should we decide later to add it.
    	//fish.getClassificiation()

    	fishRepository.save(outputFish);
    }
}
