package com.test.bu.controller;

import com.test.bu.entity.Subjects;
import com.test.bu.service.interfaces.StudentsService;
import com.test.bu.service.interfaces.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;

@Controller
@RequestMapping("/subjects")
public class SubjectsController {

    @Autowired
    private SubjectsService subjectsService;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, @RequestParam(value = "edit", required = false) boolean edit, Model model) {
        model.addAttribute("subjects", subjectsService.getById(id));
        if (edit) {
            return "editSubjects";
        } else {
            return "showSubjects";
        }
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("subjects", subjectsService.getAll());
        return "subjectsList";

    }

    @GetMapping("/create")
    public String createPage() {
        return "createSubjectsForm";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Subjects subjects) {
        subjectsService.save(subjects);
        return "redirect:all";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Subjects subjects) {
        subjectsService.update(subjects);
        return "redirect:" + subjects.getId() + "?edit=false";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        subjectsService.delete(id);
        return "redirect:/all";
    }
}
