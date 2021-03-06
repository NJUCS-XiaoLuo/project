package com.mycompany.myapp.controller;

import com.mycompany.myapp.domain.Record;
import com.mycompany.myapp.repository.RecordRepository;
import com.mycompany.myapp.service.IProjectService;
import com.mycompany.myapp.vo.FormVO;
import com.mycompany.myapp.vo.RecVO;
import com.mycompany.myapp.vo.ResponseVO;
import com.mycompany.myapp.vo.TaskVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class ProjectController {
    @Autowired
    IProjectService projectService;

    @PostMapping("/registerProject")
    public ResponseVO registerProject(@RequestBody FormVO formVO){
        return projectService.registerProject(formVO);
    }

    @GetMapping("/userProject/{userId}")
    public ResponseVO getUserProject(@PathVariable("userId") String userId){
        return projectService.userProject(userId);
    }

    @RequestMapping(value = { "test" }, method = { RequestMethod.GET }, produces="image/svg+xml; charset=utf-8")
    public String test(){
        return "<h3>hello</h3>";
    }
}
