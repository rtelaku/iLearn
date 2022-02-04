package com.example.ilearn.controller;


import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.model.Course;
import com.example.ilearn.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")

public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{courseID}")
    public GeneralResponse<Course> getCourse(@PathVariable int courseID){
        Course course = courseService.getCourseByID(courseID);
        if(course==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(course).build();
    }
    @GetMapping("/cid/{courseid}/coursename/{cname}")
    public GeneralResponse<Course> getCourse(@PathVariable String courseID,@PathVariable String name){
        Course c=courseService.getCourseByIDAndName(courseID,name);
        if(c==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(c).build();
    }

}

