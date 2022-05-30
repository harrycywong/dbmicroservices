package com.db.clmp.Controller;

import com.db.clmp.data.nacedb;
import com.db.clmp.service.INaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@Controller
public class clmpController {
    @Autowired
    private INaceService naceService;
    private static final Logger log = LoggerFactory.getLogger(clmpController.class);

    public clmpController (INaceService naceService) {
        this.naceService = naceService;
    }

    @GetMapping("/api/getNaceDetails/{id}")
    public nacedb getNACE (@PathVariable long id) {
        nacedb result = null;

        try {
            result =naceService.findById(id);
        } catch (Exception e) {
            log.error (e.getMessage());
        }

        return result;
    }

    @GetMapping("/api/getNaceDetails/all")
    public List<nacedb> getAllNACE () {
        List<nacedb> result = (List<nacedb>) naceService.findAll();
        log.info (result.toString());
        return result;

    }

    @RequestMapping (value = "/api/putNaceDetails", method = RequestMethod.POST)
    public ResponseEntity<nacedb> create(@RequestBody nacedb inputvalue) throws URISyntaxException {
        log.info("Received JSON...");
        log.info (inputvalue.toString());

        naceService.save(inputvalue);
        nacedb result = new nacedb();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

}