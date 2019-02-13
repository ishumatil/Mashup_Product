package com.stackroute.questionserviceengine.domain;

import lombok.Data;

@Data
public class Question {

    int questionId;
    String questionTitle;
    String questionDescription;
    String inputFormat;
    String outputFomat;
    String difficulty;
    String tags;
    String gitUrl;

    public Question( int questionId,String questionTitle,String questionDescription,String inputformat,String outputFomat,
            String difficulty,
            String tags,
            String gitUrl) {

        this.questionTitle = questionTitle;
        this.questionId = questionId;
        this.questionDescription=questionDescription;
        this.inputFormat=inputformat;
        this.outputFomat=outputFomat;
        this.difficulty= difficulty;
        this.tags= tags;
        this.gitUrl= gitUrl;
    }

}
