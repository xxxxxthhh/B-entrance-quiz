package com.thoughtworks.capability.gtb.entrancequiz.service;

// TODO GTB-工程实践: - 没有用到的import及时删除
import com.sun.javafx.text.TextLine;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
  public List<Student> getStudentsList(){
    List<Student> studentList = builtStuList();
    return studentList;
  }

  public List<Team> getTeamsList(){
    return null;
  }

  private List<Student> builtStuList() {
    List<Student> studentList = new ArrayList<Student>();
    int stuId = 1;

    String[] names = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月",
        "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
    for (String name : names) {
        studentList.add(new Student(stuId,name));
        stuId += 1;
    }

    return studentList;
  }
}
