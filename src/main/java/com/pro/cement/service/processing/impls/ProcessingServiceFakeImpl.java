package com.pro.cement.service.processing.impls;

import com.pro.cement.model.Cadr;
import com.pro.cement.model.Processing;
import com.pro.cement.service.cadr.impls.CadrServiceFakeImpl;
import com.pro.cement.service.processing.interfaces.IProcessingService;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProcessingServiceFakeImpl implements IProcessingService {

    @Autowired
    CadrServiceFakeImpl cadrService;

    public String identify() throws IOException {
      //  Cadr cadr = cadrService.get(cadrId);
        //Path pathname = cadr.getUrl();

        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
    //    String url = "/home/george/IdeaProjects/cement/storage/c1.png";
        /*String url = userDirectory + "/storage/c1.png";
        BufferedImage image = ImageIO.read(new File(url));
        System.out.println(image.getHeight());
        */

        Set<String> nameFile = this.listFilesUsingJavaIO(userDirectory + "/storage");
        System.out.println(nameFile);
        for (String item : nameFile) {
            String url = userDirectory + "/storage/" + item;
            BufferedImage image = ImageIO.read(new File(url));
            System.out.println(image.getHeight());
        }

        return "success";
    }

    public Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
    }


    @Override
    public Processing create(Processing processing) {
        return null;
    }

    @Override
    public Processing get(String id) {
        return null;
    }

    @Override
    public Processing update(Processing processing) {
        return null;
    }

    @Override
    public Processing delete(String id) {
        return null;
    }

    @Override
    public List<Processing> getAll() {
        return null;
    }
}
