package com.db.clmp.service;

import com.db.clmp.data.nacedb;
import com.db.clmp.repository.NaceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaceService implements  INaceService {
    @Autowired
    private NaceRepository repository;

    private static final Logger log = LoggerFactory.getLogger(NaceService.class);

    public NaceService (NaceRepository repository) {
        this.repository = repository;
    }

    public List<nacedb> findAll () {
        log.info("try to findAll");
        return (List<nacedb>) repository.findAll();
    }

    public nacedb findById (long id) {
        log.info("try to find by id");
        nacedb result = repository.getById(id);

        if (result == null) {
            log.info("result is null");
        } else {
            log.info (result.toString());
        }

        return result;
    }

    public void save (nacedb inputObject) {
        repository.save(inputObject);
    }
}
