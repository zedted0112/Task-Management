package com.nitindev.repository;

import com.nitindev.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,Long>{

    public User findByEmail(String email);


}
