package com.pro.cement.service.processing.impls;

import com.pro.cement.model.Processing;
import com.pro.cement.service.cadr.impls.CadrServiceFakeImpl;
import com.pro.cement.service.processing.interfaces.IProcessingService;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;


import net.sourceforge.tess4j.Tesseract;

@Service
public class ProcessingServiceFakeImpl implements IProcessingService {

    @Autowired
    CadrServiceFakeImpl cadrService;

    private final Tesseract tesseract;
    private final     String testdata;
    private final     String dir;

    public ProcessingServiceFakeImpl() {
        String userDirectory = new File("").getAbsolutePath();
        this.testdata  = userDirectory + "/testdata";
        this.tesseract =  new Tesseract();
        this.dir = userDirectory + "/storage";
        tesseract.setDatapath(this.testdata);
        tesseract.setLanguage("digits_comma");
      //  tesseract.setPageSegMode(1);
       // tesseract.setOcrEngineMode(1);
    }


    public String identifyOne(String img) throws IOException, TesseractException {

        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
        String url = this.dir + "/" + img;
       // BufferedImage image = ImageIO.read(new File(url));
        //System.out.println(image.getHeight());

        return this.thesaurus(url);
    }

    private String thesaurus(String url) throws TesseractException {
        File file = new File(url);
        String text  = tesseract.doOCR(file);

        if (text != null) {
            text = text.replace(" ","");
        }

        return (text != null) ? text : "File not found";
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
