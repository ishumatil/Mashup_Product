package com.stackroute.questionserviceengine.service;

import com.opencsv.CSVReader;
import com.stackroute.questionserviceengine.domain.Question;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final ArrayList<Question> questions;
    public QuestionServiceImpl()
    {
        questions=new ArrayList<>();
    }


    public   ArrayList<Question> findAll() {
        FileInputStream fis = null;
//        try{
//            int i = Integer.parseInt(input);
//        }catch(NumberFormatException ex){ // handle your exception
//        ...
//        }
        try {
            String filename = "/home/user/Desktop/question-service-engine/src/main/resources/mashup_ques.csv";
            fis = new FileInputStream(new File(filename));
            System.out.println("In fis"+fis);
            CSVReader reader = new CSVReader(new InputStreamReader(fis));
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {

                Question newQuestion = new Question(Integer.valueOf(nextLine[0]), nextLine[1], nextLine[2], nextLine[3], nextLine[4], nextLine[5], nextLine[6], nextLine[7]);
//                System.out.println("New question:"+newQuestion);
                questions.add(newQuestion);
//                System.out.println("Questions Service"+questions);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "Error aa gea", ex);
        } catch (IOException ex) {
            Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "hie severe error", ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(QuestionServiceImpl.class.getName()).log(Level.SEVERE, "bhootni", ex);
            }
        }
        return questions;}
    }

