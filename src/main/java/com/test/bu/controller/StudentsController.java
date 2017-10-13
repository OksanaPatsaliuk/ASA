package com.test.bu.controller;


import com.test.bu.entity.Students;
import com.test.bu.service.interfaces.IService;
import com.test.bu.service.interfaces.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentsController {

    /**
     *
     */
    @Autowired
    private StudentsService studentsService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("students", studentsService.getById(id));
        if (edit) {
            return "editStudents";
        } else {
            return "showStudents";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("students", studentsService.getAll());
        return "studentsList";
    }

    @GetMapping("/create")
    public String createPage() {
        return "createStudentsForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Students students) {
        studentsService.save(students);
        return "redirect:/students/all";
    }


    @PostMapping("/update")
    public String update(@ModelAttribute Students students) {
        studentsService.update(students);
        return "redirect:" + students.getId() + "?edit=false";



    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        studentsService.delete(id);
        return "redirect:/students/all";
    }

}
