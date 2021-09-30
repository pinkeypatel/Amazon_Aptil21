package in.amazon.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Driver;

public class BeforeAfter extends Driver {

    @Before
    public void setUp(Scenario scenario){
        Driver.init();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
