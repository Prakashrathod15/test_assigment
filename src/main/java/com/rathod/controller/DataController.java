package com.rathod.controller;


@RestController
@RequestMapping("/api/data")
public class DataController {
 @Autowired
 private DataRepository dataRepository;
 
 @GetMapping
 public List<DataEntity> getAllData() {
   
 }
 

}
