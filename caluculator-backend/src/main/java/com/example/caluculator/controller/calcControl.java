package com.example.caluculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class calcControl {
    calcService service = new calcService();

    @GetMapping(value = "/{a}/{op}/{b}")
    public String calculateBin (@PathVariable double a,@PathVariable String op,@PathVariable double b){
        return service.solve(a,op,b);
    }

    @GetMapping(value = "/{a}/{op}")
    public String calculateUn (@PathVariable double a,@PathVariable String op){
        return service.solveUn(a,op);
    }
}
