package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringMVCRESTFulController {
	
	@RequestMapping(value = "/populateDataFromServer/{name}",  method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<Integer> populateActivePSwapBasketGET(@PathVariable String name) {		
		
		if (name.equalsIgnoreCase("James T Kirk")) {
			return returnDataList();
		}else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(12345);
			return list;
		}
		
	}

	@RequestMapping(value = "/populateDataFromServer", method=RequestMethod.POST, produces={"application/json"})
	public @ResponseBody List<Integer> populateActivePSwapBasketPOST(@RequestParam String name) {		
		
		if (name.equalsIgnoreCase("James T Kirk")) {
			return returnDataList();
		}else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(12345);
			return list;
		}
	}
	
	@RequestMapping(value = "/populateDataFromServer/{name}", method=RequestMethod.PUT, produces={"application/json"})
	public @ResponseBody List<Integer> populateActivePSwapBasketPUT(@PathVariable String name) {		
		
		if (name.equalsIgnoreCase("James T Kirk")) {
			return returnDataList();
		}else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(12345);
			return list;
		}
	}
	
	@RequestMapping(value = "/populateDataFromServer/{name}", method=RequestMethod.DELETE, produces={"application/json"})
	public @ResponseBody List<Integer> populateActivePSwapBasketDelete(@PathVariable String name) {		
		
		if (name.equalsIgnoreCase("James T Kirk")) {
			return returnDataList();
		}else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(12345);
			return list;
		}
	}
	
	private List<Integer> returnDataList() {
		Random rand = new Random();
	    Integer randomNum = rand.nextInt();		
		List<Integer> list = new ArrayList<Integer>();
		list.add(randomNum);		
		return list;
	}

}
