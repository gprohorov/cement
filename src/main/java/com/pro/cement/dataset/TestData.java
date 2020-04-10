package com.pro.cement.dataset;


import com.pro.cement.model.*;
import org.bson.codecs.pojo.Convention;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestData {

   private List<Point> points = new ArrayList<>(

            Arrays.asList(

                    new Point("0", "ENTRANCE", "South"),
                    new Point("1", "ENTRANCE", "West")

            )
    );

   private List<Camera> cameras = new ArrayList<>(
           Arrays.asList(
                   new Camera("0", "iVue-IPC-OB40F28-20", points.get(0), ViewPlace.BOARD, ""),
                   new Camera("1", "iVue-IPC-IT10F36-10", points.get(1), ViewPlace.BOTTOM, "")
           )
   );

   private List<Path> paths = new ArrayList<>(
     Arrays.asList()
   );


    private List<Cadr>  cadrs = new ArrayList<>(
            Arrays.asList(


                    new Cadr("1", "c1.png", LocalDateTime.now(), cameras.get(0), Paths.get("/storage")),
                    new Cadr("2", "c2.png", LocalDateTime.now(), cameras.get(0), Paths.get("/storage")),
                    new Cadr("3", "c3.png", LocalDateTime.now(), cameras.get(0), Paths.get("/storage")),
                    new Cadr("4", "c4.png", LocalDateTime.now(), cameras.get(0), Paths.get("/storage")),
                    new Cadr("5", "c5.png", LocalDateTime.now(), cameras.get(0), Paths.get("/storage"))
            )

    );


    private List<Processing>  processings = new ArrayList<>(

            Arrays.asList()
    );

    //------------------------------------------------------------------------------------



    public List<Point> getPoints() {
        return points;
    }

    public Point setPoint(Point point){
        Integer size = this.points.size();
        point.setId(size.toString());
        this.points.add(point);
        return point;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Camera> getAllCameras(){
        return this.cameras;
    }

    public Camera getCamera(String id){
        return this.cameras
                .stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Camera setCamera(Camera camera){
        Integer size = this.cameras.size();
        camera.setId(size.toString());
        this.cameras.add(camera);
        return camera;
    }

    public Camera delete(String id){
        Camera camera = this.getCamera(id);
        Point point = camera.getPoint();
        points.remove(point);
        cameras.remove(camera);
        return camera;
    }


    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    public List<Cadr> getCadrs() {
        return cadrs;
    }

    public void setCadrs(List<Cadr> cadrs) {
        this.cadrs = cadrs;
    }

    public List<Processing> getProcessings() {
        return processings;
    }

    public void setProcessings(List<Processing> processings) {
        this.processings = processings;
    }
}
