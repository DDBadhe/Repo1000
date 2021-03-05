Feature: foreign exchange

  Scenario: Rate API
    Given API for foreign exchange
    When posted with correct information
    Then validate positive response code received
 
