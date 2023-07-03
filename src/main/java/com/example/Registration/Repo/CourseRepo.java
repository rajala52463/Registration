package com.example.Registration.Repo;
import com.example.Registration.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
}
