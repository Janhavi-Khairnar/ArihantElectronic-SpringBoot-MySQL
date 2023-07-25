package com.technospace.arihantelectronic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technospace.arihantelectronic.entity.ShopEntity;

@Repository
public interface ShopRepo extends JpaRepository<ShopEntity, Integer>{

	public ShopEntity getShopEntityByCid(int cid);
	
}
