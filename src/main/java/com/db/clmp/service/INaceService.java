package com.db.clmp.service;

import com.db.clmp.data.nacedb;

import java.util.List;

public interface INaceService {
    public List<nacedb> findAll ();
    public nacedb findById (long id);
    public void save (nacedb inputObject);
}

