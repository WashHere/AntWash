package com.ant.ant.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ant.ant.dto.models.UserInfo;

public interface UserInfoRepository extends MongoRepository<UserInfo, String>{
	public UserInfo findOneByName(String name);
}
