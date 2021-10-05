package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\WIN\\eclipse-workspace\\AdactinCucuProj\\src\\test\\resources\\FeatureFiles\\adactin.feature", glue="org.stepdefinition")


public class TestRunner {

}
