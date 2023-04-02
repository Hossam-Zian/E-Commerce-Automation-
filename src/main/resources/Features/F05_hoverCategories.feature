@smoke
  Feature: hover Categories Feature
    Scenario: user hover on one of main categories then click on sub category
      Given user at home page
      And there are 3 main categories contains sub-categories
      When user hoover random one of the three main categories
      And user select & open random one of the three sub categories
      Then user should see sub-category title he selected randomly

