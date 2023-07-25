package com.technospace.arihantelectronic.service;

import java.util.List;

import com.technospace.arihantelectronic.entity.ShopEntity;
import com.technospace.arihantelectronic.model.ShopModel;

public interface IShopInterface {

	public String adddetails(ShopModel shopModel);
	public ShopEntity getinfobyid(int cid);
	public List<ShopEntity> showalldetails();
}
