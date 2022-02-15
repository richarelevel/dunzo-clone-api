package com.api.dunzoclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.dunzoclone.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>    {

}
