package com.miracle.testreptile.controller;

import com.miracle.testreptile.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Miracle
 * @date 2019/12/24 14:27
 */
@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/get")
    public String getData(){
        applicantService.getAndSaveApplicant();
        return "success";
    }
}
