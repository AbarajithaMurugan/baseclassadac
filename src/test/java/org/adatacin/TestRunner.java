package org.adatacin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
   @CucumberOptions(features="C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\BaseclassAdatacin\\src\\test\\resources\\Booking.feature",glue= {"org.adatacin"})
public class TestRunner {

}

