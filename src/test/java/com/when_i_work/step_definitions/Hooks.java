package com.when_i_work.step_definitions;

import com.when_i_work.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDownScenario() {
        Driver.closeDriver();
    }
}
