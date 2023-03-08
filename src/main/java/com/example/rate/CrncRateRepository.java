package com.example.rate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CrncRateRepository extends JpaRepository<CrncRate, String> {
    List<CrncRate> findAll();
}