package com.pro.cement.model;

import java.nio.file.Path;
import java.time.LocalDateTime;

public class Cadr {   //  кадр, который снимает камеры наблюдения. Пока что будет 10 кадров в сек

    private  String id;
    private String name;   //  в имени будет зашит время кадра и камера, которая его сняла
    private LocalDateTime time;  //    время съема кадра. Точность милисекунды.
    private Camera camera;        //  камера, кторая сделала этот кадр
    private Path path;            // папка, которая хранит этот JPEG кадр.

}
