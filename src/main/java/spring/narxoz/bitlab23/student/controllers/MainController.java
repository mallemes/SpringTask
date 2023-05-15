package spring.narxoz.bitlab23.student.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.narxoz.bitlab23.student.db.DBManager;
import spring.narxoz.bitlab23.student.db.models.Student;

import java.util.ArrayList;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/add-student")
    public String addStudentView() {
        return "add-student";
    }

    @PostMapping("/add-student")
    public String addStudent(Student student) {
        DBManager.addStudent(student);

        return "redirect:/";
    }
}
