package com.social.SocialNetwork.services;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.social.SocialNetwork.entities.User;

public interface UserService extends MongoRepository<User, String> {

}
