#Sample Feature Definition Template
@tag
Feature: Register to a page
  I want to go to mypage and regiter

  @MercuryRegtest
  Scenario: Positive Registration
    Given I go to "mercuryUrl"
    And I click the "registration_Link" Element
    And I enter "MD" in "firstname_inputBox"
    And I enter "Rasul" in "lastname_inputBox"
    And I enter "id" in "id_inputBox"
    And I enter "password" in "password_inputBox"
    And I enter "Confirmpassword" in "Confirmpassword_inputBox"
    And I click the "submit_Button" Element
    Then I validate "Register: Mercury Tours" Page Title
    And I validate Text "Dear MD Rasul," on "MercuryWellComeCusomer_Lavel"
    
    
 @PositiveLogin
  Scenario: Positive Login
    Given I go to "mercuryUrl"
    And I enter "arhimel" in "userid_inputBox"
    And I enter "mayaaa" in "User_password_inputBox"
    And I click the "login_Button" Element
    Then I validate "Find a Flight: Mercury Tours:" Page Title
    And I validate Text "Flight  Details" on "FlightDetails_Lavel"
    
    
    
    
#@NegativeLogin
#Scenario: Negetive Login  
#Given I go to "mercuryUrl"
	#And I enter "wrongid" in "userid_inputBox" 
	#And I enter "wrongpassword" in "password_inputBox" 
	#And I click the "login_Button" Element
#Then I validate "Sign-on: Mercury Tours" Page Title
#And  I validate Text "If you don't have a log-in" on "Signin_label"
    