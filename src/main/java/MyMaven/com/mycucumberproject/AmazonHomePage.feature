#Sample Feature Definition Template
@tag
Feature: Amazon Home Page Smoke Test
  I want to quikly test some Basic Fearure of amazon home page

   
  @AmazonSearchList
  Scenario: Search and See the Result List
    Given I go to "amazonurl"
    #And I Select "Beauty & Personal Care" From "SearchInDropDown"
    And I enter "Isseymiyake" in "AmazonSearchTextBox"
    And I click the "GoButton" Element
    Then I validate List In "AmazonSearchListBox" has text "Joop"



  @AmazonSearchListAndGoToDetailsPage
  Scenario: Search and Click First item of result and validate details page
    Given I go to "amazonurl"
    #And I Select "Beauty & Personal Care" From "SearchInDropDown"
    And I enter "joop perfume" in "AmazonSearchTextBox"
    And I click the "GoButton" Element
    Then I validate List In "AmazonSearchListBox" has text "Joop"
    And I click "Item : 1" from "AmazonSearchListBox"
                                                      