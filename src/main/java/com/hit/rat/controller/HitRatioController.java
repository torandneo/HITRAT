package com.hit.rat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.hit.rat.entity.HitTupple;

import com.hit.rat.service.HitRatioService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class HitRatioController {
	@Autowired
    HitRatioService hRatioService; 	
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

		List<HitTupple> hTupples = hRatioService.list();
		model.addAttribute("tupples", hTupples);
		return "welcome";	
		
	}
	
	@RequestMapping(value = "/HitRatio/", method = RequestMethod.GET)
    public ResponseEntity<List<HitTupple>> listAllTupples() {
        List<HitTupple> hTupples = hRatioService.list();
        if(hTupples.isEmpty()){
            return new ResponseEntity<List<HitTupple>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<HitTupple>>(hTupples, HttpStatus.OK);
    }

	 @RequestMapping(value = "/HitRatio/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<HitTupple> getTupple(@PathVariable("id") int id) {
	        System.out.println("Fetching Tupple with id " + id);
	        HitTupple hTupple = hRatioService.get(id);
	        if (hTupple == null) {
	            System.out.println("Tupple with id " + id + " not found");
	            return new ResponseEntity<HitTupple>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<HitTupple>(hTupple, HttpStatus.OK);
	    }
	 
	 @RequestMapping(value = "/HitRatio/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createTupple(@RequestBody HitTupple hTupple,    UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating Tupple " + hTupple.getId());
	 
	        if (hRatioService.get(hTupple.getId())!=null) {
	            System.out.println("A Tupple with name " + hTupple.getId() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }	 
	        hRatioService.save(hTupple);	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/HitRatio/{id}").buildAndExpand(hTupple.getId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	  /*  @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<HitTupple> updateTupple(@PathVariable("id") int id, @RequestBody HitTupple hTupple) {
	        System.out.println("Updating Tupple " + id);
	         
	        HitTupple cTupple = hRatioService.get(id);
	         
	        if (hTupple==null) {
	            System.out.println("Tupple with id " + id + " not found");
	            return new ResponseEntity<HitTupple>(HttpStatus.NOT_FOUND);
	        }
	 
	        cTupple.setFileName(hTupple.getFileName());
	        cTupple.setHitRatioRun1(hTupple.getHitRatioRun1());
	        cTupple.setHitRatioRun2(hTupple.getHitRatioRun2());
	        cTupple.setHitRun1(hTupple.getHitRun1());
	        cTupple.setHitRun2(hTupple.getHitRun2());
	        cTupple.setArrivalTime(hTupple.getArrivalTime());
	       
	        hRatioService.update(id, cTupple);
	       
	        return new ResponseEntity<HitTupple>(cTupple, HttpStatus.OK);
	    } */
	    	     
	    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<HitTupple> deleteUser(@PathVariable("id") int id) {
	        System.out.println("Fetching & Deleting Tupple with id " + id);
	 
	        HitTupple hTupple = hRatioService.get(id);
	        if (hTupple == null) {
	            System.out.println("Unable to delete. Tupple with id " + id + " not found");
	            return new ResponseEntity<HitTupple>(HttpStatus.NOT_FOUND);
	        }
	 
	        hRatioService.delete(id);;
	        return new ResponseEntity<HitTupple>(HttpStatus.NO_CONTENT);
	    }
	 
	     
	    //------------------- Delete All Users --------------------------------------------------------
	     
	    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	    public ResponseEntity<HitTupple> deleteAllTupples() {
	        System.out.println("Deleting All Tupples");
	 
	        //userService.deleteAllUsers();
	        return new ResponseEntity<HitTupple>(HttpStatus.NO_CONTENT);
	    }
	 
	 
	 
	 
	 
	 
	 
	 

}
