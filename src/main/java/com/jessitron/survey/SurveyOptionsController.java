package com.jessitron.survey;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController
public class SurveyOptionsController {

    @RequestMapping(path = "/surveyOptions")
    public SurveyOptions surveyOptions(
            @RequestParam(value = "seed") String seedStr,
            @RequestParam(value = "count", defaultValue = "4") String countStr) {
        System.out.println("I HAVE ENTERED THE METHOD");
        return new SurveyOptions(1, 2, new LinkedList<>());
    }
}
