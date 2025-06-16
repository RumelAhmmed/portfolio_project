package com.rumel.portfolio.service;

import com.rumel.portfolio.model.Project;
import com.rumel.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository repo;

    public List<Project> listAll() {
        return repo.findAll();
    }

    public void save(Project project) {
        repo.save(project);
    }

    public Project get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}