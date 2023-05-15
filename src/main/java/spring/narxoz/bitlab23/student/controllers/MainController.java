package spring.narxoz.bitlab23.student.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
