package com.pro.cement.service.camera.impls;

import com.pro.cement.dataset.TestData;
import com.pro.cement.model.Camera;
import com.pro.cement.service.camera.interfaces.ICameraService;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CameraServiceFakeImpl implements ICameraService {

    private String str;
    private boolean startStop = true;

    private int minute;
    private int count;
    String userDirectory = new File("").getAbsolutePath();

    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}

    VideoCapture camera = new VideoCapture(0);

    private final TestData data;

    @Autowired
    public CameraServiceFakeImpl(TestData data) {
        this.data = data;
    }

    @Override
    public Camera create(Camera camera) {
        return this.data.setCamera(camera);
    }

    @Override
    public Camera get(String id) {
        return data.getCamera(id);
    }

    @Override
    public Camera update(Camera camera) {
        return null;
    }

    @Override
    public Camera delete(String id) {
        return data.delete(id);
    }

    @Override
    public List<Camera> getAll() {
        return this.data.getAllCameras();
    }

    public void setBooleanCamera(boolean start) {
        this.startStop = start;
    }

    public void startStop(){

        camera.set(Videoio.CAP_PROP_FRAME_WIDTH, 1280);
        camera.set(Videoio.CAP_PROP_FRAME_HEIGHT, 720);

        Mat frame = new Mat();


        while (true) {
            if (camera.read(frame)) {
                if(startStop) {

                    System.out.println("Captured Frame Width " + frame.width() + " Height " + frame.height());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(LocalDateTime.now().getSecond() == minute){
                        count++;
                    }
                    else {
                        minute = LocalDateTime.now().getSecond();
                        count = 1;
                    }

                    this.str = LocalDateTime.now().getYear() + "-" + LocalDateTime.now().getMonthValue() + "-" + LocalDateTime.now().getDayOfMonth() + "_" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + "camera" + count + ".jpg";

                    Imgcodecs.imwrite(this.userDirectory + "/storage/" + this.str, frame);

                    System.out.println(this.str);
                }
            }
        }
    }
}
