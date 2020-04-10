package com.pro.cement.repository;

import com.pro.cement.model.Generic;
import com.pro.cement.model.Processing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingRepository extends MongoRepository<Processing, String> {
}
