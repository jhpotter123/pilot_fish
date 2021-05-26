package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.Fish;

/**
 * Repository is needed by the FishService.
 * 
 * @author jeff
 */
@Repository
public interface FishRepository extends JpaRepository<Fish, Long> {
}
