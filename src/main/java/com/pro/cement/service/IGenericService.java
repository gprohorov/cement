package com.pro.cement.service;

import net.sourceforge.tess4j.TesseractException;

import java.io.IOException;
import java.util.List;

public interface IGenericService<T> {

    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll() throws IOException, TesseractException;



}
