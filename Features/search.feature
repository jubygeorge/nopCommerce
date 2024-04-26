Feature: Search page functionalities

  #Scenario Outline: Search using valid search item
    #Given User enter "<searchtext>" in the search box
    #the word in the <>should be same as in examples eg:Don't use <search text> and in examples searhtext
    #Use in quotes to get string for all 
    #And User clicks search button
    #Then User will see a search section with the search keyword
    #And Search item will be displayed to the user
#
 #
    #Examples: 
      #| searchtext  | 
      #|Digital Storm VANQUISH 3 Custom Performance PC|
      #|Flower Girl Bracelet|

 Scenario: Accessing the top level menu items
    Given User is browsing the nopCommerce menu items
    Then User will be able to view the top level menu items 