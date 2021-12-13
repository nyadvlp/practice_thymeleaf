package com.example.demo.fruit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitController {
	
	@GetMapping("/fruit")
	public String getFruit(Model model) {
		
		Map<String, String> fruitMap = new HashMap<String, String>();
		fruitMap.put("fruit1", "apple");
		fruitMap.put("fruit2", "banana");
		fruitMap.put("fruit3", "pineapple");
		model.addAttribute("fruit", fruitMap);
		return "fruit/fruit";
	}

}
