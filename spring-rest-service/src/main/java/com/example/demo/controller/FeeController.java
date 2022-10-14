package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fee;
import com.example.demo.services.FeeService;

@RestController
@RequestMapping(path="/api/v1/fees")
@CrossOrigin(origins="*")
public class FeeController {



   @Autowired
    private FeeService service;
    
    @GetMapping
    public List<Fee> finAll(){
        return this.service.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public Fee findById(@PathVariable("id") int id)
    {
        return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found") );
    }
    
//    @GetMapping(path = "/srch/{branchName}")
//    public List<Fee> findByBranchName(@PathVariable("branchName") String branch) {
//        return this.service.findByBranch(branch);
//    }
    
    @PostMapping
    public ResponseEntity<Fee> add(@RequestBody Fee entity) throws URISyntaxException
    {
        Fee addedEntity = this.service.add(entity);
        int pkey = entity.getId();
        String uri = "/api/v1/fees"+pkey;
        return ResponseEntity.created(new URI(uri)).body(addedEntity);
    }
    
    @DeleteMapping(path="/{id}")
    public void deleteById(@PathVariable("id")int id) {
    	this.service.deleteById(id);
    }
    
    @PutMapping
    public ResponseEntity<Fee> update(@RequestBody Fee entity) 
    {
        Fee updatedEntity = this.service.update(entity);
        
        return ResponseEntity.ok().body(updatedEntity);
    }
}