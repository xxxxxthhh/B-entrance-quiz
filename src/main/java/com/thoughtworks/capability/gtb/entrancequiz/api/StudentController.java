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
  // TODO GTB-知识点: - 建议使用构造方法注入bean，并声明为final
  // TODO GTB-工程实践: - 建议使用private，遵循最小访问原则
  @Autowired
  StudentService studentService;

  @GetMapping("/students")
  @CrossOrigin(origins = "http://localhost:1234")
  public List<Student> getStudentsList(){
    List<Student> studentList = new ArrayList<Student>();
    studentList = studentService.getStudentsList();
    // TODO GTB-工程实践: - 及时清理无用代码
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
