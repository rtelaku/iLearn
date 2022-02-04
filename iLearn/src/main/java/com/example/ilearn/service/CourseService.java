package com.example.ilearn.service;


import com.example.ilearn.model.Course;
import com.example.ilearn.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {
    @Autowired
    public CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }

    public Course getCourseByID(int courseID){
        Optional<Course> courseOptional = courseRepository.findById(courseID);
        if(courseOptional == null)
            return null;

        return courseOptional.get();
    }
    public Course getCourseByIDAndName(String courseID,String name){
        Course course =courseRepository.findByCourseIDAndCourseName(courseID, name);
        return course;
    }
}
