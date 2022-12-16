Feature: category

  @category
  Scenario Outline: As a user, I should able to nevigate to category page successfully
    When I  click on "<category_name>" link
    Then I should able to navigate to related "<category_link>" page successfully
    Examples:
      | category_name     | category_link    |
      | Computers         | computers        |
      | Electronics       | electronics      |
      | Apparel           | apparel          |
      | Digital downloads | digital-download |
      | Books             | books            |
      | Jewelry           | jewelry          |
      | Gift Cards        | gift-cards       |

