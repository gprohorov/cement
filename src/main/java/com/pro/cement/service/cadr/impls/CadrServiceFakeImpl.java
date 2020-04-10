package com.pro.cement.service.cadr.impls;

import com.pro.cement.dataset.TestData;
import com.pro.cement.model.Cadr;
import com.pro.cement.service.cadr.interfaces.ICadrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadrServiceFakeImpl implements ICadrService {

    private final TestData data;

    @Autowired
    public CadrServiceFakeImpl(TestData data) {
        this.data = data;
    }

    @Override
    public Cadr create(Cadr cadr) {
        return null;
    }

    @Override
    public Cadr get(String id) {
        return null;
    }

    @Override
    public Cadr update(Cadr cadr) {
        return null;
    }

    @Override
    public Cadr delete(String id) {
        return null;
    }

    @Override
    public List<Cadr> getAll() {
        return null;
    }
}
