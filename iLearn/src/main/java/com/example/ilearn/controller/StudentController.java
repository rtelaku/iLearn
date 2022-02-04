package com.example.ilearn.controller;


import com.example.ilearn.helper.EnrollHelper;
import com.example.ilearn.helper.GeneralResponse;
import com.example.ilearn.helper.LoginHelper;
import com.example.ilearn.model.Student;
import com.example.ilearn.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/student")

public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping()
    public GeneralResponse getAllStudents(){
        List<Student> studentList=this.studentService.getAllStudents();
        if(studentList==null){
            return new GeneralResponse.GeneralResponseBuilder(401).setError("Exception on something").build();
        }
        return new GeneralResponse.GeneralResponseBuilder<>(201).setMessage("succefullyDone").setData(studentList).build();
    }


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginHelper login){
        Student student =this.studentService.login(login.getUsername(),login.getPassword());
        if(student==null){
            return ResponseEntity.notFound().build(); // qikjo e kallxon qe nuk eshte gjete qeky student
            //nese eshte null
        }

        return ResponseEntity.ok(student); //kjo ia kthen nese e gjene studentin
    }


    @PostMapping("/add")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }


    @PostMapping("/enrollStudent")
    public void enrollSTD(@RequestBody EnrollHelper enrollHelper){
        this.studentService.enroll(enrollHelper);
    }
}

