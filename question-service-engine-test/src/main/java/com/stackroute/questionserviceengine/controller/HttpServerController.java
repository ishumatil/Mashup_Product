//package com.stackroute.questionserviceengine.controller;
//
//
//import com.stackroute.questionserviceengine.domain.Question;
//import com.stackroute.questionserviceengine.service.HttpServer;
//import com.stackroute.questionserviceengine.service.QuestionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//import java.util.List;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("api/v1")
//public class HttpServerController {
//    @Autowired
//    private HttpServer httpServer;
//    @Autowired
//    private QuestionService quesService;
//    static List<Question> questions;
//    @RequestMapping(value = "postAllQuestion")
//    public ResponseEntity<> postAllQuestion() throws IOException {
//        questions = quesService.findAll();
//        return new ResponseEntity<Void,?>(httpServer.sendPOST(), HttpStatus.OK);
//    }
//}
//
////    GetQuestionsSeedData(, requestByUserId)
////    {
////        // Call GetUserFavoritesServiceMethod() OR GetUserFavoritesRepositoryMethod()
////    }