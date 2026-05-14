package com.social.SocialNetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.social.SocialNetwork.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
