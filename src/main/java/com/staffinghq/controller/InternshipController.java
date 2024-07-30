package com.staffinghq.controller;

import com.staffinghq.entity.Internship;
import com.staffinghq.service.InternshipService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/internships")
public class InternshipController {
    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Internship>> getAll() {
        return ResponseEntity.ok(this.internshipService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Internship> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.internshipService.getById(id));
    }
}