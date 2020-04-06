package com.pro.cement.service.point.impls;

import com.pro.cement.dataset.TestData;
import com.pro.cement.model.Point;
import com.pro.cement.service.point.interfaces.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Fake")
public class PointServiceFakeImpl implements IPointService {

  @Autowired
  TestData data;

    @Override
    public Point create(Point point) {
        this.data.getPoints().add(point);
        return point;
    }

    @Override
    public Point get(String id) {

        return this.data.getPoints().stream().filter(point -> point.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Point update(Point point) {
        return null;
    }

    @Override
    public Point delete(String id) {
        return null;
    }

    @Override
    public List<Point> getAll() {
        return this.data.getPoints();
    }
}
