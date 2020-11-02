Feature: Validation the transactions manangmen of the customer
  Scenario: (A) Validate invalids status
    Given A transaction that is not stored in our system reference is 44444 and "{CLIENT}"
    When I check the status from any channel
    Then The system returns the status "INVALID"

  Scenario: (B) Before day ATM OR CLIENT
    Given A transaction that is stored in our system with the  reference is 47647457 and "CLIENT"
    When I check the status from CLIENT or ATM channel
    And the transaction date is before today
    Then The system returns the status "SETTLED"
    And the amount substracting the fee

  Scenario:  (C) Before day INTERNAL
    Given A transaction that is stored in our system with the  reference is 47647457 and "INTERNAL"
    When I check the status from "SETTLED" channel
    And the transaction date is before today
    Then The system returns the status 'SETTLED'
    And the amount
    And the fee

   Scenario: (D) Today ATM or CLIENT 03/11
    Given A transaction that is stored in our system with the  reference is 9764567 and "ATM"
    When I check the status from CLIENT or ATM channel
    And the transaction date is equals to today
    Then The system returns the status 'PENDING'
    And the amount substracting the fee

   Scenario: (E) Today INTERNAL 03/11
    Given A transaction that is stored in our system with the  reference is 9764567 and "INTERNAL"
    When I check the status from PENDING channel
    And the transaction date is equals to today
    Then The system returns the status 'PENDING'
    And the amount
    And the fee

   Scenario: (F) greater than Today CLIENT
    Given A transaction that is stored in our system with the  reference is 34982 and "CLIENT"
    When I check the status from CLIENT channel
    And the transaction date is greater than today
    Then The system returns the status 'FUTURE'
    And the amount substracting the fee

  Scenario: (G) greater than Today ATM
    Given A transaction that is stored in our system with the  reference is 34982 and "ATM"
    When I check the status from ATM channel
    And the transaction date is greater than today
    Then The system returns the status 'PENDING'
    And the amount substracting the fee

  Scenario: (H) greater than Today INTERNAL
    Given A transaction that is stored in our system with the  reference is 34982 and "INTERNAL"
    When I check the status from INTERNAL channel
    And the transaction date is greater than today
    Then The system returns the status 'FUTURE'
    And the amount
    And the fee