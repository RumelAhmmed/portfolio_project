package com.rumel.portfolio.controller;

import com.rumel.portfolio.model.Project;
import com.rumel.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping
    public String viewProjects(Model model) {
        model.addAttribute("listProjects", service.listAll());
        return "projects/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("project", new Project());
        return "projects/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("project") Project project) {
        service.save(project);
        return "redirect:/projects";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("project", service.get(id));
        return "projects/edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/projects";
    }
}