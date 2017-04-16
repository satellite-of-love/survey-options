package com.jessitron.survey;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SurveyOptionsControllerTest {
    SurveyOptionsController subject = new SurveyOptionsController();

    @Test
    public void optionsHavePlaces() {
        List<SurveyOption> result = subject.surveyOptions(123, 2).getOptions();
        assertTrue("the first option is " + result.get(0), 1 == result.get(0).getPlace());
        assertTrue("the first option is " + result.get(1), 2 == result.get(1).getPlace());

    }
}