package com.pro.cement.dataset;


import com.pro.cement.model.Point;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestData {

   private List<Point> points = new ArrayList<>(

            Arrays.asList(

                    new Point("1", "ENTRANCE", "South"),
                    new Point("2", "ENTRANCE", "West")

            )
    );

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
