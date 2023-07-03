package com.example.Registration.Repo;

import com.example.Registration.Dto.AcademyDTO;
import com.example.Registration.Entity.Academy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AcademyRepo extends JpaRepository<Academy,Integer> {



}
