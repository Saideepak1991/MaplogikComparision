
@tag
Feature: skill comparision for students 

  
  Scenario Outline: skill comparision in college level
  
    Given login with student credential "<studentid>" and "<phonenumber>" 
    Then compare the overall position skill field with skill comparision indicator in training field in college level
    And logout dashboard
     
    Examples:
    | studentid | phonenumber |
    | 4RECSC0603 | 9092323050 |
    | 4RECSC0602 | 9342307323 |
    | 4RECSC0604 | 9944557479 |
    
  
    Scenario Outline: skill comparision in district level
  
     Given login with student credential "<studentid>" and "<phonenumber>" 
     Then compare the overall position skill field with skill comparision indicator in training field in district level
     And logout dashboard
    
    Examples:
    | studentid | phonenumber |
    | 4RECSC0603 | 9092323050 |
    | 4RECSC0602 | 9342307323 |
    | 4RECSC0604 | 9944557479 |
    
      @tag1
    Scenario Outline: skill comparision in state level
   
     Given login with student credential "<studentid>" and "<phonenumber>"  
    Then compare the overall position skill field with skill comparision indicator in training field in state level
    And logout dashboard
    Examples:
    | studentid | phonenumber |
    | 4RECSC0603 | 9092323050 |
    | 4RECSC0602 | 9342307323 |
    | 4RECSC0604 | 9944557479 |
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    