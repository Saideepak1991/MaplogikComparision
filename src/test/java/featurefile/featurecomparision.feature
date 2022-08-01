
@tag
Feature: skill comparision for each students 

  @college
  Scenario: skill comparision in college level
  
    Given login with student url 
    When login with students in "college" and skill comparision
    Then logout dashboard 
    
     @district
    Scenario: skill comparision in district level
  
     Given login with student url  
     When login with multiple students in "district" and skill comparision
     Then logout dashboard
     
   @state
    Scenario: skill comparision in state level
   
     Given login with student url 
    When login students in "state" and skill comparision
    Then logout dashboard
   