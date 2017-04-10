package com.jessitron;

import com.jessitron.survey.SurveyOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.jessitron.InitializedStringMap.mapOf;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SurveyOptionsApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class SurveyOptionsWebIntegrationTests {

    private static final int PORT = 8080;

    // Parameterize tests like this
    private static final String BASE_PATH = "http://localhost:" + PORT;

    // Use this to run tests
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void sampleTest() {
        int count = 2;
        SurveyOptions result = restTemplate.getForObject(BASE_PATH + "/surveyOptions", SurveyOptions.class, mapOf("seed", "123", "count", "" + count));
        assertEquals(count, result.options.size());
    }

}
