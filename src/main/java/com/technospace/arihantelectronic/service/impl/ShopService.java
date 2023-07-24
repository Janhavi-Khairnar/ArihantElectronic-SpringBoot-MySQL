package com.technospace.arihantelectronic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technospace.arihantelectronic.entity.ShopEntity;
import com.technospace.arihantelectronic.model.ShopModel;
import com.technospace.arihantelectronic.repo.ShopRepo;
import com.technospace.arihantelectronic.service.IShopInterface;
import com.technospace.arihantelectronic.util.JMSUtil;

@Service
public class ShopService implements IShopInterface{

	@Autowired
	ShopRepo shopRepo;
	@Autowired
	JMSUtil jmsUtil;
	
	@Override
	public String adddetails(ShopModel shopModel) {
		
		ShopEntity shopEntity = new ShopEntity();
		shopEntity.setCid(shopModel.getCid());
		shopEntity.setCname(shopModel.getCname());
		shopEntity.setCproduct(shopModel.getCproduct());
		shopEntity.setPrice(shopModel.getPrice());
		shopEntity.setDate(shopModel.getDate());
		shopEntity.setEmailid(shopModel.getEmailid());
		shopEntity.setAddress(shopModel.getAddress());
		shopEntity.setMobno(shopModel.getMobno());
	
		shopRepo.save(shopEntity);
		
		jmsUtil.sendmail(shopModel.getEmailid(), "Thank You Message", "Thank You So Much Sir, for coming in our shop and purchesing item.");
		
		return "Data added successfully...";
	}

	
	
}
