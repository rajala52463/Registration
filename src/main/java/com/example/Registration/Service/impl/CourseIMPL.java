package com.example.Registration.Service.impl;

import com.example.Registration.Dto.CourseDTO;
import com.example.Registration.Entity.Course;
import com.example.Registration.Repo.CourseRepo;
import com.example.Registration.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseIMPL implements CourseService {
    @Autowired
    private CourseRepo courseRepo;
    @Override
    public String addCourse(CourseDTO courseDTO) {

        Course course = new Course(
                courseDTO.getCourseid(),
                courseDTO.getText(),
                courseDTO.getTel(),
                courseDTO.getUrl(),
                courseDTO.getEmail(),
                courseDTO.getLocation(),
                courseDTO.getTextarea()
        );

        courseRepo.save(course);

        return course.getText();
    }
}
