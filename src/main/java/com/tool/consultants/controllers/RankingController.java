package com.tool.consultants.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class RankingController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String getRanking(){
		return "Test";	
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void UpdateRanking(@RequestParam("name") String name,
			@RequestParam("rank") int rank){
			
	}
	
	

}
