//                                ASSIA, Inc.
//                                Copyright
//                      Confidential and Proprietary
//                          ALL RIGHTS RESERVED.
//
//       http://www.assia-inc.com, +1.650.654.3400
//
//       This software is provided under license and may be used,
//       copied, distributed (with or without modification), or made
//       available to the public, only in accordance with the terms
//       of such license.
//
package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.persistence.DoctorRepository;

@RestController
public class DoctorController {
    
    private final DoctorRepository repository;

    public DoctorController(DoctorRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return (List<Doctor>) repository.findAll();
    } 
    
    @PostMapping("/doctors")
    public void addUser(@RequestBody Doctor doctor) {
        repository.save(doctor);
    }
    
}
