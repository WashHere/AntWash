package com.ant.ant.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ant.ant.dto.models.Price;

public interface PriceRepository extends MongoRepository<Price, String>{
	public Price findOneByName(String name);

	public void deleteByName(String name);
}
