package com.stackroute.questionserviceengine.controller;

import com.stackroute.questionserviceengine.domain.Question;
import com.stackroute.questionserviceengine.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@CrossOrigin("*")
@RequestMapping("api/v1")
public class ServiceController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping(value = "questions")
    public ArrayList<Question> listquestions(){
        System.out.println("List of Questions"+questionService.findAll());

       return questionService.findAll();
    }
//    @RequestMapping("/sendData")
//    public List<Questions>
//    public String url="http://172.23.239.78:8090/api/v1/question";

    // sendPOST();
//        System.out.println("POST DONE");

    @RequestMapping(value="rest/neo4j/question")
    public ArrayList<Question> listOFQuestions(){
        return questionService.findAll();
    }


}


