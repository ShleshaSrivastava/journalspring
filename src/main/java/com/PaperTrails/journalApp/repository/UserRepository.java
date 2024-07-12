package com.PaperTrails.journalApp.repository;

import com.PaperTrails.journalApp.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId>{
    User findByUserName(String username);

    void deleteByUserName(String username);
}
