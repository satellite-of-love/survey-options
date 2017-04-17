package com.jessitron;

import com.jessitron.survey.SurveyOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SurveyOptionsApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SurveyOptionsWebIntegrationTests {

    

    // Use this to run tests
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sampleTest() {
        String result = restTemplate.getForObject("/", String.class);
        System.out.println(result);
        assertTrue(result.contains("Hello"));
    }

    @Test
    public void optionsTest() {
        int count = 2; // todo: how can I use a URI template to populate this?
        int seed = 123;
        SurveyOptions result = restTemplate.getForObject("/" + "/surveyOptions?seed=123&count=2", SurveyOptions.class);
        assertEquals(count, result.getOptions().size());
        assertEquals(seed, result.getSeed());
    }

}
