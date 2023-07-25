package com.technospace.arihantelectronic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technospace.arihantelectronic.entity.ShopEntity;
import com.technospace.arihantelectronic.model.ShopModel;
import com.technospace.arihantelectronic.service.IShopInterface;
import com.technospace.arihantelectronic.service.impl.ShopService;

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
	
	@GetMapping("/getinfobyid/{cid}")
	public ShopEntity getinfobyid(@PathVariable("cid") int cid) {
		return shopInterface.getinfobyid(cid);
	}
	
	@GetMapping("/showalldetails")
	public ResponseEntity<List<ShopEntity>> showalldetails() {
		return new ResponseEntity<List<ShopEntity>>(shopInterface.showalldetails(),HttpStatus.ACCEPTED);
	}
}
