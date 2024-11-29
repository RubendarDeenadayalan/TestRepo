package com.example.demo.resource;

import com.example.demo.details.StudentDetails;
import com.example.demo.model.Marks;
import com.example.demo.model.Student;
import com.example.demo.model.Subjects;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static com.example.demo.DemoApplication.createStudentInfo;

@RestController
@RequestMapping("/Student")
public class RestResource {

    @GetMapping("/getStudent")
    public List<Student> getStudent() {
        return createStudentInfo();
    }


    @GetMapping("/getStudentDetail/{id}")
    public StudentDetails getStudentDetails(@PathVariable("id") int id) {
        List<Student> students = createStudentInfo();
        StudentDetails studentDetails = processStudentsDetails(students, id);

        return studentDetails;
    }

    @GetMapping("/getStu")
    @ResponseBody()
    public String getStudentName() {
        return "Rubendar";

    }


    public StudentDetails processStudentsDetails(List<Student> students, int id) {

        StudentDetails studentDetails = new StudentDetails();

        Student studentInfo = students.stream()
                .filter(student -> student.getStudentNo() == id)
                .findAny()
                .get();

        studentDetails.setStudentName(studentInfo.getStudentName());
        if (studentInfo.getAddress() != null && studentInfo.getAddress().getAddressId() != null) {
            studentDetails.setAddressId(studentInfo.getAddress().getAddressId());
            studentDetails.setAddressName(studentInfo.getAddress().getAddressName());
        }
        studentDetails.setAge(studentInfo.getAge());


        Map<Subjects, BigDecimal> marksMap = new HashMap<>();

        if (studentInfo.getMarks().getMathsMark() != null)
            marksMap.put(Subjects.MATHS, studentInfo.getMarks().getMathsMark());
        else
            marksMap.put(Subjects.MATHS, new BigDecimal(0));
        marksMap.put(Subjects.PHYSICS, studentInfo.getMarks().getPhysicsMark());
        marksMap.put(Subjects.CHEMISTRY, studentInfo.getMarks().getChemistryMark());

        studentDetails.setSubjectsMarksMap(marksMap);
        return studentDetails;

    }

}

