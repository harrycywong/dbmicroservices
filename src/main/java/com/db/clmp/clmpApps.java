package com.db.clmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8099/getNaceDetails/399475
// http://localhost:8099/getNaceDetails/all

@SpringBootApplication
public class clmpApps
{
    private static final Logger log = LoggerFactory.getLogger(clmpApps.class);

    public static void main( String[] args )
    {
        SpringApplication.run (clmpApps.class, args);
    }
}
