package com.tool.consultants.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.tool.consultants.model.Consultant;

@Controller
public class RankingController {
	
	 
	 
	 @RequestMapping("/ranking")
	  public @ResponseBody List<Consultant> home() {
		 List<Consultant> consultantList = new ArrayList<Consultant>();
	    Consultant consultant1 = new Consultant();
	    consultant1.setConsultantName("James");
	    consultant1.setMonth("January");
	    consultant1.setAmount("56000");
	    consultantList.add(consultant1);
	    Consultant consultant2 = new Consultant();
	    consultant2.setConsultantName("Emily");
	    consultant2.setMonth("February");
	    consultant2.setAmount("62000");
	    consultantList.add(consultant2);
	    Consultant consultant3 = new Consultant();
	    consultant3.setConsultantName("James");
	    consultant3.setMonth("February");
	    consultant3.setAmount("42000");
	    consultantList.add(consultant3);
	    return consultantList;
	  }

}
