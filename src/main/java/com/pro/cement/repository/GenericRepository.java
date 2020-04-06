package com.pro.cement.repository;

import com.pro.cement.model.Generic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends MongoRepository<Generic, String> {
}
