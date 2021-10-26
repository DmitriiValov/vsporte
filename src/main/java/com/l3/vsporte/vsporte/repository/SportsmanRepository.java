package com.l3.vsporte.vsporte.repository;

import com.l3.vsporte.vsporte.entity.Sportsman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsmanRepository extends JpaRepository<Sportsman, Integer> {
}
