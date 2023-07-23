package com.technospace.arihantelectronic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ElectronicShop")
public class ShopController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to Arihant Electronics";
	}
	
}
