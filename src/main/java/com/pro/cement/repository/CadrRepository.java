package com.pro.cement.repository;

import com.pro.cement.model.Cadr;
import com.pro.cement.model.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadrRepository extends MongoRepository<Cadr, String> {
}
