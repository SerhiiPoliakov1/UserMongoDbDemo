package com.learn.repository;

import java.util.List;

import com.learn.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

     User findByUserName(String userName);
     List<User> findByEmail(String email);


}
