package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long>{

}
