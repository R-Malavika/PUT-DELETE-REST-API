package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;

import com.example.demo.service.ApiService;

@RestController

public class ApiController {

@Autowired //extends another class

ApiService stuService;

@PostMapping("/add")

public Student addInfo(@RequestBody Student st) {

return stuService.saveDetails(st);

}

@GetMapping("/show")

public List<Student>fetchDetails()

{

return stuService.getDetails();

}

@PutMapping("/Update")

public Student UpdateInfo(@RequestBody Student st1)

{

return stuService.UpdateDetails(st1);

}

@DeleteMapping("/Delete/{id}")

public String deleteInfo (@PathVariable("id")int id) {

stuService.deleteDetails(id);

return "Deleted details";

}
}