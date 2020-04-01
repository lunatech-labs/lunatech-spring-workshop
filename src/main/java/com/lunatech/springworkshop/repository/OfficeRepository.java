package com.lunatech.springworkshop.repository;

import com.lunatech.springworkshop.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {

}
