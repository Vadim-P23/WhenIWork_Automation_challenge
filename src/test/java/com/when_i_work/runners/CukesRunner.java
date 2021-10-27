package com.when_i_work.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report3.html",
                "json:target/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = "com/when_i_work/step_definitions",
        dryRun = false,
        tags = "@smoke"
)

public class CukesRunner {



}
