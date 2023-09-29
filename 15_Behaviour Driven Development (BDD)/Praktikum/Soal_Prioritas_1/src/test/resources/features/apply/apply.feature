Feature: Job Search
  As a user
  I want to find a job
  so that i can get the detail of job

  Scenario: Success search job by title
    Given  I want to button job search
    When  I input job title on button search job title
    And Click the job on button search
    Then i can see list of job based on title that i input

  Scenario: Success search job by city
    Given I want to button job search
    When I input the city name on button search job by city
    And Click the city on button search
    Then i can see list of job based on city that i input

  Scenario:  Success search job by city and title
    Given I want to button job search
    When I input job title and job city of job
    And tab enter
    Then I can see the list of job based on job city and job title that i want

  Scenario:  Success search job by history
    Given I want to button job search
    When I click the job which in history tab
    Then I can see the list of job based on the history that i choose