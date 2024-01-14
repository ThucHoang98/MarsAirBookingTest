package Runners;

import io.cucumber.java.BeforeAll;

public class CucumberHooks {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }
}
