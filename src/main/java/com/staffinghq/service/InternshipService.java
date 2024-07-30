package com.staffinghq.service;

import com.staffinghq.entity.Internship;
import com.staffinghq.repository.InternshipRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    private final InternshipRepository internshipRepository;

    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<Internship> getAll() {
        return this.internshipRepository.findAll();
    }

    public Internship getById(Long id) {
        return this.internshipRepository.findById(id).orElse(null);
    }
}