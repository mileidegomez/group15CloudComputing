package com.cloudcomputing.gamelist.app.controller;


import com.cloudcomputing.gamelist.app.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Vapor/Reporting")
public class ReportingController {

    @Autowired
    private ReportRepository reportRepository;

/*    @GetMapping("/Searches/{platform}")
    public ResponseEntity<List<GameEntity>> getPlatformReporting(){
        ReportingEntity report = reportRepository.findById()
    } */

}
