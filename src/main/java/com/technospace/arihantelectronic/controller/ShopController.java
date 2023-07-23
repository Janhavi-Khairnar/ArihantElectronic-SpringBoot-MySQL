package com.technospace.arihantelectronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technospace.arihantelectronic.model.ShopModel;
import com.technospace.arihantelectronic.service.IShopInterface;

@RestController
@RequestMapping("/ElectronicShop")
public class ShopController {

	@Autowired
	IShopInterface shopInterface;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Arihant Electronics";
	}
	
	@PostMapping("/adddetails")
	public String adddetails(@RequestBody ShopModel shopModel) {
		return shopInterface.adddetails(shopModel);
	}
}
