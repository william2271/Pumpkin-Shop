package com.pumpkin.demo.repositories;

import com.pumpkin.demo.models.Pumpkin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PumpkinRepository extends JpaRepository<Pumpkin, Integer> {
    //custom repository  just in case,thhinking
}