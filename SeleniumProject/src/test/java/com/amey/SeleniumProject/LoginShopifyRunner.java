package com.amey.SeleniumProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/amey/feature/shopifyLogin.feature")
public class LoginShopifyRunner {

}