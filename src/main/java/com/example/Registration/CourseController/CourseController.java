package com.example.Registration.CourseController;

import com.example.Registration.Dto.CourseDTO;
import com.example.Registration.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping(path = "/save")
    public String saveCourse(@RequestBody CourseDTO courseDTO) {
        String id = courseService.addCourse(courseDTO);
        return id;
    }
}
