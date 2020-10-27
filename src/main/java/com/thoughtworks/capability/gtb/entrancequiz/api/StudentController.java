package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Team;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
  @Autowired
  StudentService studentService;

  @GetMapping("/students")
  @CrossOrigin(origins = "http://localhost:1234")
  public List<Student> getStudentsList(){
    List<Student> studentList = new ArrayList<Student>();
    studentList = studentService.getStudentsList();
    // return ResponseEntity.ok().body(studentList);
    return studentList;
  }

  @GetMapping("/teams")
  @CrossOrigin(origins = "http://localhost:1234")
  public List<Team> getTeamsList(){
    List<Team> teamList = new ArrayList<Team>();
    teamList = studentService.getTeamsList();
    return teamList;
  }
}
