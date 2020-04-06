package com.pro.cement.repository;

import com.pro.cement.model.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends MongoRepository<Point, String> {
}
