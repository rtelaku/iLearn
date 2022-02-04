package com.example.ilearn.repository;


import com.example.ilearn.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    @Query("select c from Course c where c.courseID=?1 and c.courseName=?2")
    Course findByCourseIDAndCourseName(String courseID, String courseName);
}
