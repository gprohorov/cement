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

@Service
public class ProcessingServiceFakeImpl implements IProcessingService {

    @Autowired
    CadrServiceFakeImpl cadrService;

    public String identify() throws IOException {
      //  Cadr cadr = cadrService.get(cadrId);
        //Path pathname = cadr.getUrl();
        String url = "/storage/c1.png";

        BufferedImage image = ImageIO.read(new File(url));
        System.out.println(image.getHeight());

        return "success";
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
