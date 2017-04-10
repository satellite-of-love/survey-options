package com.jessitron.survey;

import java.util.List;

public class SurveyOptions {

    public final int seed;
    public final int count;
    public final List<SurveyOption> options;

    public SurveyOptions(int seed, int count, List<SurveyOption> options) {
        this.seed = seed;
        this.count = count;
        this.options = options;
    }
}
