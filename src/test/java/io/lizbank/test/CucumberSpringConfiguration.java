package io.lizbank.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import io.lizbank.transactionapi.TransactionApiApplication;

@RunWith(Cucumber.class)
@CucumberContextConfiguration
@SpringBootTest(classes = {TransactionApiApplication.class, CucumberSpringConfiguration.class},webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
@CucumberOptions(plugin = {"pretty"}, tags = "", features = "classpath:features", glue = {"io.lizbank.test"})
public class CucumberSpringConfiguration {


}
