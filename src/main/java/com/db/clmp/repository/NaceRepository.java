package com.db.clmp.repository;

import com.db.clmp.data.nacedb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaceRepository extends JpaRepository<nacedb, Long> {

}
